package tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import pages.InvoicesPage;

public class InvoicesListTest extends InitTest {

	@Test(priority = 31)
	public void userID() {
		InvoicesPage invoice = new InvoicesPage(driver);

		invoice.userID();

	}

	@Test(priority = 32)
	public void filterClient() throws InterruptedException {
		InvoicesPage invoice = new InvoicesPage(driver);
		Thread.sleep(1000);
		invoice.filterClient();
		
		int invoiceNumb = 2;
		int numb = invoice.clientNumb();

		if (invoiceNumb == numb) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 33)
	public void thisMonth() {
		InvoicesPage invoice = new InvoicesPage(driver);

		invoice.filterPeriod();
		invoice.filterPeriodThisMonth();
		
		int invoiceNumb = 1;
		int numb = invoice.clientNumb();

		if (invoiceNumb == numb) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 34)
	public void lastMonth() {
		InvoicesPage invoice = new InvoicesPage(driver);

		invoice.filterPeriod();
		invoice.filterPeriodLastMonth();
		
		int invoiceNumb = 1;
		int numb = invoice.clientNumb();

		if (invoiceNumb == numb) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 35)
	public void resetMonth() {
		InvoicesPage invoice = new InvoicesPage(driver);

		invoice.filterPeriod();
		invoice.filterPeriodResetDates();
		
		int invoiceNumb = 2;
		int numb = invoice.clientNumb();

		if (invoiceNumb == numb) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 36)
	public void resetInvoices() {
		InvoicesPage invoice = new InvoicesPage(driver);

		invoice.filterPeriodReset();
		
		int invoiceNumb = 6;
		int numb = invoice.clientNumb();

		if (invoiceNumb == numb) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 37)
	public void numOfInvoices() {
		InvoicesPage invoice = new InvoicesPage(driver);

		int invoiceNumb = 6;
		int numb = invoice.clientNumb();

		if (invoiceNumb == numb) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 38)
	public void previewInvoice() throws InterruptedException {
		InvoicesPage invoice = new InvoicesPage(driver);

		invoice.threeStops();

		
		Thread.sleep(1000);
		 invoice.deleteInvoice();
		 Assert.assertTrue(invoice.deleteMsg());
		 Thread.sleep(5000);
	}

}
