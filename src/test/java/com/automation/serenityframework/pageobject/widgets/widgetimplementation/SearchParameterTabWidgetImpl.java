package com.automation.serenityframework.pageobject.widgets.widgetimplementation;

import com.automation.serenityframework.pageobject.widgets.widget.SearchParameterTabWidget;
import com.automation.serenityframework.pageobject.widgets.widgetimplementation.common.CommonAutoheroWidgetImpl;
import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.ui.Select;

@Getter
public class SearchParameterTabWidgetImpl extends CommonAutoheroWidgetImpl implements SearchParameterTabWidget {

    @FindBy(xpath = ".//span[@class='labelText___1_7Q2']")
    private WebElementFacade searchParameterLabel;

    public SearchParameterTabWidgetImpl(final PageObject page, final ElementLocator locator,
            final WebElement webElement, final long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }

    public SearchParameterTabWidgetImpl(final PageObject page, final ElementLocator locator,
            final long timeoutInMilliseconds) {
        super(page, locator, timeoutInMilliseconds);
    }

    public Select getDropdownSelect() {
        return new Select(findBy(By.xpath(".//select")));
    }
}
