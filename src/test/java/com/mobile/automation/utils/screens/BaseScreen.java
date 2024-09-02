package com.mobile.automation.utils.screens;

import com.mobile.screens.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;

public class BaseScreen {

    private static final String HOME_BTN = "Home";
    private static final String WEB_VIEW_BTN = "Webview";
    private static final String LOGIN_BTN = "Login";
    private static final String FORMS_BTN = "Forms";
    private static final String SWIPE_BTN = "Swipe";
    private static final String DRAG_BTN = "Drag";

    @AndroidFindBy(accessibility = HOME_BTN)
    private WebElement homeBtn;
    @AndroidFindBy(accessibility = WEB_VIEW_BTN)
    private WebElement webViewBtn;
    @AndroidFindBy(accessibility = LOGIN_BTN)
    private WebElement loginBtn;
    @AndroidFindBy(accessibility = FORMS_BTN)
    private WebElement formsBtn;
    @AndroidFindBy(accessibility = SWIPE_BTN)
    private WebElement swipeBtn;
    @AndroidFindBy(accessibility = DRAG_BTN)
    private WebElement dragBtn;

    protected AndroidDriver driver;
    public BaseScreen (AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator (driver), this);
    }

    public HomeScreen returnHomeScreen(){
        this.waitUntilElementDisplayed(homeBtn);
        homeBtn.click();
        return new HomeScreen(driver);
    }

    public WebViewScreen returnWebViewScreen(){
        this.waitUntilElementDisplayed(webViewBtn);
        webViewBtn.click();
        return new WebViewScreen(driver);
    }

    public LoginScreen returnLoginScreen(){
        this.waitUntilElementDisplayed(loginBtn);
        loginBtn.click();
        return new LoginScreen(driver);
    }

    public FormsScreen returnFormsScreen(){
        this.waitUntilElementDisplayed(formsBtn);
        formsBtn.click();
        return new FormsScreen(driver);
    }

    public SwipeScreen returnSwipeScreen(){
        this.waitUntilElementDisplayed(swipeBtn);
        swipeBtn.click();
        return new SwipeScreen(driver);
    }

    public DragScreen returnDragScreen(){
        this.waitUntilElementDisplayed(dragBtn);
        dragBtn.click();
        return new DragScreen(driver);
    }

    protected void waitUntilElementDisplayed(WebElement element) {
        int seconds = 15;
        Duration duration = Duration.ofSeconds(seconds);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected void scroll(Point source, Point target) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0),
                PointerInput.Origin.viewport(), source.x, source.y));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(700),
                PointerInput.Origin.viewport(), target.x, target.y));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
    }
}
