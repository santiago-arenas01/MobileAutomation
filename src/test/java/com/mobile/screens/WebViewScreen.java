package com.mobile.screens;

import com.mobile.automation.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class WebViewScreen extends BaseScreen {
    private Point start;

    private static final String MAIN_BAR = "UiSelector().text(\"Main\")";

    @AndroidFindBy(uiAutomator = MAIN_BAR)
    private WebElement mainBar;
    @AndroidFindBy(accessibility = "react")
    private WebElement reactBtn;

    public WebViewScreen(AndroidDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void tapOnWebViewScreen(){
        start = new Point(97, 1000);
    }

    public void scrollWebViewScreenToReactBtn() {
        waitUntilElementDisplayed(mainBar);
        start = new Point(97, 2519);
        Point end = new Point(97, 839);
        scroll(start, end);
        scroll(start, end);
        scroll(start, end);
        scroll(start, end);
        scroll(start, end);
        scroll(start, end);
    }

    public boolean isMainBarDisplayed() {
        this.waitUntilElementDisplayed(mainBar);
        return mainBar.isDisplayed();
    }

    public boolean isReactBtnDisplayed() {
        return reactBtn.isDisplayed();
    }
}
