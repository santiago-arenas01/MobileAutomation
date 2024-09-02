package com.mobile.automation.utils;

import java.util.UUID;

public class Utils {
    public static String generateRandomEmail() {
        return "user" + UUID.randomUUID().toString() + "@test.com";
    }

    public static String generateRandomPassword() {
        return "Pass" + UUID.randomUUID().toString().substring(0, 10);
    }
}