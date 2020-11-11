package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicExample1 {

    private WebDriver driver;

    private By startButton = By.cssSelector("#start button");
    private By loadingBar = By.id("loading");
    private By loadedText = By.id("finish");


    public DynamicExample1 (WebDriver driver){
        this.driver = driver;
    }

    public void ClickStart(){
        driver.findElement(startButton).click();
        //le ponemos un tiempo y le decimos que espere tantos segundos
        WebDriverWait wait = new WebDriverWait(driver, 5);
        //y que espere que ese elemento sea invisible
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingBar)));
    }

    public String getTextLoaded(){
        return driver.findElement(loadedText).getText();
    }
}
