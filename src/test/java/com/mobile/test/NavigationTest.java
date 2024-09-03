package com.mobile.test;

import com.mobile.automation.utils.screens.BaseScreen;
import com.mobile.automation.utils.tests.BaseTest;
import com.mobile.screens.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NavigationTest extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void navigationTest(){
        BaseScreen baseScreen = new BaseScreen(driver);
        WebViewScreen webViewScreen = baseScreen.returnWebViewScreen();
        Assert.assertTrue(webViewScreen.isMainBarDisplayed());
        webViewScreen.scrollWebViewScreenToReactBtn();
        Assert.assertTrue(webViewScreen.isReactBtnDisplayed());
        LoginScreen loginScreen = baseScreen.returnLoginScreen();
        Assert.assertTrue(loginScreen.isLoginTitleDisplayed());
        Assert.assertTrue(loginScreen.isLoginBtnDisplayed());
        Assert.assertTrue(loginScreen.isSignUpBtnDisplayed());
        FormsScreen formsScreen = baseScreen.returnFormsScreen();
        Assert.assertTrue(formsScreen.isFormComponentsTitleDisplayed());
        Assert.assertTrue(formsScreen.isInputFieldDisplayed());
        SwipeScreen swipeScreen = baseScreen.returnSwipeScreen();
        Assert.assertTrue(swipeScreen.isSwipeSubtitleDisplayed());
        Assert.assertTrue(swipeScreen.isFirstSwipeCardDisplayed());
        DragScreen dragScreen = baseScreen.returnDragScreen();
        Assert.assertTrue(dragScreen.isNinthPuzzleBoxDisplayed());
        Assert.assertTrue(dragScreen.isFirstPuzzlePieceDisplayed());
        HomeScreen homeScreen = baseScreen.returnHomeScreen();
        Assert.assertTrue(homeScreen.isRobotImageDisplayed());
        Assert.assertTrue(homeScreen.isHomeDescriptionDisplayed());
        softAssert.assertAll();
    }
}
