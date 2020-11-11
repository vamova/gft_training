package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By alertButton1 = By.xpath("/html/body/div[2]/div/div/ul/li[1]/button");
    private By results = By.id("result");
    private By alertButton2 = By.xpath("/html/body/div[2]/div/div/ul/li[2]/button");
    private By alertButton3 = By.xpath("/html/body/div[2]/div/div/ul/li[3]/button");


    public AlertsPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickAlert(){
        driver.findElement(alertButton1).click();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public String getResultText(){
        return driver.findElement(results).getText();
    }

    public void clickAlert2(){
        driver.findElement(alertButton2).click();
    }

    public void cancelAlert(){
        driver.switchTo().alert().dismiss();
    }

    public String getTextAlert2(){
        return driver.switchTo().alert().getText();
    }

    public void clickAlert3(){
        driver.findElement(alertButton3).click();
    }

    public void setInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }





}
