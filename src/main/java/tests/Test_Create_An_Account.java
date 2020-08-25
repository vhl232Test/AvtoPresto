package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Autorization_Page;
import pages.Main_page;

public class Test_Create_An_Account {
    WebDriver driver;
    Main_page main_page;
    Autorization_Page autorization_page;
    Util_Class util_class = new Util_Class();

    @BeforeClass
    public void init_driver(){
        System.setProperty("webdriver.chrome.driver",util_class.getDriver_place());
        driver = new ChromeDriver();
        driver.get(util_class.getUrl_Presto());
        driver.manage().window().maximize();

        main_page = new Main_page(driver);
        autorization_page = new Autorization_Page(driver);

    }

    @Test
    public void register_user(){
        main_page.getSign_in_button().click();
        autorization_page.getEmail_create_user_field().sendKeys(util_class.getPost_for_user());
        autorization_page.getCreate_account_button().click();
    }


}
