package com.mobile.screens;

import com.mobile.automation.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DragScreen extends BaseScreen {

    private static final String NINTH_PUZZLE_BOX = "UiSelector().className(\"android.widget.ImageView\").instance(1)";
    private static final String FIRST_DRAGGING_PUZZLE_PIECE = "UiSelector().className(\"android.widget.ImageView\").instance(1)";

    @AndroidFindBy(uiAutomator = NINTH_PUZZLE_BOX)
    private WebElement ninthPuzzleBox;
    @AndroidFindBy(uiAutomator = FIRST_DRAGGING_PUZZLE_PIECE)
    private WebElement firstPuzzlePieceToDrag;

    public DragScreen(AndroidDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public boolean isNinthPuzzleBoxDisplayed() {
        return ninthPuzzleBox.isDisplayed();
    }

    public boolean isFirstPuzzlePieceDisplayed() {
        return firstPuzzlePieceToDrag.isDisplayed();
    }
}
