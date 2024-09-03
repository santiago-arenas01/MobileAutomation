package com.mobile.test;

import com.mobile.automation.utils.Utils;
import com.mobile.automation.utils.screens.BaseScreen;
import com.mobile.automation.utils.tests.BaseTest;
import com.mobile.screens.LoginScreen;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void LoginTest(){
        BaseScreen baseScreen = new BaseScreen(driver);
        String email = Utils.generateRandomEmail();
        String password = Utils.generateRandomPassword();
        LoginScreen loginScreen = baseScreen.returnLoginScreen();
        Assert.assertTrue(loginScreen.isLoginTitleDisplayed());
        loginScreen.setEmailTextField(email);
        loginScreen.setPasswordTextField(password);
        Assert.assertTrue(loginScreen.isLoginBtnDisplayed());
        loginScreen.tapOnLoginBtn();
        Assert.assertTrue(loginScreen.isSuccessLoginTitleAlertDisplayed());
        Assert.assertTrue(loginScreen.isOkBtnDisplayed());
        softAssert.assertAll();
    }
}
