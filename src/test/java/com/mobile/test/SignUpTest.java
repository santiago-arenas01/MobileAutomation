package com.mobile.test;

import com.mobile.automation.utils.Utils;
import com.mobile.automation.utils.screens.BaseScreen;
import com.mobile.automation.utils.tests.BaseTest;
import com.mobile.screens.LoginScreen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SignUpTest extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(SignUpTest.class);
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void signUpTest(){
        BaseScreen baseScreen = new BaseScreen(driver);
        LoginScreen loginScreen = baseScreen.returnLoginScreen();
        Assert.assertTrue(loginScreen.isSignUpLabelBtnDisplayed());
        loginScreen.tapOnSignUpLabelBtn();
        Assert.assertTrue(loginScreen.isEmailTextFieldDisplayed());
        Assert.assertTrue(loginScreen.isPasswordTextFieldDisplayed());
        Assert.assertTrue(loginScreen.isRepeatPasswordTextFieldDisplayed());
        String randomEmail = Utils.generateRandomEmail();
        String randomPassword = Utils.generateRandomPassword();
        loginScreen.setEmailTextField(randomEmail);
        loginScreen.setPasswordTextField(randomPassword);
        loginScreen.setRepeatPasswordTextField(randomPassword);
        Assert.assertTrue(loginScreen.isSignUpBtnDisplayed());
        loginScreen.tapOnSignUpBtn();
        Assert.assertTrue(loginScreen.isSuccessTitleAlertDisplayed());
        Assert.assertTrue(loginScreen.isOkBtnDisplayed());
        loginScreen.tapOnOkBtn();
        softAssert.assertAll();
    }
}
