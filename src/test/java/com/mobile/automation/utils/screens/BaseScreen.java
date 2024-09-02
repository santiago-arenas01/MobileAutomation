package com.mobile.automation.utils.screens;

import com.mobile.screens.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseScreen {

    private static final String WEB_VIEW_BTN = "Webview";
    @AndroidFindBy(accessibility = WEB_VIEW_BTN)
    private WebElement webViewBtn;

    protected AndroidDriver driver;
    public BaseScreen (AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator (driver), this);
    }

    public HomeScreen returnHomeScreen(){
        return new HomeScreen(driver);
    }

    public WebViewScreen returnWebViewScreen(){
        this.isElementDisplayed(webViewBtn);
        webViewBtn.click();
        return new WebViewScreen(driver);
    }

    public LoginScreen returnLoginScreen(){
        return new LoginScreen(driver);
    }

    public FormsScreen returnFormsScreen(){
        return new FormsScreen(driver);
    }

    public SwipeScreen returnSwipeScreen(){
        return new SwipeScreen(driver);
    }

    public DragScreen returnDragScreen(){
        return new DragScreen(driver);
    }

    protected void isElementDisplayed(WebElement element) {
        int seconds = 10;
        Duration duration = Duration.ofSeconds(seconds);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
