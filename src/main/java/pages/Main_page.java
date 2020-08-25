package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main_page {

    WebDriver driver;

    public Main_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class = 'header_user_info']/a")
    WebElement sign_in_button;

    public WebElement getSign_in_button() {
        return sign_in_button;
    }
}
