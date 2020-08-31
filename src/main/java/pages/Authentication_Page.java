package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Authentication_Page {

    WebDriver driver;

    public Authentication_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement getEmail_create_user_field() {
        return email_create_user_field;
    }

    @FindBy(xpath = "//label[text()='Email address']/following-sibling::input[@name = 'email_create']")
    WebElement email_create_user_field;

    @FindBy(xpath = "//button[@name = 'SubmitCreate']")
    WebElement create_account_button;
    @FindBy(xpath = "//h3[text() ='Already registered?']/parent::form//label[text()='Email address']/following-sibling::input")
    WebElement email_field_registered_user;
    @FindBy(xpath = "//h3[text() ='Already registered?']/parent::form//label[text()='Password']/parent::div//input")
    WebElement password_field_registered_user;
    @FindBy(xpath = "//h3[text() ='Already registered?']/parent::form//p/button")
    WebElement sign_in_button;

    public WebElement getSign_in_button() {
        return sign_in_button;
    }

    public WebElement getEmail_field_registered_user() {
        return email_field_registered_user;
    }

    public WebElement getPassword_field_registered_user() {
        return password_field_registered_user;
    }

    public WebElement getCreate_account_button() {
        return create_account_button;
    }
}
