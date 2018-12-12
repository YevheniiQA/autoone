package com.automation.serenityframework.pageobject.widgets.widget;

import com.automation.serenityframework.pageobject.widgets.widget.common.CommonAutoheroWidget;
import com.automation.serenityframework.pageobject.widgets.widgetimplementation.SearchResultCarWidgetImpl;
import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WebElementFacade;

@ImplementedBy(SearchResultCarWidgetImpl.class)
public interface SearchResultCarWidget extends CommonAutoheroWidget {

   WebElementFacade getRegistrationDateLabel();

   WebElementFacade getPriceLabel();

}
