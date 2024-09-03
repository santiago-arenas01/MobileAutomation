package com.mobile.test;

import com.mobile.automation.utils.screens.BaseScreen;
import com.mobile.automation.utils.tests.BaseTest;
import com.mobile.screens.SwipeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SwipeCardsTest extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    public void SwipeCardsTest(){
        BaseScreen baseScreen = new BaseScreen(driver);
        SwipeScreen swipeScreen = baseScreen.returnSwipeScreen();
        Assert.assertTrue(swipeScreen.isFirstSwipeCardDisplayed());
        swipeScreen.scrollOutScreenFirstCard();
        Assert.assertFalse(swipeScreen.isFirstSwipeCardDisplayed());
        swipeScreen.scrollToLastCard();
        Assert.assertTrue(swipeScreen.isLastSwipeCardDisplayed());
        swipeScreen.scrollDownScreen();
        Assert.assertTrue(swipeScreen.isFoundMeMessageDisplayed());
        softAssert.assertAll();
    }
}
