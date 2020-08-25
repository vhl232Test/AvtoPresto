package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Autorization_Page {

    WebDriver driver;

    public Autorization_Page(WebDriver driver) {
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

    public WebElement getCreate_account_button() {
        return create_account_button;
    }
}
