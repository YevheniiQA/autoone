package com.automation.serenityframework.definitions;

import com.automation.serenityframework.steps.SearchPageActions;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;

public class SearchPageDefinitions {

    @Steps
    SearchPageActions searchPageActions;

    @Given("Auto1 user opens Search page")
    public void openAutoheroSearchPage() {
        searchPageActions.openSearchPage();
    }

    @When("Auto1 user selects '$value' on '$searchCriteria' side search parameters panel")
    public void selectSearchCriteriaOnSearchWidget(final String value, final String searchCriteria) {
        searchPageActions.selectValueOnSearchWidgetBySearchCriteriaName(searchCriteria, value);
    }

    @When("Auto1 user selects sort by '$searchParam' on top options panel")
    public void selectSortByOnTopOptionsPanel(final String searchParam) {
        searchPageActions.selectSortByOnTopOptionsPanel(searchParam);
    }

}
