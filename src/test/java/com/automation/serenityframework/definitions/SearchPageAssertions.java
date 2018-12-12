package com.automation.serenityframework.definitions;

import com.automation.serenityframework.definitions.common.CommonErrorMessages;
import com.automation.serenityframework.steps.SearchPageSteps;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.core.Every;
import org.jbehave.core.annotations.Then;
import org.junit.Assert;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.greaterThan;

public class SearchPageAssertions implements CommonErrorMessages {

    @Steps
    private SearchPageSteps searchPageSteps;

    @Then("Auto1 user checks that all cars are filtered by first registration from '$fromValue'")
    public void verifyAllCarsFilteredByFirstRegistrationFrom(final int fromValue) {
        Assert.assertThat(forWrong(String.format("Filtered by first registration from: %s", fromValue)),
                searchPageSteps.getListOfCarsRegistrationsYear(), Every.everyItem(greaterThan(fromValue)));
    }

    @Then("Auto1 user checks that all cars are sorted by price descending")
    public void verifyAllCarsSortedByPriceDescending() {
        Assert.assertTrue(forWrong("Cars sorting order"), searchPageSteps.isCarsSortedByPriceDescending());
    }

    @Then("Auto1 user checks that pagination items contains filter '$filterName' with '$value'")
    public void verifyPaginationItemsContainsCorrectFilterWithValue(final String filterName, final String value) {
        final String configuredFilterParameter = filterName + "=" + value;
        Assert.assertThat(
                forAbsent(String.format("Pagination items '%s' filter with parameter '%s'", filterName, value)),
                searchPageSteps.getListOfPaginationItemsFiltersParameters(),
                Every.everyItem(containsString(configuredFilterParameter)));
    }

}
