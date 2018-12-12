package com.automation.serenityframework.pageobject.widgets.widgetimplementation;

import com.automation.serenityframework.pageobject.widgets.widget.PaginationWidget;
import com.automation.serenityframework.pageobject.widgets.widgetimplementation.common.CommonAutoheroWidgetImpl;
import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import java.util.List;

@Getter
public class PaginationWidgetImpl extends CommonAutoheroWidgetImpl implements PaginationWidget {

    @FindBy(xpath = ".//li[not(@class='disabled') and not(@class='active')]//a")
    private List<WebElementFacade> notDisabledPaginationButtonsList;

    public PaginationWidgetImpl(final PageObject page, final ElementLocator locator, final WebElement webElement,
            final long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }

    public PaginationWidgetImpl(final PageObject page, final ElementLocator locator, final long timeoutInMilliseconds) {
        super(page, locator, timeoutInMilliseconds);
    }
}
