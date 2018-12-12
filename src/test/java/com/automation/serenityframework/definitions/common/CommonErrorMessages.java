package com.automation.serenityframework.definitions.common;

public interface CommonErrorMessages {

    static String createMessage(final String element, String message) {
        return String.format("[%s %s!] ", element, message);
    }

    default String forWrong(final String element) {
        return createMessage(element, "is (are) wrong");
    }

    default String forAbsent(final String element) {
        return createMessage(element, "is (are) absent");
    }
}
