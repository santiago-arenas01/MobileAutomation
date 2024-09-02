package com.mobile.test;

import com.mobile.automation.utils.screens.BaseScreen;
import com.mobile.automation.utils.tests.BaseTest;
import com.mobile.screens.HomeScreen;
import com.mobile.screens.WebViewScreen;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NavigationTest extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void navigationTest(){
        BaseScreen baseScreen = new BaseScreen(driver);
        WebViewScreen webViewScreen = baseScreen.returnWebViewScreen();
        softAssert.assertAll();
    }
}
