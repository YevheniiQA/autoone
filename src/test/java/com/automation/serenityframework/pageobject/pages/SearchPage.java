package com.automation.serenityframework.pageobject.pages;

import com.automation.serenityframework.pageobject.widgets.widget.PaginationWidget;
import com.automation.serenityframework.pageobject.widgets.widget.SearchResultCarWidget;
import com.automation.serenityframework.pageobject.widgets.widget.SearchWidget;
import com.automation.serenityframework.pageobject.widgets.widget.TopOptionsWidget;
import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.List;

@Getter
@DefaultUrl("/search")
public class SearchPage extends PageObject {

    @FindBy(className = "side___1TuKo")
    private SearchWidget searchWidget;

    @FindBy(xpath = ".//div[@data-qa-selector='top-options']")
    private TopOptionsWidget topOptionsWidget;

    @FindBy(xpath = ".//div[@class='item___T1IPF']")
    private List<SearchResultCarWidget> searchResultCarWidgetList;

    @FindBy(xpath = ".//ul[@class='pagination']")
    private PaginationWidget paginationWidget;

}
