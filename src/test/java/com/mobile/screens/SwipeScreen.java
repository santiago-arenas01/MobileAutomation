package com.mobile.screens;

import com.mobile.automation.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Point;

public class SwipeScreen extends BaseScreen {

    public SwipeScreen(AndroidDriver driver) {
        super(driver);
    }

    public void scrollSwipeScreen() {
        Point source = new Point(769, 309);
        Point target = new Point(752, 2348);
        scroll(source, target);
    }
}
