package com.mobile.screens;

import com.mobile.automation.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class WebViewScreen extends BaseScreen {

    private static final String MAIN_TXT = "UiSelector().text(\"Main\")";
    @AndroidFindBy(uiAutomator = MAIN_TXT)
    private WebElement mainTxt;

    @AndroidFindBy(accessibility = "react")
    private WebElement reactBtn;

    public WebViewScreen(AndroidDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void scrollWebViewScreenToReactBtn() {
        Point source = new Point(97, 2519);
        Point target = new Point(97, 839);
        scroll(source, target);
        scroll(source, target);
        scroll(source, target);
        scroll(source, target);
        scroll(source, target);
        scroll(source, target);
    }

    public boolean isMainTxtDisplayed() {
        return mainTxt.isDisplayed();
    }

    public boolean isReactBtnDisplayed() {
        return reactBtn.isDisplayed();
    }
}
