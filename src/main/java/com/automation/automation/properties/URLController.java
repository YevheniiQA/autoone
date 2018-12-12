package com.automation.automation.properties;

import static com.automation.automation.properties.PropertiesNames.SITE_HOST;

public final class URLController {

    private static final String URL_TEMPLATE = "https://%s";

    public static final String AUTOHERO_HOME_PAGE = String.format(URL_TEMPLATE,
            PropertiesController.getProperty(SITE_HOST));

    private URLController() {

    }

}
