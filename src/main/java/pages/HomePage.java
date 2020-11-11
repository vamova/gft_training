package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    //iniciamos el driver
    private WebDriver driver;

    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By dropdownLink = By.linkText("Dropdown");
    private By checkboxLink = By.linkText("Checkboxes");
    private By forgotPassLink = By.linkText("Forgot Password");
    private By alertsLink = By.linkText("JavaScript Alerts");
    private By fileUploadLink = By.linkText("File Upload");
    private By dynamicLink = By.linkText("Dynamic Loading");


    // se crea el constructor y le decimos donde lo guardamos
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdown(){
        driver.findElement(dropdownLink).click();
        return new DropdownPage(driver);
    }

    public CheckboxPage clickCheckbox(){
        driver.findElement(checkboxLink).click();
        return new CheckboxPage(driver);
    }

    public ForgotPasswordPage clickForgotPassword(){
        driver.findElement(forgotPassLink).click();
        return new ForgotPasswordPage(driver);
    }

    public AlertsPage clickAlertsPage(){
        driver.findElement(alertsLink).click();
        return new AlertsPage(driver);
    }

    public FileUploadPage clickUploadPage(){
        driver.findElement(fileUploadLink).click();
        return new FileUploadPage(driver);
    }


    public DynamicLoadPage clickDynamicPage(){
        driver.findElement(dynamicLink).click();
        return new DynamicLoadPage(driver);
    }


}