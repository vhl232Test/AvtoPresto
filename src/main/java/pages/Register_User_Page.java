package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_User_Page {
    WebDriver driver;

    public Register_User_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id = 'id_gender1']")
    WebElement gender_man;
    @FindBy(xpath = "//label[text()= 'First name ']/following-sibling::input")
    WebElement first_name_field;
    @FindBy(xpath = "//label[text()= 'Last name ']/following-sibling::input")
    WebElement last_name_field;
    @FindBy(xpath = "//label[text()= 'Password ']/following-sibling::input")
    WebElement password_field;
    @FindBy(xpath = "//label[text()= 'Date of Birth']/parent::div//select[@name = 'days']")
    WebElement day_of_birth;
    @FindBy(xpath = "//label[text()= 'Date of Birth']/parent::div//select[@name = 'months']")
    WebElement month_of_birth;
    @FindBy(xpath = "//div[@id = 'cuselFrame-years']")
    WebElement years_select;
    @FindBy(xpath = "//div[@id = 'cusel-scroll-years']/span[@val = \"2020\"]")
    WebElement year;
    @FindBy(xpath = "//input[@id = 'newsletter']")
    WebElement checkbox_newsletter;
    @FindBy(xpath = "//input[@id = 'optin']")
    WebElement receive_offers_checkbox;
    @FindBy(xpath = "//span[text() = 'Register']")
    WebElement register_button;

    public WebElement getYear() {
        return year;
    }

    public WebElement getCheckbox_newsletter() {
        return checkbox_newsletter;
    }

    public WebElement getReceive_offers_checkbox() {
        return receive_offers_checkbox;
    }

    public WebElement getRegister_button() {
        return register_button;
    }

    public WebElement getGender_man() {
        return gender_man;
    }

    public WebElement getFirst_name_field() {
        return first_name_field;
    }

    public WebElement getLast_name_field() {
        return last_name_field;
    }

    public WebElement getPassword_field() {
        return password_field;
    }

    public WebElement getDay_of_birth() {
        return day_of_birth;
    }

    public WebElement getMonth_of_birth() {
        return month_of_birth;
    }

    public WebElement getYears_select() {
        return years_select;
    }
}
