package com.automation.serenityframework.pageobject.widgets.widgetimplementation.common;

import com.automation.serenityframework.pageobject.widgets.widget.common.CommonAutoheroWidget;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WidgetObjectImpl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

public class CommonAutoheroWidgetImpl extends WidgetObjectImpl implements CommonAutoheroWidget {

    public CommonAutoheroWidgetImpl(final PageObject page, final ElementLocator locator, final WebElement webElement,
                                    final long timeoutInMilliseconds) {
        super(page, locator, webElement, timeoutInMilliseconds);
    }

    public CommonAutoheroWidgetImpl(final PageObject page, final ElementLocator locator,
                                    final long timeoutInMilliseconds) {
        super(page, locator, timeoutInMilliseconds);
    }

    @Override
    public boolean checkVisibility(boolean shouldWait) {
        return false;
    }
}
