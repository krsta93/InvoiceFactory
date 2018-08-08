package pages;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class AddNewInvoicePage extends PageObject {

	@FindBy(id = "inv-form-back-btn")
	WebElement backBtn;

	@FindBy(id = "click-to-enter")
	WebElement clickTitle;

	@FindBy(id = "invoice-title-content")
	WebElement enterTitle;

	@FindBy(id = "inv-form-status")
	WebElement formStatus;

	@FindBy(className = "v-select__selections")
	List<WebElement> dropDown;

	@FindBy(id = "inv-form-save-btn")
	WebElement saveBtn;

	@FindBy(xpath = "//*[text()[contains(.,'The client field is required.')]]")
	WebElement errorClient;

	@FindBy(xpath = "//*[text()[contains(.,'The business field is required.')]]")
	WebElement errorBusiness;

	@FindBy(xpath = "//*[text()[contains(.,'The Invoice number field is required.')]]")
	WebElement errorInvoicesNumber;

	@FindBy(xpath = "//*[text()[contains(.,'The Basis field is required.')]]")
	WebElement errorBasis;

	@FindBy(xpath = "//*[text()[contains(.,'The currency field is required.')]]")
	WebElement errorCurrency;

	@FindBy(xpath = "//*[text()[contains(.,'The bank field is required.')]]")
	WebElement errorBank;

	@FindBy(xpath = "//*[text()[contains(.,'Sent')]]")
	WebElement formPicked;

	@FindBy(xpath = "//*[text()[contains(.,'Pera Peric')]]")
	WebElement toClientPicked;

	@FindBy(xpath = "//*[text()[contains(.,'IT Bootcamp')]]")
	WebElement fromBusinessPicked;

	@FindBy(id = "inv-form-number")
	WebElement invoice;

	@FindBy(id = "inv-form-date-submitted")
	WebElement submittedDate;

	@FindBy(css = ".v-btn.v-btn--flat.v-btn--floating")
	List<WebElement> listOfDates;

	@FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/table/tbody/tr[3]/td[5]/button/div")
	WebElement dueDatePick;

	@FindBy(id = "inv-form-date-ok-submitted")
	WebElement okButtonSubmittedDate;

	@FindBy(id = "inv-form-date-duedate")
	WebElement dueDate;

	@FindBy(id = "inv-form-date-ok-duedate")
	WebElement okButtonDueDate;

	@FindBy(id = "inv-form-basis")
	WebElement basis;

	@FindBy(id = "add-content-btn")
	WebElement addInvoiceContent;

	@FindBy(id = "inv-form-service-0")
	WebElement service;

	@FindBy(id = "inv-form-note-0")
	WebElement note;

	@FindBy(id = "inv-form-days-0")
	WebElement days;

	@FindBy(id = "inv-form-hours-0")
	WebElement hours;

	@FindBy(id = "inv-form-rate-0")
	WebElement ratePerHour;

	@FindBy(id = "inv-form-amount-0")
	WebElement amount;

	@FindBy(id = "inv-form-notes")
	WebElement notes;

	@FindBy(id = "inv-form-discount")
	WebElement discount;

	@FindBy(id = "inv-form-tax")
	WebElement tax;

	@FindBy(xpath = "//*[text()[contains(.,'Dinar')]]")
	WebElement toCurrencyPicked;

	@FindBy(css = "label[for=\"inv-form-select-bank\"]")
	WebElement bank;

	@FindBy(xpath = "//*[text()[contains(.,'Komercijalna')]]")
	WebElement bankKomercijalna;

	@FindBy(xpath = "//*[text()[contains(.,'The title field is required.')]]")
	WebElement errorTitle;

	@FindBy(xpath = "//*[text()[contains(.,'The days field must be numeric and may contain  decimal points.')]]")
	WebElement errorDaysAndRPH;

	@FindBy(xpath = "//*[text()[contains(.,'The discount field must be 0 or more.')]]")
	WebElement errorDiscountAndTax;

	@FindBy(id = "context-delete-inv-content-delete-0")
	WebElement deleteInvoiceContent;

	@FindBy(id = "context-download-dialog-yes-inv-content-delete-0")
	WebElement confirmeDelete;

	@FindBy(id = "inv-form-client-address")
	WebElement toAddress;

	@FindBy(id = "inv-form-business-address")
	WebElement fromAddress;

	public AddNewInvoicePage(WebDriver driver) {
		super(driver);
	}

	public void backBtn() {
		wait.until(ExpectedConditions.elementToBeClickable(backBtn));

		backBtn.click();

	}

	public boolean checkTitle() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("click-to-enter")));

		return clickTitle.isDisplayed();

	}

	public void enterTitle(String title) {

		wait.until(ExpectedConditions.elementToBeClickable(clickTitle));

		clickTitle.click();
		enterTitle.sendKeys(title);

	}

	public void formStatus() {

		dropDown.get(0).click();

	}

	public void toClientList() {

		dropDown.get(1).click();

	}

	public void fromBusinessList() {

		dropDown.get(2).click();

	}

	public void currency() {

		dropDown.get(3).click();

	}

	public boolean errorClient() {
		wait.until(ExpectedConditions.visibilityOf(errorClient));
		return errorClient.isDisplayed();
	}

	public boolean errorBusiness() {
		wait.until(ExpectedConditions.visibilityOf(errorBusiness));
		return errorBusiness.isDisplayed();
	}

	public boolean errorInvoicesNumber() {
		wait.until(ExpectedConditions.visibilityOf(errorInvoicesNumber));
		return errorInvoicesNumber.isDisplayed();
	}

	public boolean errorBasis() {
		wait.until(ExpectedConditions.visibilityOf(errorBasis));
		return errorBasis.isDisplayed();
	}

	public boolean errorCurrency() {
		wait.until(ExpectedConditions.visibilityOf(errorCurrency));
		return errorCurrency.isDisplayed();
	}

	public boolean errorBank() {
		wait.until(ExpectedConditions.visibilityOf(errorBank));
		return errorBank.isDisplayed();
	}

	public boolean errorTitle() {
		wait.until(ExpectedConditions.visibilityOf(errorTitle));
		return errorTitle.isDisplayed();
	}

	public boolean errorDaysAndRPH() {
		wait.until(ExpectedConditions.visibilityOf(errorDaysAndRPH));
		return errorDaysAndRPH.isDisplayed();
	}

	public boolean errorDiscountAndTax() {
		wait.until(ExpectedConditions.visibilityOf(errorDiscountAndTax));
		return errorDiscountAndTax.isDisplayed();
	}

	public boolean toAddress() {
		wait.until(ExpectedConditions.visibilityOf(toAddress));
		return toAddress.isDisplayed();
	}

	public boolean fromAddress() {
		wait.until(ExpectedConditions.visibilityOf(fromAddress));
		return fromAddress.isDisplayed();
	}

	public void save() {
		wait.until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
	}

	public void formPicked() {
		wait.until(ExpectedConditions.elementToBeClickable(formPicked));
		formPicked.click();
	}

	public void toClientPicked() {
		wait.until(ExpectedConditions.elementToBeClickable(toClientPicked));
		toClientPicked.click();
	}

	public void fromBusinessPicked() {
		wait.until(ExpectedConditions.elementToBeClickable(fromBusinessPicked));
		fromBusinessPicked.click();
	}

	public void invoice(String number) {
		wait.until(ExpectedConditions.elementToBeClickable(invoice));
		invoice.click();
		invoice.clear();
		invoice.sendKeys(number);

	}

	public void submittedDate(int date) {
		submittedDate.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(listOfDates));
		listOfDates.get(date).click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonSubmittedDate));
		okButtonSubmittedDate.click();
	}

	public void dueDate(int date) throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(dueDate));

		dueDate.click();
		wait.until(ExpectedConditions.elementToBeClickable(okButtonDueDate));
		Thread.sleep(500);
		listOfDates.get(date).click();
		okButtonDueDate.click();

	}

	public void basis(String text) {
		wait.until(ExpectedConditions.elementToBeClickable(basis));
		basis.click();
		basis.sendKeys(text);
	}

	// *********************INVOICE CONTENTS***********************

	public void addInvoiceContent() {
		wait.until(ExpectedConditions.elementToBeClickable(addInvoiceContent));
		addInvoiceContent.click();
	}

	public boolean addInvoiceContentBtn() {
		wait.until(ExpectedConditions.elementToBeClickable(addInvoiceContent));
		return addInvoiceContent.isDisplayed();
	}

	public void service(String text) {
		wait.until(ExpectedConditions.elementToBeClickable(service));
		service.click();
		service.sendKeys(text);
	}

	public void note(String text) {
		wait.until(ExpectedConditions.elementToBeClickable(note));
		note.click();
		note.sendKeys(text);
	}

	public void days(String text) {
		wait.until(ExpectedConditions.elementToBeClickable(days));
		days.click();
		days.clear();
		days.sendKeys(text);

	}

	public void ratePerHour(String text) {
		wait.until(ExpectedConditions.elementToBeClickable(ratePerHour));
		ratePerHour.click();
		ratePerHour.clear();
		ratePerHour.sendKeys(text);

	}

	public void notes(String text) {
		wait.until(ExpectedConditions.elementToBeClickable(notes));
		wait.until(ExpectedConditions.visibilityOf(notes));
		notes.click();
		notes.clear();		
		notes.sendKeys(text);
	}

	public void discount(String text) {
		wait.until(ExpectedConditions.elementToBeClickable(discount));
		discount.click();
		discount.clear();
		discount.sendKeys(text);
	}

	public void tax(String text) {
		wait.until(ExpectedConditions.elementToBeClickable(tax));
		tax.click();
		tax.clear();
		tax.sendKeys(text);
	}

	public void deleteInvoiceContent() {
		wait.until(ExpectedConditions.elementToBeClickable(deleteInvoiceContent));
		deleteInvoiceContent.click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmeDelete));
		confirmeDelete.click();

	}

	public void toCurrencyPicked() {
		toCurrencyPicked.click();
	}

	public void bank() {
		wait.until(ExpectedConditions.elementToBeClickable(bank));
		bank.click();
		wait.until(ExpectedConditions.elementToBeClickable(bankKomercijalna));
		bankKomercijalna.click();
	}

}
