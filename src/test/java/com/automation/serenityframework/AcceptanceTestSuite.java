package com.automation.serenityframework;

import static com.automation.automation.properties.PropertiesNames.AUTOHERO_STORIES_PATTERN;


import com.automation.automation.properties.URLController;
import com.automation.automation.util.WebDriverUtil;
import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.guice.Injectors;
import net.thucydides.core.webdriver.Configuration;

public class AcceptanceTestSuite extends SerenityStories {

    private static final String STORY_TIMEOUT = "2000";

    public AcceptanceTestSuite() {
        WebDriverUtil.setDriverAccordingToOS();
        addStoriesByPattern();
        setupConfigs();
    }

    private void addStoriesByPattern() {
        final String storiesPattern = System.getProperty(AUTOHERO_STORIES_PATTERN);
        if (storiesPattern != null)
            findStoriesCalled(storiesPattern);
    }

    private void setupConfigs() {
        final Configuration configuration = Injectors.getInjector().getInstance(Configuration.class);
        configuration.setDefaultBaseUrl(URLController.AUTOHERO_HOME_PAGE);
        this.configuredEmbedder().embedderControls().useStoryTimeouts(STORY_TIMEOUT);
    }

}


