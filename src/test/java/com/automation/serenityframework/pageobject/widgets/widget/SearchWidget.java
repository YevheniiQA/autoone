package com.automation.serenityframework.pageobject.widgets.widget;

import com.automation.serenityframework.pageobject.widgets.widget.common.CommonAutoheroWidget;
import com.automation.serenityframework.pageobject.widgets.widgetimplementation.SearchWidgetImpl;
import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WebElementFacade;


@ImplementedBy(SearchWidgetImpl.class)
public interface SearchWidget extends CommonAutoheroWidget {

    SearchParameterTabWidget getSearchCriteriaTabByName(String tabName);

}
