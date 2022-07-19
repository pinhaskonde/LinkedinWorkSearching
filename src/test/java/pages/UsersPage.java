package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersPage extends BasePage{


    public UsersPage(WebDriver wd) {
        super(wd);
    }

    @FindBy(xpath = "//li[6]//div[1]//button[1]//span[1]")
    WebElement meUsersLink;

    public WebElement getMeUsersLink() {
        return meUsersLink;
    }
}
