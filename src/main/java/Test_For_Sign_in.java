import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_For_Sign_in {

    WebDriver driver;
    Util_Class util_class = new Util_Class();

    @BeforeClass
    public void init_driver(){
        System.setProperty("webdriver.chrome.driver",util_class.driver_place);
        driver = new ChromeDriver();
        driver.get(util_class.getUrl_Presto());
    }

    @Test
    public void test_title(){
        String title_from_page = driver.getTitle();
        Assert.assertEquals(util_class.titel_Presto, title_from_page);
    }

}
