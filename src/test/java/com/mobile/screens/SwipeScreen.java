package com.mobile.screens;

import com.mobile.automation.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class SwipeScreen extends BaseScreen {

    private Point start;
    private Point end;

    private static final String SWIPE_SUBTITLE_TXT = "UiSelector().text(\"Or swipe vertical to find what I'm hiding.\")";
    private static final String FIRST_SWIPE_CARD = "UiSelector().text(\"FULLY OPEN SOURCE\")";
    private static final String LAST_SWIPE_CARD = "UiSelector().text(\"COMPATIBLE\")";
    private static final String FOUND_ME_TXT = "UiSelector().text(\"You found me!!!\")";


    @AndroidFindBy(uiAutomator = SWIPE_SUBTITLE_TXT)
    private WebElement swipesubTitleTxt;
    @AndroidFindBy(uiAutomator = FIRST_SWIPE_CARD)
    private WebElement firstSwipeCard;
    @AndroidFindBy(uiAutomator = LAST_SWIPE_CARD)
    private WebElement lastSwipeCard;
    @AndroidFindBy(uiAutomator = FOUND_ME_TXT)
    private WebElement foundMeTxt;

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

    public boolean isFoundMeMessageDisplayed() {
        return foundMeTxt.isDisplayed();
    }

    public void scrollOutScreenFirstCard() {
        start = new Point(534, 2248);
        end = new Point(102, 2248);
        scroll(start, end);
    }

    public void scrollToLastCard(){
        start = new Point(534, 2248);
        end = new Point(102, 2248);
        scroll(start, end);
        scroll(start, end);
        scroll(start, end);
        scroll(start, end);
        scroll(start, end);
        scroll(start, end);
        scroll(start, end);
        this.waitUntilElementDisplayed(lastSwipeCard);
    }

    public void scrollDownScreen(){
        start = new Point(676, 1536);
        end = new Point(676, 471);
        scroll(start, end);
        scroll(start, end);
        scroll(start, end);
    }
}
