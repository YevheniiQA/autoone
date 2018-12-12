package com.automation.serenityframework.pageobject.widgets.widget;

import com.automation.serenityframework.pageobject.widgets.widget.common.CommonAutoheroWidget;
import com.automation.serenityframework.pageobject.widgets.widgetimplementation.PaginationWidgetImpl;
import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

@ImplementedBy(PaginationWidgetImpl.class)
public interface PaginationWidget extends CommonAutoheroWidget {

    List<WebElementFacade> getNotDisabledPaginationButtonsList();

}
