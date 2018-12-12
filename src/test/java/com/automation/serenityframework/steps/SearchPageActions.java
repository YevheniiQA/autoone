package com.automation.serenityframework.steps;

import com.automation.automation.properties.URLController;
import com.automation.automation.util.WebDriverUtil;
import com.automation.serenityframework.pageobject.pages.SearchPage;
import com.automation.serenityframework.steps.common.CommonSteps;
import net.thucydides.core.annotations.Step;

public class SearchPageActions extends CommonSteps {

    private SearchPage searchPage;

    @Step
    public void openSearchPage() {
        WebDriverUtil.setBaseUrl(URLController.AUTOHERO_HOME_PAGE);
        searchPage.open();
        waitForPageToLoad();
    }

    @Step
    public void selectValueOnSearchWidgetBySearchCriteriaName(final String searchCriteria, final String value) {
        searchPage.getSearchWidget().getSearchCriteriaTabByName(searchCriteria).click();
        searchPage.getSearchWidget().getSearchCriteriaTabByName(searchCriteria).getDropdownSelect()
                .selectByVisibleText(value);
        waitForPageToLoad();
    }

    @Step
    public void selectSortByOnTopOptionsPanel(final String searchParam) {
        searchPage.getTopOptionsWidget().getSortBySelect().selectByVisibleText(searchParam);
    }
}
