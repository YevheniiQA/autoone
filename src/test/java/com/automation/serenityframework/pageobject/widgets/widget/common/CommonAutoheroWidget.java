package com.automation.serenityframework.pageobject.widgets.widget.common;

import com.automation.serenityframework.pageobject.widgets.widgetimplementation.common.CommonAutoheroWidgetImpl;
import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;


@ImplementedBy(CommonAutoheroWidgetImpl.class)
public interface CommonAutoheroWidget extends WidgetObject {

    boolean checkVisibility(boolean shouldWait);
}
