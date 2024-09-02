package com.mobile.screens;

import com.mobile.automation.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FormsScreen extends BaseScreen {

    private static final String COMPONENTS_TITLE_TXT = "UiSelector().text(\"Form components\")";

    @AndroidFindBy(uiAutomator = COMPONENTS_TITLE_TXT)
    private WebElement componentsTitleTxt;
    @AndroidFindBy(accessibility = "text-input")
    private WebElement inputField;

    public FormsScreen(AndroidDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public boolean isFormComponentsTitleDisplayed() {
        return componentsTitleTxt.isDisplayed();
    }

    public boolean isInputFieldDisplayed() {
        return inputField.isDisplayed();
    }
}
