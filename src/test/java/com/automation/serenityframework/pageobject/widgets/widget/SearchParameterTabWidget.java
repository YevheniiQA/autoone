package com.automation.serenityframework.pageobject.widgets.widget;

import com.automation.serenityframework.pageobject.widgets.widget.common.CommonAutoheroWidget;
import com.automation.serenityframework.pageobject.widgets.widgetimplementation.SearchParameterTabWidgetImpl;
import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.Select;

@ImplementedBy(SearchParameterTabWidgetImpl.class)
public interface SearchParameterTabWidget extends CommonAutoheroWidget {

    Select getDropdownSelect();

    WebElementFacade getSearchParameterLabel();
}
