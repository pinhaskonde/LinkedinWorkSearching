package tests;

import UserDTO.User;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.UsersPage;

public class Tests extends TestBase {
    public HomePage homePage;
    UsersPage usersPage;

    User user;

    Logger logger = LoggerFactory.getLogger(HomePage.class);

    @BeforeMethod
    public void initElements() {
        homePage = PageFactory.initElements(wd, HomePage.class);
        usersPage = PageFactory.initElements(wd, UsersPage.class);
    }

    @Test
    public void loginTestNegativePassword() throws InterruptedException {
        logger.info("Navigate to --> " + wd.getCurrentUrl());
        user = new User("pinhas.konde@gmail.com", ".AbcdeFg2000");
        logger.info("User email: " + user.getEmail());
        logger.info("User password: " + user.getPassword());

        homePage.fillEmail(user.getEmail())
                .fillPassword(user.getPassword())
                .clickShowPassword()
                .clickSignInButton();

        Assert.assertTrue(homePage.getSubmitBtn().isDisplayed());
        Thread.sleep(3000);
    }


}
