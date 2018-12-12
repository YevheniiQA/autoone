package com.automation.serenityframework.pageobject.widgets.widgetimplementation;

import com.automation.serenityframework.pageobject.widgets.widget.TopOptionsWidget;
import com.automation.serenityframework.pageobject.widgets.widgetimplementation.common.CommonAutoheroWidgetImpl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.ui.Select;

public class TopOptionsWidgetImpl extends CommonAutoheroWidgetImpl implements TopOptionsWidget {

    @FindBy(xpath = ".//div[@data-qa-selector='sort-select']//select")
    private WebElementFacade sortBySelect;

    public TopOptionsWidgetImpl(final PageObject page, final ElementLocator locator, final WebElement webElement,
            final long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }

    public TopOptionsWidgetImpl(final PageObject page, final ElementLocator locator, final long timeoutInMilliseconds) {
        super(page, locator, timeoutInMilliseconds);
    }

    public Select getSortBySelect() {
        return new Select(sortBySelect);
    }
}
