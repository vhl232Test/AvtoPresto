package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_account_Page {

    WebDriver driver;

    public My_account_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//p[@class='alert alert-success']")
    WebElement create_account_success_messages;

    public WebElement getCreate_account_success_messages() {
        return create_account_success_messages;
    }
}
