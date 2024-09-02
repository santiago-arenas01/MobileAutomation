package com.mobile.screens;

import com.mobile.automation.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class SwipeScreen extends BaseScreen {

    private static final Point start = new Point(534, 2248);
    private static final Point end = new Point(102, 2248);

    private static final String SWIPE_SUBTITLE_TXT = "UiSelector().text(\"Or swipe vertical to find what I'm hiding.\")";
    private static final String FIRST_SWIPE_CARD = "UiSelector().text(\"FULLY OPEN SOURCE\")";
    private static final String LAST_SWIPE_CARD = "UiSelector().text(\"COMPATIBLE\")";

    @AndroidFindBy(uiAutomator = SWIPE_SUBTITLE_TXT)
    private WebElement swipesubTitleTxt;
    @AndroidFindBy(uiAutomator = FIRST_SWIPE_CARD)
    private WebElement firstSwipeCard;
    @AndroidFindBy(uiAutomator = LAST_SWIPE_CARD)
    private WebElement lastSwipeCard;

    public SwipeScreen(AndroidDriver driver) {
        super(driver);
    }

    public boolean isSwipeSubtitleDisplayed() {
        return swipesubTitleTxt.isDisplayed();
    }

    public boolean isFirstSwipeCardDisplayed() {
        try {
            return firstSwipeCard.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isLastSwipeCardDisplayed() {
        return lastSwipeCard.isDisplayed();
    }

    public void scrollOutScreenFirstCard() {
        scroll(start, end);
    }

    public void scrollToLastCard(){
        scroll(start, end);
        scroll(start, end);
        scroll(start, end);
        scroll(start, end);
        scroll(start, end);
    }
}
