package com.automation.automation.logging;

public class Logger {

    private static final String BRACES = "{}";

    public static Logger out = new Logger(Logger.class.getName());

    private final org.apache.log4j.Logger loggerClass;

    public Logger(final String name) {
        this.loggerClass = org.apache.log4j.Logger.getLogger(name);
    }

    public void error(final Object message) {loggerClass.error(message);}

    public void info(final String message,final Object resource) {
        loggerClass.info(String.format(message,resource));
    }

    public void info(final Object object) {
        loggerClass.info(object);
    }

}
