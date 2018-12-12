package com.automation.serenityframework.steps.common;

import static com.automation.automation.properties.PropertiesNames.LARGE_TIMEOUT;
import static com.automation.automation.util.WaitUtils.waitUntil;

import com.automation.automation.properties.PropertiesController;
import com.automation.serenityframework.pageobject.pages.SearchPage;
import net.thucydides.core.steps.ScenarioSteps;


public class CommonSteps extends ScenarioSteps {

    private SearchPage searchPage;

    public void waitForPageToLoad() {
        waitUntil(() -> "complete".equals(searchPage.evaluateJavascript("return document.readyState")),
                Long.parseLong(PropertiesController.getProperty(LARGE_TIMEOUT)));
    }

}
