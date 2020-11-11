package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadPage {

    private WebDriver driver;
    private By example1 = By.xpath("/html/body/div[2]/div/div/a[1]");
    private By example2 = By.xpath("/html/body/div[2]/div/div/a[2]");

    public DynamicLoadPage (WebDriver driver){
        this.driver = driver;
    }

    public DynamicExample1 clickExample1(){
        driver.findElement(example1).click();
        return new DynamicExample1(driver);
    }

    public DynamicExample2 clickExample2(){
        driver.findElement(example2).click();
        return new DynamicExample2(driver);
    }
}
