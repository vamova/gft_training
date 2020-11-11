package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxPage {

    private WebDriver driver;

    WebElement checkbox1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[1]"));
    WebElement checkbox2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/input[2]"));


    public CheckboxPage (WebDriver driver){
        this.driver = driver;
    }

    public void selectCheck1 (){
        checkbox1.click();
        System.out.println("Checkbox 1 is selected? "+checkbox1.isSelected());
    }

    public void uncheckCheck2(){
        if (checkbox2.isSelected())
        checkbox2.click();
        System.out.println("Checkbox 2 is selected?" + checkbox2.isSelected());
    }
}
