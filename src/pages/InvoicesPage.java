package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InvoicesPage extends PageObject {

	Actions builder = new Actions(driver);

	@FindBy(id = "home-page-user")
	WebElement userID;

	@FindBy(xpath = "//*[text()[contains(.,'Select client')]]")
	WebElement filterClient;

	@FindBy(id = "filter-from")
	WebElement filterFrom;

	@FindBy(css = ".v-date-picker-table .v-btn")
	List<WebElement> fromDate;

	@FindBy(id = "filter-from-ok")
	WebElement fromDateBtn;

	@FindBy(id = "filter-to")
	WebElement filterTo;

	@FindBy(id = "filter-period")
	WebElement filterPeriod;

	@FindBy(id = "this-month")
	WebElement filterPeriodThisMonth;

	@FindBy(id = "last-month")
	WebElement filterPeriodLastMonth;

	@FindBy(id = "reset-dates")
	WebElement filterPeriodResetDates;

	@FindBy(id = "filter-reset")
	WebElement filterReset;

	@FindBy(css = "#add-new-invoice .v-btn__content")
	WebElement addNewInvoice;

	@FindBy(css = ".v-menu__activator button[id *=context-]")
	List<WebElement> threeStops;

	@FindBy(id = "context-edit-545")
	WebElement editInvoice;

	@FindBy(id = "context-preview-545")
	WebElement previewInvoice;

	@FindBy(xpath = "//*[text()[contains(.,'Preview Invoice')]]")
	WebElement preview;

	@FindBy(xpath = "//*[text()[contains(.,'close')]]")
	WebElement closeBtnOnPreview;

	@FindBy(xpath = "//*[text()[contains(.,'Pera Peric')]]")
	WebElement filterClientPicked;

	@FindBy(className = "invoice-list-items")
	List<WebElement> clientNumb;
	
	@FindBy(css="div[class*='active'] a[id*='context-edit']")
	WebElement editBtn;
	
	@FindBy(css="div[class*='active'] a[id*='context-preview']")
	WebElement previewBtn;
	
	@FindBy(css="div[class*='active'] button[id*='context-delete']")
	WebElement deleteBtn;
	
	@FindBy(xpath = "//*[text()[contains(.,'Do you want to delete this invoice?')]]")
	WebElement deleteMessage;

	

	public InvoicesPage(WebDriver driver) {
		super(driver);
	}

	public boolean userID() {
		wait.until(ExpectedConditions.visibilityOf(userID));
		return userID.isDisplayed();

	}

	public void filterClient() {
		wait.until(ExpectedConditions.visibilityOf(filterClient));
		wait.until(ExpectedConditions.elementToBeClickable(filterClient));

		filterClient.click();
		wait.until(ExpectedConditions.visibilityOf(filterClientPicked));
		wait.until(ExpectedConditions.elementToBeClickable(filterClientPicked));

		filterClientPicked.click();
		
		

	}

	public void filterPeriod() {
		wait.until(ExpectedConditions.elementToBeClickable(filterPeriod));

		filterPeriod.click();

	}

	public void filterPeriodThisMonth() {
		wait.until(ExpectedConditions.elementToBeClickable(filterPeriodThisMonth));

		filterPeriodThisMonth.click();

	}

	public void filterPeriodLastMonth() {
		wait.until(ExpectedConditions.elementToBeClickable(filterPeriodLastMonth));

		filterPeriodLastMonth.click();

	}

	public void filterPeriodResetDates() {
		wait.until(ExpectedConditions.elementToBeClickable(filterPeriodResetDates));

		filterPeriodResetDates.click();

	}

	public void filterPeriodReset() {
		wait.until(ExpectedConditions.elementToBeClickable(filterReset));

		filterReset.click();

	}

	public void addNewInvoice() {

		wait.until(ExpectedConditions.elementToBeClickable(addNewInvoice));

		addNewInvoice.click();

		// Action clickOnAddNew = builder
		// .moveToElement(addNewInvoice)
		// .click()
		// .build();
		//
		// clickOnAddNew.perform();

	}

	public void threeStops() {
		wait.until(ExpectedConditions.visibilityOfAllElements(threeStops));

		threeStops.get(0).click();

	}


	public void closePreview() {
		wait.until(ExpectedConditions.elementToBeClickable(closeBtnOnPreview));

		preview.isDisplayed();

		closeBtnOnPreview.click();

		wait.until(ExpectedConditions.elementToBeClickable(addNewInvoice));

	}

	public int clientNumb() {
		wait.until(ExpectedConditions.visibilityOfAllElements(clientNumb));

		return clientNumb.size();

	}
	
	public void deleteInvoice() {
		wait.until(ExpectedConditions.visibilityOf(deleteBtn));
		wait.until(ExpectedConditions.elementToBeClickable(deleteBtn));
		
		deleteBtn.click();
	}
	
	public boolean deleteMsg() {
		wait.until(ExpectedConditions.visibilityOf(deleteMessage));
		return deleteMessage.isDisplayed();
	}
	
	public void editInvoice() {
		
		wait.until(ExpectedConditions.elementToBeClickable(editBtn));
		editBtn.click();
	}
	
	
	public void previewInvoice() {
		
		wait.until(ExpectedConditions.elementToBeClickable(previewBtn));
		previewBtn.click();
	}

}
