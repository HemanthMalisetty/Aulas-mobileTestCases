package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import Andriod_BaseTest.AulasBaseTest;
import Pages.AulasCarePage;
import Pages.AulasWalletPage;
import Pages.FeePage;
import Pages.HomePage;
import Pages.NotificationPage;
import Pages.SchedulePage;
import io.appium.java_client.android.AndroidDriver;

public class DataOperatorFeemanagerFeeTest extends AulasBaseTest  {
	
	public AndroidDriver driver;
	public SchedulePage SP;
	public HomePage HP;
	public AulasCarePage AC;
	public AulasWalletPage AW;
	public NotificationPage NP;
	public FeePage FP;

	ExtentReports extent;

	@BeforeSuite
	public void doLoginOperation() throws InterruptedException, IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//Resources//config.properties");
		prop.load(fis);
		NameOFOS();
		
		Thread.sleep(8000);

		LP.checkUpdates();
		HP = LP.Login(prop.getProperty("SuperAdmniPhno"), prop.getProperty("OTP"));
		Thread.sleep(3000);

		HP.clickOnMoreButton();
	}

	@Test(priority = 1)

	public void validateSettings() throws InterruptedException {
		wait(2000);
		System.out.println("validateSettings test cases started ..");
		FP = HP.clickOnFee();
		wait(1000);
		FP.validateSettings();
		System.out.println("validateSettings test cases completed ..");

	}
	
	@Test(priority = 2)

	public void validateFeeViewMore() throws InterruptedException {
		wait(2000);
		System.out.println("validateFeeViewMore test cases started ..");
		FP = HP.clickOnFee();
		wait(1000);
		FP.validateFeeViewMore();
		System.out.println("validateFeeViewMore test cases completed ..");
	}
	
	@Test(priority = 3)

	public void validateGeneratePaymentRequestIndividual() throws InterruptedException {
		wait(2000);
		System.out.println("validateGeneratePaymentRequestIndividual test cases started ..");
		FP = HP.clickOnFee();
		wait(1000);
		FP.validateGeneratePaymentRequestIndividual();
		System.out.println("validateGeneratePaymentRequestIndividual test cases completed ..");

	}
	@Test(priority = 4)

	public void validateGeneratePaymentRequestClass() throws InterruptedException {
		wait(2000);
		System.out.println("validateGeneratePaymentRequestClass test cases started ..");
		FP = HP.clickOnFee();
		wait(1000);
		FP.validateGeneratePaymentRequestClass();
		System.out.println("validateGeneratePaymentRequestClass test cases completed ..");

	}
	@Test(priority = 5)

	public void validateAddOfflinePayment() throws InterruptedException {
		wait(2000);
		System.out.println("validateAddOfflinePayment test cases started ..");
		FP = HP.clickOnFee();
		wait(1000);
		FP.validateAddOfflinePayment();
		System.out.println("validateAddOfflinePayment test cases completed ..");

	}
	@Test(priority = 6)

	public void validateTransactionsTypeofpayment() throws InterruptedException {
		wait(2000);
		System.out.println("validateTransactionsTypeofpayment test cases started ..");
		FP = HP.clickOnFee();
		wait(1000);
		FP.validateTransactionsTypeofpayment();
		System.out.println("validateTransactionsTypeofpayment test cases completed ..");

	}
	@Test(priority = 7)

	public void validateTransactionsPaymentDatefilter() throws InterruptedException {
		wait(2000);
		System.out.println("validateTransactionsPaymentDatefilter test cases started ..");
		FP = HP.clickOnFee();
		wait(1000);
		FP.validateTransactionsPaymentDatefilter();
		System.out.println("validateTransactionsPaymentDatefilter test cases completed ..");

	}
	@Test(priority = 8)

	public void validateTransactionsInvoiceDownload() throws InterruptedException {
		wait(2000);
		System.out.println("validateTransactionsInvoiceDownload test cases started ..");
		FP = HP.clickOnFee();
		wait(1000);
		FP.validateTransactionsInvoiceDownload();
		System.out.println("validateTransactionsInvoiceDownload test cases completed ..");

	}
	@Test(priority = 9)

	public void validateTransactionsAddOfflinePayment() throws InterruptedException {
		wait(2000);
		System.out.println("validateTransactionsAddOfflinePayment test cases started ..");
		FP = HP.clickOnFee();
		wait(1000);
		FP.validateTransactionsAddOfflinePayment();
		System.out.println("validateTransactionsAddOfflinePayment test cases completed ..");

	}
	@Test(priority = 10)

	public void validateAllStudentsOverview() throws InterruptedException {
		wait(2000);
		System.out.println("validateAllStudentsOverview test cases started ..");
		FP = HP.clickOnFee();
		wait(1000);
		FP.validateAllStudentsOverview();
		System.out.println("validateAllStudentsOverview test cases completed ..");

	}
	@Test(priority = 11)

	public void validateRecentActivities() throws InterruptedException {
		wait(2000);
		System.out.println("validateRecentActivities test cases started ..");
		FP = HP.clickOnFee();
		wait(1000);
		FP.validateRecentActivities();
		System.out.println("validateRecentActivities test cases completed ..");

	}
}