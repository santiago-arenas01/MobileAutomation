package com.mobile.screens;

import com.mobile.automation.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginScreen extends BaseScreen {

    private static final String LOGIN_TITLE_TXT = "UiSelector().text(\"Login / Sign up Form\")";
    private static final String LOGIN_BTN = "UiSelector().text(\"Login\").instance(0)";
    private static final String SIGN_UP_BTN = "UiSelector().text(\"Sign up\")";

    @AndroidFindBy(uiAutomator = LOGIN_TITLE_TXT)
    private WebElement loginTitleTxt;
    @AndroidFindBy(uiAutomator = LOGIN_BTN)
    private WebElement loginBtn;
    @AndroidFindBy(uiAutomator = SIGN_UP_BTN)
    private WebElement signUpBtn;

    public LoginScreen(AndroidDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public boolean isLoginTitleDisplayed() {
        return loginTitleTxt.isDisplayed();
    }

    public boolean isLoginBtnDisplayed() {
        return loginBtn.isDisplayed();
    }

    public boolean isSignUpBtnDisplayed() {
        return signUpBtn.isDisplayed();
    }
}
