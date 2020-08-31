package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Authentication_Page;
import pages.Main_page;
import pages.My_account_Page;
import pages.Register_User_Page;

public class Test_Create_An_Account {
    WebDriver driver;
    Main_page main_page;
    Authentication_Page authentication_page;
    Register_User_Page register_user_page;
    Util_Class util_class = new Util_Class();
    My_account_Page my_account_page;

    Select select;

    @BeforeClass
    public void init_driver(){
        System.setProperty("webdriver.chrome.driver",util_class.getDriver_place());
        driver = new ChromeDriver();
        driver.get(util_class.getUrl_Presto());
        driver.manage().window().maximize();

        main_page = new Main_page(driver);
        authentication_page = new Authentication_Page(driver);
        register_user_page = new Register_User_Page(driver);
        my_account_page = new My_account_Page(driver);

    }

    @Test
    public void register_user() throws InterruptedException {
        main_page.getSign_in_button().click();
        authentication_page.getEmail_create_user_field().sendKeys(util_class.getPost_for_user());
        authentication_page.getCreate_account_button().click();


        Thread.sleep(3000);
        register_user_page.getGender_man().click();
        register_user_page.getFirst_name_field().sendKeys(util_class.getUser_First_name());
        register_user_page.getLast_name_field().sendKeys(util_class.getUser_Last_name());
        register_user_page.getPassword_field().sendKeys(util_class.getUser_password());

        select = new Select(register_user_page.getDay_of_birth());
        select.selectByValue("10");

        select = new Select(register_user_page.getMonth_of_birth());
        select.selectByValue("2");

        register_user_page.getYears_select().click();
        register_user_page.getYear().click();

        register_user_page.getCheckbox_newsletter().click();
        register_user_page.getReceive_offers_checkbox().click();

        register_user_page.getRegister_button().click();

        String check_register_message = "Your account has been created.";

        Assert.assertEquals(check_register_message,my_account_page.getCreate_account_success_messages().getText());

    }

    @AfterClass
    public void close_browser(){
        driver.quit();
    }



}
