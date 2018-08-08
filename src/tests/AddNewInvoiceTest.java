package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AddNewInvoicePage;
import pages.InvoicesPage;
import pages.Util;

public class AddNewInvoiceTest extends InitTest {

	@Test(priority = 15)
	public void addNewInvoiceAndGoBack() throws InterruptedException {
		InvoicesPage invoice = new InvoicesPage(driver);
		AddNewInvoicePage addNewInvoice = new AddNewInvoicePage(driver);

		invoice.addNewInvoice();
		Thread.sleep(500);
		addNewInvoice.backBtn();
		Assert.assertTrue(invoice.userID());

	}

	@Test(priority = 16)
	public void addNewInvoice() {
		InvoicesPage invoice = new InvoicesPage(driver);

		invoice.addNewInvoice();

	}

	@Test(priority = 17)
	public void noInputJustSave() throws InterruptedException {
		AddNewInvoicePage addNewInvoice = new AddNewInvoicePage(driver);

		Thread.sleep(500);

		addNewInvoice.save();

		Assert.assertTrue(addNewInvoice.errorClient());
		Assert.assertTrue(addNewInvoice.errorBusiness());
		Assert.assertTrue(addNewInvoice.errorInvoicesNumber());
		Assert.assertTrue(addNewInvoice.errorBasis());
		Assert.assertTrue(addNewInvoice.errorCurrency());
		Assert.assertTrue(addNewInvoice.errorBank());

	}

	@Test(priority = 18)
	public void CheckNewInvoiceForm() {
		AddNewInvoicePage addNewInvoice = new AddNewInvoicePage(driver);

		Assert.assertTrue(addNewInvoice.checkTitle());

		

	}

	@Test(priority = 19)
	public void formStatus() {
		AddNewInvoicePage addNewInvoice = new AddNewInvoicePage(driver);

		addNewInvoice.formStatus();
		addNewInvoice.formPicked();

	}

	@Test(priority = 20)
	public void to() {
		AddNewInvoicePage addNewInvoice = new AddNewInvoicePage(driver);

		addNewInvoice.toClientList();
		addNewInvoice.toClientPicked();
		Assert.assertTrue(addNewInvoice.toAddress());

	}

	@Test(priority = 21)
	public void from() {
		AddNewInvoicePage addNewInvoice = new AddNewInvoicePage(driver);

		addNewInvoice.fromBusinessList();
		addNewInvoice.fromBusinessPicked();
		Assert.assertTrue(addNewInvoice.fromAddress());

	}

	@Test(priority = 22)
	public void submittedDate() {
		AddNewInvoicePage addNewInvoice = new AddNewInvoicePage(driver);

		addNewInvoice.submittedDate(5);

	}

	@Test(priority = 23)
	public void dueDate() throws InterruptedException {
		AddNewInvoicePage addNewInvoice = new AddNewInvoicePage(driver);
		Thread.sleep(500);
		addNewInvoice.dueDate(8);

	}

	@Test(priority = 24)
	public void basis() {
		AddNewInvoicePage addNewInvoice = new AddNewInvoicePage(driver);

		addNewInvoice.basis("nemam pojma");

	}

	@Test(priority = 25)
	public void toCurrencyPicked() {
		AddNewInvoicePage addNewInvoice = new AddNewInvoicePage(driver);

		addNewInvoice.currency();
		addNewInvoice.toCurrencyPicked();

	}

	@Test(priority = 26)
	public void addWrongInvoiceContentAndDelete() {
		AddNewInvoicePage addNewInvoice = new AddNewInvoicePage(driver);

		Assert.assertTrue(addNewInvoice.addInvoiceContentBtn());
		addNewInvoice.addInvoiceContent();
		addNewInvoice.service("Service");
		addNewInvoice.note("Note");
		addNewInvoice.days("asd");
		addNewInvoice.ratePerHour("asd");
		Assert.assertTrue(addNewInvoice.errorDaysAndRPH());

		addNewInvoice.notes("One more note");
		addNewInvoice.discount("asd");
		addNewInvoice.tax("asd");
		Assert.assertTrue(addNewInvoice.errorDiscountAndTax());

		addNewInvoice.deleteInvoiceContent();

	}

	@Test(priority = 27)
	public void addInvoiceContent() {
		AddNewInvoicePage addNewInvoice = new AddNewInvoicePage(driver);

		Assert.assertTrue(addNewInvoice.addInvoiceContentBtn());
		addNewInvoice.addInvoiceContent();
		addNewInvoice.service("Service");
		addNewInvoice.note("Note");
		addNewInvoice.days("15");
		addNewInvoice.ratePerHour("5");

		addNewInvoice.notes("One more note");
		addNewInvoice.discount("5");
		addNewInvoice.tax("15");

	}

	@Test(priority = 28)
	public void bank() {
		AddNewInvoicePage addNewInvoice = new AddNewInvoicePage(driver);

		addNewInvoice.bank();

	}

	@Test(priority = 29)
	public void save() {
		AddNewInvoicePage addNewInvoice = new AddNewInvoicePage(driver);

		addNewInvoice.save();

		Assert.assertTrue(addNewInvoice.errorTitle());

	}

	@Test(priority = 30)
	public void title() {
		AddNewInvoicePage addNewInvoice = new AddNewInvoicePage(driver);

		addNewInvoice.checkTitle();
		addNewInvoice.enterTitle("New Title");
		addNewInvoice.save();

	}

}
