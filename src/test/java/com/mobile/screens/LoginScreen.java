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
    private static final String SIGN_UP_LABEL_BTN = "UiSelector().text(\"Sign up\")";
    private static final String SIGN_UP_BTN = "UiSelector().className(\"android.view.ViewGroup\").instance(17)";

    @AndroidFindBy(uiAutomator = LOGIN_TITLE_TXT)
    private WebElement loginTitleTxt;
    @AndroidFindBy(uiAutomator = LOGIN_BTN)
    private WebElement loginBtn;
    @AndroidFindBy(uiAutomator = SIGN_UP_LABEL_BTN)
    private WebElement signUpLabelBtn;
    @AndroidFindBy(uiAutomator = SIGN_UP_BTN)
    private WebElement signUpBtn;
    @AndroidFindBy(accessibility = "input-email")
    private WebElement emailTextField;
    @AndroidFindBy(accessibility = "input-password")
    private WebElement passwordTextField;
    @AndroidFindBy(accessibility = "input-repeat-password")
    private WebElement repeatPasswordTextField;
    @AndroidFindBy(id = "android:id/alertTitle")
    private WebElement successTitleAlert;
    @AndroidFindBy(id = "android:id/button1")
    private WebElement okBtn;

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

    public boolean isSignUpLabelBtnDisplayed() {
        return signUpBtn.isDisplayed();
    }

    public boolean isSignUpBtnDisplayed() {
        return signUpBtn.isDisplayed();
    }

    public boolean isEmailTextFieldDisplayed() {
        this.waitUntilElementDisplayed(emailTextField);
        return emailTextField.isDisplayed();
    }

    public boolean isPasswordTextFieldDisplayed() {
        return passwordTextField.isDisplayed();
    }

    public boolean isRepeatPasswordTextFieldDisplayed() {
        return repeatPasswordTextField.isDisplayed();
    }

    public boolean isSuccessTitleAlertDisplayed() {
        this.waitUntilElementDisplayed(successTitleAlert);
        return successTitleAlert.isDisplayed();
    }

    public boolean isOkBtnDisplayed() {
        return okBtn.isDisplayed();
    }

    public void tapOnSignUpLabelBtn(){
        signUpLabelBtn.click();
    }

    public void setEmailTextField(String email){
        emailTextField.sendKeys(email);
    }

    public void setPasswordTextField(String password){
        passwordTextField.sendKeys(password);
    }

    public void setRepeatPasswordTextField(String password){
        repeatPasswordTextField.sendKeys(password);
    }

    public void tapOnSignUpBtn(){
        signUpBtn.click();
    }

    public void tapOnOkBtn(){
        okBtn.click();
    }
}
