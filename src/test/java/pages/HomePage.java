package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver wd) {
        super(wd);
    }

    @FindBy(xpath = "//input[@id='session_key']")
    WebElement emailInputElement;

    @FindBy(xpath = "//input[@id='session_password']")
    WebElement passwordInputElement;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitBtn;

    @FindBy(css = "button[aria-label='Show your LinkedIn password']")
    WebElement showPassword;

    public HomePage fillEmail(String email) {
        emailInputElement.sendKeys(email);
        return this;
    }

    public HomePage fillPassword(String password) {
        passwordInputElement.sendKeys(password);
        return this;
    }

    public HomePage clickShowPassword() {
        showPassword.click();
        return this;
    }

    public void clickSignInButton() {
        submitBtn.click();
    }

    public WebElement getSubmitBtn() {
        return submitBtn;
    }
}
