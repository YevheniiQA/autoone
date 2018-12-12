package com.automation.serenityframework.steps;

import com.automation.serenityframework.pageobject.pages.SearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SearchPageSteps extends ScenarioSteps {

    private SearchPage searchPage;

    @Step
    public List<Integer> getListOfCarsRegistrationsYear() {
        return searchPage.getSearchResultCarWidgetList().stream().map(item -> item.getRegistrationDateLabel().getText())
                .collect(Collectors.toList()).stream()
                .map(item -> Integer.valueOf(item.substring(item.indexOf("/") + 1, item.length())))
                .collect(Collectors.toList());
    }

    @Step
    public boolean isCarsSortedByPriceDescending() {
        return IntStream.range(1, getListOfCarsPrices().size())
                .noneMatch(i -> getListOfCarsPrices().get(i) <= getListOfCarsPrices().get(i) - 1);

    }

    @Step
    public List<String> getListOfPaginationItemsFiltersParameters() {
        return searchPage.getPaginationWidget().getNotDisabledPaginationButtonsList().stream().
                map(button -> button.getAttribute("href")).collect(Collectors.toList());
    }


    private List<Integer> getListOfCarsPrices() {
        return searchPage.getSearchResultCarWidgetList().stream()
                .map(item -> Integer.valueOf(item.getPriceLabel().getText().replaceAll("\\D+", "")))
                .collect(Collectors.toList());
    }

}
