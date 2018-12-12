package com.automation.serenityframework.pageobject.widgets.widgetimplementation;

import com.automation.serenityframework.pageobject.widgets.widget.SearchResultCarWidget;
import com.automation.serenityframework.pageobject.widgets.widgetimplementation.common.CommonAutoheroWidgetImpl;
import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;

@Getter
public class SearchResultCarWidgetImpl extends CommonAutoheroWidgetImpl implements SearchResultCarWidget {

    @FindBy(xpath = "(.//li[@data-qa-selector='spec'])[1]")
    private WebElementFacade registrationDateLabel;

    @FindBy(xpath = ".//div[@data-qa-selector='price']")
    private WebElementFacade priceLabel;

    public SearchResultCarWidgetImpl(final PageObject page, final ElementLocator locator, final WebElement webElement,
            final long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }

    public SearchResultCarWidgetImpl(final PageObject page, final ElementLocator locator,
            final long timeoutInMilliseconds) {
        super(page, locator, timeoutInMilliseconds);
    }
}
