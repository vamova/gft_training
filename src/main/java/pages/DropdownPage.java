package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {

    private WebDriver driver;
    private By dropdown = By.id("dropdown");


    public DropdownPage(WebDriver driver){
        this.driver=driver;
    }

    //usamos el select para definit el dropdown
    private Select findDropdownElement(){
        return new Select(driver.findElement(dropdown));
    }

    //aqui selectionamos el texto visible del dropdown, y le pasamos el texto
    public void selectFromDropdown(String option){
        findDropdownElement().selectByVisibleText(option);
    }

    //aqui vamos a sacar una lista de opciones del dropdown
    public List<String> getSelectedOptions(){
        List<WebElement> selectedElements =
        findDropdownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

}
