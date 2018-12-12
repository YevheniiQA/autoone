package com.automation.automation.util;

import static com.automation.automation.properties.PropertiesNames.WEBDRIVER_IMPLICITLY_WAIT;
import static com.automation.automation.properties.PropertiesNames.WEBDRIVER_TIMEOUTS_WAIT_RETRY_STEP;

import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;


import com.automation.automation.properties.PropertiesController;
import net.thucydides.core.scheduling.NormalFluentWait;

public class WaitUtils {

    private static final long TIMEOUT = Long.parseLong(PropertiesController.getProperty(WEBDRIVER_IMPLICITLY_WAIT));
    private static final long INTERVAL = Long
            .parseLong(PropertiesController.getProperty(WEBDRIVER_TIMEOUTS_WAIT_RETRY_STEP));

    private WaitUtils() {
    }

    @SuppressWarnings("unchecked")
    public static boolean waitUntil(final Supplier<Boolean> condition, final long timeoutMs, final long retryMs) {
        return (Boolean) new NormalFluentWait("wait").withTimeout(timeoutMs, TimeUnit.MILLISECONDS)
                .pollingEvery(retryMs, TimeUnit.MILLISECONDS).until(magic -> condition.get());
    }

    public static boolean waitUntil(final Supplier<Boolean> condition, final long timeoutMs) {
        return waitUntil(condition, timeoutMs, INTERVAL);
    }

    public static boolean waitUntil(final Supplier<Boolean> condition) {
        return waitUntil(condition, TIMEOUT, INTERVAL);
    }

}
