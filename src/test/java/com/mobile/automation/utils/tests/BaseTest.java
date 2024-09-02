package com.mobile.automation.utils.tests;

import com.mobile.screens.*;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.android.AndroidDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {
    private static final String PROPERTIES_FILE = "src/test/resources/config.properties";
    private static final Properties properties = new Properties();
    public static AndroidDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void environmentSetup() {
        loadProperties();
        UiAutomator2Options capabilities = new UiAutomator2Options();
        setupCapabilities(capabilities);
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);
        }
        catch(MalformedURLException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public void loadProperties() {
        try {
            FileInputStream fileInputStream = new FileInputStream(PROPERTIES_FILE);
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException("Error loading the properties file " + PROPERTIES_FILE);
        }
    }
    public static void setupCapabilities(UiAutomator2Options capabilities) {
        capabilities.setPlatformName(getCapability("platformName"));
        capabilities.setDeviceName(getCapability("deviceName"));
        capabilities.setAppPackage(getCapability("appPackage"));
        capabilities.setAppActivity(getCapability("appActivity"));
    }

    public static String getCapability(String variable) {
        return properties.getProperty(variable);
    }
}