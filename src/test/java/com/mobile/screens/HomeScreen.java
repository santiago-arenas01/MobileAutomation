package com.mobile.screens;

import com.mobile.automation.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomeScreen extends BaseScreen {
    private static final String ROBOT_IMG = "UiSelector().className(\"android.widget.ImageView\").instance(0)";
    private static final String HOME_DESCRIPTION_TXT = "UiSelector().text(\"Demo app for the appium-boilerplate\")";

    @AndroidFindBy(uiAutomator = ROBOT_IMG)
    private WebElement robotImg;
    @AndroidFindBy(uiAutomator = HOME_DESCRIPTION_TXT)
    private WebElement descriptionTxt;

    public HomeScreen(AndroidDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public boolean isRobotImageDisplayed() {
        return robotImg.isDisplayed();
    }

    public boolean isHomeDescriptionDisplayed() {
        return descriptionTxt.isDisplayed();
    }
}
