package com.mobile.screens;

import com.mobile.automation.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class SwipeScreen extends BaseScreen {

    private static final String SWIPE_SUBTITLE_TXT = "UiSelector().text(\"Or swipe vertical to find what I'm hiding.\")";
    private static final String FIRST_SWIPE_CARD = "UiSelector().description(\"card\").instance(0)";

    @AndroidFindBy(uiAutomator = SWIPE_SUBTITLE_TXT)
    private WebElement swipesubTitleTxt;
    @AndroidFindBy(uiAutomator = FIRST_SWIPE_CARD)
    private WebElement firstSwipeCard;

    public SwipeScreen(AndroidDriver driver) {
        super(driver);
    }

    public void scrollSwipeScreen() {
        Point source = new Point(769, 309);
        Point target = new Point(752, 2348);
        scroll(source, target);
    }

    public boolean isSwipeSubtitleDisplayed() {
        return swipesubTitleTxt.isDisplayed();
    }

    public boolean isFirstSwipeCardDisplayed() {
        return firstSwipeCard.isDisplayed();
    }
}
