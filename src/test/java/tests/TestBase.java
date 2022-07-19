package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
//
    String webPage = "https://www.linkedin.com/home";

    protected WebDriver wd;

    @BeforeSuite
    public void init() throws InterruptedException {
        wd = new ChromeDriver();
        wd.get(webPage);


//        wd.manage().window().maximize();

    }


    @AfterSuite
    public void tearDown() {
        wd.quit();
    }

}
