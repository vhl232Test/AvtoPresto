package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Main_page;


public class Test_For_Sign_in {

    WebDriver driver;
    Util_Class util_class = new Util_Class();
    Main_page main_page;

    @BeforeClass
    public void init_driver(){
        System.setProperty("webdriver.chrome.driver",util_class.getDriver_place());
        driver = new ChromeDriver();
        driver.get(util_class.getUrl_Presto());
        driver.manage().window().maximize();

        main_page = new Main_page(driver);
    }

    @Test(priority = 0)
    public void test_title(){
        String title_from_page = driver.getTitle();
        Assert.assertEquals(util_class.title_Presto, title_from_page);
    }

    @Test(priority = 1)
    public void sign_in_User(){

        main_page.getSign_in_button().click();

    }



}
