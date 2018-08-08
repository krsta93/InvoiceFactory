package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends PageObject {

	@FindBy(id = "login-form-email")
	WebElement username;

	@FindBy(id = "login-pass")
	WebElement pass;

	@FindBy(id = "login-form-btn")
	WebElement loginBtn;

	@FindBy(css = ".v-input__icon .v-icon")
	WebElement visibilityBtn;

	@FindBy(xpath = "//*[text()[contains(.,'The email field is required.')]]")
	WebElement errorEmail;

	@FindBy(xpath = "//*[text()[contains(.,'The password field is required.')]]")
	WebElement errorPass;

	@FindBy(xpath = "//*[text()[contains(.,'Too Many Attempts.')]]")
	WebElement errorMsgEmail;

	@FindBy(xpath = "//*[text()[contains(.,'Invalid credentials.')]]")
	WebElement errorMsgPass;

	@FindBy(xpath = "//*[text()[contains(.,'The password field may not be greater than 20 characters.')]]")
	WebElement tooMuchChar;

	@FindBy(xpath = "//*[text()[contains(.,'The password field must be at least 6 characters.')]]")
	WebElement lessThenSixCharInPass;

	@FindBy(xpath = "//*[text()[contains(.,'The email field must be a valid email.')]]")
	WebElement invalidEmail;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void fillInputs(String username, String pass) {
		this.username.clear();
		this.username.sendKeys(username);

		this.pass.clear();
		this.pass.sendKeys(pass);
	}

	public void visiblePass() {
		visibilityBtn.click();
	}

	public void sbumit() {
		loginBtn.click();
	}

	public boolean errorMsgEmail() {
		wait.until(ExpectedConditions.visibilityOf(errorEmail));
		return errorEmail.isDisplayed();
	}

	public boolean errorMsgPass() {
		wait.until(ExpectedConditions.visibilityOf(errorPass));
		return errorPass.isDisplayed();
	}

	public boolean errorMsgLoginEmail() {
		wait.until(ExpectedConditions.visibilityOf(errorMsgEmail));
		return errorMsgEmail.isDisplayed();
	}

	public boolean errorMsgLoginPass() {
		wait.until(ExpectedConditions.visibilityOf(errorMsgPass));
		return errorMsgPass.isDisplayed();
	}

	public boolean msgTooMuchChar() {
		wait.until(ExpectedConditions.visibilityOf(tooMuchChar));
		return tooMuchChar.isDisplayed();
	}

	public boolean msgLessThanSixCharInPass() {
		wait.until(ExpectedConditions.visibilityOf(lessThenSixCharInPass));
		return lessThenSixCharInPass.isDisplayed();
	}

	public boolean msgInvalidEmail() {
		wait.until(ExpectedConditions.visibilityOf(invalidEmail));
		return invalidEmail.isDisplayed();
	}

}
