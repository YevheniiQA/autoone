package com.automation.serenityframework.pageobject.widgets.widgetimplementation;

import com.automation.serenityframework.pageobject.widgets.widget.SearchParameterTabWidget;
import com.automation.serenityframework.pageobject.widgets.widget.SearchWidget;
import com.automation.serenityframework.pageobject.widgets.widgetimplementation.common.CommonAutoheroWidgetImpl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import java.util.List;

public class SearchWidgetImpl extends CommonAutoheroWidgetImpl implements SearchWidget {

    @FindBy(xpath = ".//div[contains(@class,'root___1ZGR8')]")
    private List<SearchParameterTabWidget> searchParameterTabWidgetList;

    public SearchWidgetImpl(final PageObject page, final ElementLocator locator, final WebElement webElement,
            final long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }

    public SearchWidgetImpl(final PageObject page, final ElementLocator locator, final long timeoutInMilliseconds) {
        super(page, locator, timeoutInMilliseconds);
    }

    public SearchParameterTabWidget getSearchCriteriaTabByName(final String tabName) {
        return searchParameterTabWidgetList.stream()
                .filter(current -> current.getSearchParameterLabel().getText().equalsIgnoreCase(tabName)).findFirst()
                .get();
    }

}
