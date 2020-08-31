package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Authentication_Page;
import pages.Main_page;
import pages.My_account_Page;


public class Test_For_Sign_in {

    WebDriver driver;
    Util_Class util_class = new Util_Class();
    Main_page main_page;
    Authentication_Page authentication_page;
    My_account_Page my_account_page;

    @BeforeClass
    public void init_driver(){
        System.setProperty("webdriver.chrome.driver",util_class.getDriver_place());
        driver = new ChromeDriver();
        driver.get(util_class.getUrl_Presto());
        driver.manage().window().maximize();

        main_page = new Main_page(driver);
        authentication_page = new Authentication_Page(driver);
        my_account_page = new My_account_Page(driver);
    }

    @Test(priority = 0)
    public void test_title(){
        String title_from_page = driver.getTitle();
        Assert.assertEquals(util_class.title_Presto, title_from_page);
    }

    @Test(priority = 1)
    public void sign_in_User(){

        main_page.getSign_in_button().click();

        authentication_page.getEmail_field_registered_user().sendKeys(util_class.getPost_for_user());
        authentication_page.getPassword_field_registered_user().sendKeys(util_class.getUser_password());
        authentication_page.getSign_in_button().click();

        String welcome_to_account_message = "Welcome to your account. Here you can manage all of your personal information and orders.";

        Assert.assertEquals(welcome_to_account_message,my_account_page.getWelcome_account_message().getText());
    }

    @AfterClass
    public void close_browser(){
        driver.quit();
    }

}
