package com.automation.serenityframework.pageobject.widgets.widget;

import com.automation.serenityframework.pageobject.widgets.widget.common.CommonAutoheroWidget;
import com.automation.serenityframework.pageobject.widgets.widgetimplementation.TopOptionsWidgetImpl;
import net.serenitybdd.core.annotations.ImplementedBy;
import org.openqa.selenium.support.ui.Select;

@ImplementedBy(TopOptionsWidgetImpl.class)
public interface TopOptionsWidget extends CommonAutoheroWidget {

    Select getSortBySelect();

}
