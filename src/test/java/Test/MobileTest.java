package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import Andriod_BaseTest.AulasBaseTest;
import Pages.AttendancePage;
import Pages.AulasCarePage;
import Pages.FeePage;
import Pages.HomePage;
import Pages.SchedulePage;
import io.appium.java_client.android.AndroidDriver;

public class MobileTest extends AulasBaseTest {
	
	public AndroidDriver driver;
	public SchedulePage SP;
	public HomePage HP;
	public AulasCarePage AC;
	public AttendancePage AP;
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
	public void CreateScheduleBroadcast() throws InterruptedException {

		Thread.sleep(3000);
		System.out.println("Create schedule is started ");
		// nameOfOS();
		SP = HP.clickOnScheduleButton();
		SP.clickOnCalenderButton();
		SP.selectSubject();
		SP.selectClass();
		SP.selectTeacher();
		SP.selectModeOfClass("BROADCAST");
		//SP.clickBackButton();
		/*
		 * SP.selectStartDate("T"); SP.selectStartTime(); SP.selectEndTime();
		 * SP.repeatOn("T"); SP.selectLastDay(); SP.clickOnSaveBtn();
		 */
		System.out.println("Create schedule is completetd successfully.....");
	}

	@Test(priority = 2)
	public void CreateScheduleOffline() throws InterruptedException {

		Thread.sleep(3000);
		System.out.println("Create schedule OFFLINE is started ");
		SP = HP.clickOnScheduleButton();
		SP.clickOnCalenderButton();
		SP.selectSubject();
		SP.selectClass();
		SP.selectTeacher();
		SP.selectModeOfClass("OFFLINE");
		//SP.clickBackButton();
		/*
		 * SP.selectStartDate("T"); SP.selectStartTime(); SP.selectEndTime();
		 * SP.repeatOn("T"); SP.selectLastDay(); SP.clickOnSaveBtn();
		 */
		
		
		System.out.println("Create schedule OFFLINE is completetd successfully.....");
	}

	/**************************************************
	 * Fee Module
	 *********************************/

	@Test(priority = 3)

	public void validateSettings() throws InterruptedException {
		wait(2000);
		System.out.println("validateSettings test cases started ..");
		FP = HP.clickOnFee();
		wait(1000);
		FP.validateSettings();
		System.out.println("validateSettings test cases completed ..");

	}

	@Test(priority = 4)

	public void validateFeeViewMore() throws InterruptedException {
		wait(2000);
		System.out.println("validateFeeViewMore test cases started ..");
		FP = HP.clickOnFee();
		wait(1000);
		FP.validateFeeViewMore();
		System.out.println("validateFeeViewMore test cases completed ..");
	}

	@Test(priority = 5)

	public void validateGeneratePaymentRequestIndividual() throws InterruptedException {
		wait(2000);
		System.out.println("validateGeneratePaymentRequestIndividual test cases started ..");
		FP = HP.clickOnFee();
		wait(1000);
		FP.validateGeneratePaymentRequestIndividual();
		System.out.println("validateGeneratePaymentRequestIndividual test cases completed ..");

	}

	@Test(priority = 6)

	public void validateGeneratePaymentRequestClass() throws InterruptedException {
		wait(2000);
		System.out.println("validateGeneratePaymentRequestClass test cases started ..");
		FP = HP.clickOnFee();
		wait(1000);
		FP.validateGeneratePaymentRequestClass();
		System.out.println("validateGeneratePaymentRequestClass test cases completed ..");

	}

	@Test(priority = 7)

	public void validateAddOfflinePayment() throws InterruptedException {
		wait(2000);
		System.out.println("validateAddOfflinePayment test cases started ..");
		FP = HP.clickOnFee();
		wait(1000);
		FP.validateAddOfflinePayment();
		System.out.println("validateAddOfflinePayment test cases completed ..");

	}

	@Test(priority = 8)

	public void validateTransactionsTypeofpayment() throws InterruptedException {
		wait(2000);
		System.out.println("validateTransactionsTypeofpayment test cases started ..");
		FP = HP.clickOnFee();
		wait(1000);
		FP.validateTransactionsTypeofpayment();
		System.out.println("validateTransactionsTypeofpayment test cases completed ..");

	}

	@Test(priority = 9)

	public void validateTransactionsPaymentDatefilter() throws InterruptedException {
		wait(2000);
		System.out.println("validateTransactionsPaymentDatefilter test cases started ..");
		FP = HP.clickOnFee();
		wait(1000);
		FP.validateTransactionsPaymentDatefilter();
		System.out.println("validateTransactionsPaymentDatefilter test cases completed ..");

	}

	@Test(priority = 10)

	public void validateTransactionsInvoiceDownload() throws InterruptedException {
		wait(2000);
		System.out.println("validateTransactionsInvoiceDownload test cases started ..");
		FP = HP.clickOnFee();
		wait(1000);
		FP.validateTransactionsInvoiceDownload();
		System.out.println("validateTransactionsInvoiceDownload test cases completed ..");

	}

	@Test(priority = 11)

	public void validateTransactionsAddOfflinePayment() throws InterruptedException {
		wait(2000);
		System.out.println("validateTransactionsAddOfflinePayment test cases started ..");
		FP = HP.clickOnFee();
		wait(1000);
		FP.validateTransactionsAddOfflinePayment();
		System.out.println("validateTransactionsAddOfflinePayment test cases completed ..");

	}

	@Test(priority = 12)

	public void validateAllStudentsOverview() throws InterruptedException {
		wait(2000);
		System.out.println("validateAllStudentsOverview test cases started ..");
		FP = HP.clickOnFee();
		wait(1000);
		FP.validateAllStudentsOverview();
		System.out.println("validateAllStudentsOverview test cases completed ..");

	}

	@Test(priority = 13)

	public void validateRecentActivities() throws InterruptedException {
		wait(2000);
		System.out.println("validateRecentActivities test cases started ..");
		FP = HP.clickOnFee();
		wait(1000);
		FP.validateRecentActivities();
		System.out.println("validateRecentActivities test cases completed ..");

	}

	/*****************************************
	 * Attendance Module
	 * 
	 * @throws InterruptedException
	 ********************/
	@Test(priority = 14)
	public void checkViewAllOptions() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Test case was strated.....!");
		AP = HP.clickOnAttendace();
		AP.selectPreveligeView();
		AP.clickOnViewAll();
	}

	@Test(priority = 15)
	public void clickGeoFence() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Test case was strated.....!");
		AP = HP.clickOnAttendace();
		AP.selectPreveligeView();
		AP.clickGeoFence("Geo fence");
	}
	
	@Test(priority = 16)
	public void checkSrudentPrevileged() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Test case was strated.....!");
		AP = HP.clickOnAttendace();
		AP.selectPreveligeView();
		AP.clickStudentPrevilage();
	}
	
	@Test(priority = 17)
	public void checkTeacherPrevileged() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Test case was strated.....!");
		AP = HP.clickOnAttendace();
		AP.selectPreveligeView();
		AP.clickTeacherPrevilage();
		
	}

	/***************************** Aulas Care Test cases **********************/
	@Test(priority = 18)
	public void checkSupport() throws InterruptedException {
		Thread.sleep(3000);
		// AC.clickOnMoreButton();
		AC = HP.clickOnAulasCare();
		AC.clickOnSupport();
		AC.clickOnViewAll("VIEW ALL");
		AC.doChart("sri do", "Hello");
		//AC.clickBackButton2();
	}

	@Test(priority = 19)
	public void fillVaccinationDetails() throws InterruptedException {
		Thread.sleep(3000);
		AC = HP.clickOnAulasCare();
		AC.clickCovid19("Covid-19 resources");
		
		// AC.clickVaccination();
		// AC.registerInBrowser();

	}

	@Test(priority = 20)
	public void checkFAQs() throws InterruptedException {
		Thread.sleep(3000);
		AC = HP.clickOnAulasCare();
		AC.FAQs("FAQs");
		AC.checkAllFAQs();
		AC.clickBackButton2();

	}
	

}
