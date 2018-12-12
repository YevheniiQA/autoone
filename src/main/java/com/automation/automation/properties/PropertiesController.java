package com.automation.automation.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

import com.automation.automation.logging.Logger;

public final class PropertiesController {

    private static AtomicReference<PropertiesController> instance = new AtomicReference<>(null);

    private Properties properties = new Properties();

    private PropertiesController() {
        try {
            properties.putAll(loadPropertiesFromFile(
                    System.getProperty(PropertiesNames.CONFIGURATION_FILE)));
        } catch (final IllegalStateException e) {
            throw new IllegalStateException("Failed to load environment configuration file", e);
        }
    }

    public static String getProperty(final String propertyName) {
        if (instance.get() == null) {
            instance.compareAndSet(null, new PropertiesController());
        }
        return System.getProperty(propertyName, instance.get().properties.getProperty(propertyName));
    }

    public static Properties loadPropertiesFromFile(final String resource) {
        Logger.out.info("Reading properties: %s", resource);
        final InputStream inputStream = Optional.ofNullable(PropertiesController.class.getResourceAsStream(resource))
                .orElseThrow(() -> new NullPointerException("Unable to open input stream for resource " + resource));
        final Properties props = new Properties();
        try {
            props.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            Logger.out.info(e);
            throw new IllegalStateException("Unable to load properties from resource " + resource);
        }
        for (final String propertyName : props.stringPropertyNames()) {
            if (propertyName.startsWith("+")) {
                props.putAll(loadPropertiesFromFile(propertyName.substring(1)));
            }
        }
        return props;
    }
}