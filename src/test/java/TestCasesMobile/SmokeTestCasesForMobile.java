package TestCasesMobile;

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
import Pages.LoginPage;
import Pages.SchedulePage;
import io.appium.java_client.android.AndroidDriver;

public class SmokeTestCasesForMobile extends AulasBaseTest {
	//public LoginPage LP;
	public AndroidDriver driver;
	public SchedulePage SP;
	public HomePage HP;
	public AulasCarePage AC;
	public AttendancePage AP;
	public FeePage FP;
	

	ExtentReports extent;
	
	

	@BeforeSuite
	public void doLoginOperation() throws  IOException {
		String nameofCurrMethod = Thread.currentThread()
	            .getStackTrace()[1]
	            .getMethodName();
		LP = new LoginPage(driver);
		HP=new HomePage(driver);
		SP = new SchedulePage(driver);
		HP=new HomePage(driver);
		AC=new AulasCarePage(driver);
		AP=new AttendancePage(driver);
		FP=new FeePage(driver);
		
		
		
		
		System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Started");
		try {
			Thread.sleep(3000);
			
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
			System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Completed");
		} catch (Exception error) {
			// TODO Auto-generated catch block
			System.out.println(error.toString()+" :"+nameofCurrMethod+" "+"failed");
		}
		

	}

	@Test(priority = 1)
	public void CreateScheduleBroadcast() {
		String nameofCurrMethod = Thread.currentThread()
	            .getStackTrace()[1]
	            .getMethodName();
		System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Started");
		try {
			Thread.sleep(3000);
			
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
			System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Completed");
		} catch (Exception error) {
			// TODO Auto-generated catch block
			System.out.println(error.toString()+" :"+nameofCurrMethod+" "+"failed");
		}
		
	}

	@Test(priority = 2)
	public void CreateScheduleOffline() {
		String nameofCurrMethod = Thread.currentThread()
	            .getStackTrace()[1]
	            .getMethodName();
		System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Started");
		try {
			Thread.sleep(3000);
			
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
			
			
			System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Completed");
		}  catch (Exception error) {
			// TODO Auto-generated catch block
			System.out.println(error.toString()+" :"+nameofCurrMethod+" "+"failed");
		}
		
	}

	/**************************************************
	 * Fee Module
	 *********************************/

	@Test(priority = 3)

	public void validateSettings() {
		String nameofCurrMethod = Thread.currentThread()
	            .getStackTrace()[1]
	            .getMethodName();
		System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Started");
		try {
			Thread.sleep(3000);
			
			FP = HP.clickOnFee();
			wait(1000);
			FP.validateSettings();
			System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Completed");
		} catch (Exception error) {
			// TODO Auto-generated catch block
			System.out.println(error.toString()+" :"+nameofCurrMethod+" "+"failed");
		}
		

	}

	@Test(priority = 4)

	public void validateFeeViewMore() {
		String nameofCurrMethod = Thread.currentThread()
	            .getStackTrace()[1]
	            .getMethodName();
		System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Started");
		try {
			Thread.sleep(3000);
			
			FP = HP.clickOnFee();
			wait(1000);
			FP.validateFeeViewMore();
			System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Completed");
		} catch (Exception error) {
			// TODO Auto-generated catch block
			System.out.println(error.toString()+" :"+nameofCurrMethod+" "+"failed");
		}
		
	}

	@Test(priority = 5)

	public void validateGeneratePaymentRequestIndividual()  {
		String nameofCurrMethod = Thread.currentThread()
	            .getStackTrace()[1]
	            .getMethodName();
		wait(2000);
		System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Started");
		
		try {
			Thread.sleep(3000);
			FP = HP.clickOnFee();
			FP.validateGeneratePaymentRequestIndividual();
			System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Completed");
		} catch (Exception error) {
			// TODO Auto-generated catch block
			System.out.println(error.toString()+" :"+nameofCurrMethod+" "+"failed");
		}
		
	}

	@Test(priority = 6)

	public void validateGeneratePaymentRequestClass() {
		String nameofCurrMethod = Thread.currentThread()
	            .getStackTrace()[1]
	            .getMethodName();
		System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Started");
		try {
			Thread.sleep(3000);
			
			FP = HP.clickOnFee();
			wait(1000);
			FP.validateGeneratePaymentRequestClass();
			System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Completed");
		} catch (Exception error) {
			// TODO Auto-generated catch block
			System.out.println(error.toString()+" :"+nameofCurrMethod+" "+"failed");
		}
		
	}

	@Test(priority = 7)

	public void validateAddOfflinePayment(){
		String nameofCurrMethod = Thread.currentThread()
	            .getStackTrace()[1]
	            .getMethodName();
		try {
			Thread.sleep(3000);
			System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Started");
			FP = HP.clickOnFee();
			wait(1000);
			FP.validateAddOfflinePayment();
			System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Completed");
		} catch (Exception error) {
			// TODO Auto-generated catch block
			System.out.println(error.toString()+" :"+nameofCurrMethod+" "+"failed");
		}

	}

	@Test(priority = 8)

	public void validateTransactionsTypeofpayment() {
		String nameofCurrMethod = Thread.currentThread()
	            .getStackTrace()[1]
	            .getMethodName();
		System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Started");
		try {
			Thread.sleep(3000);
			
			FP = HP.clickOnFee();
			wait(1000);
			FP.validateTransactionsTypeofpayment();
			System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Completed");
		} catch (Exception error) {
			// TODO Auto-generated catch block
			System.out.println(error.toString()+" :"+nameofCurrMethod+" "+"failed");
		}
		

	}

	@Test(priority = 9)

	public void validateTransactionsPaymentDatefilter() {
		String nameofCurrMethod = Thread.currentThread()
	            .getStackTrace()[1]
	            .getMethodName();
		System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Started");
		try {
			Thread.sleep(3000);
			
			FP = HP.clickOnFee();
			wait(1000);
			FP.validateTransactionsPaymentDatefilter();
			System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Completed");
		}catch (Exception error) {
			// TODO Auto-generated catch block
			System.out.println(error.toString()+" :"+nameofCurrMethod+" "+"failed");
		}
		
	}

	@Test(priority = 10)

	public void validateTransactionsInvoiceDownload() {
		String nameofCurrMethod = Thread.currentThread()
	            .getStackTrace()[1]
	            .getMethodName();
		System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Started");
		try {
			Thread.sleep(3000);
			
			FP = HP.clickOnFee();
			wait(1000);
			FP.validateTransactionsInvoiceDownload();
			System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Completed");
		} catch (Exception error) {
			// TODO Auto-generated catch block
			System.out.println(error.toString()+" :"+nameofCurrMethod+" "+"failed");
		}
		
	}

	@Test(priority = 11)

	public void validateTransactionsAddOfflinePayment() {
		String nameofCurrMethod = Thread.currentThread()
	            .getStackTrace()[1]
	            .getMethodName();
		System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Started");
		try {
			Thread.sleep(3000);
			
			FP = HP.clickOnFee();
			wait(1000);
			FP.validateTransactionsAddOfflinePayment();
			System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Completed");
		} catch (Exception error) {
			// TODO Auto-generated catch block
			System.out.println(error.toString()+" :"+nameofCurrMethod+" "+"failed");
		}
		
	}

	@Test(priority = 12)

	public void validateAllStudentsOverview() {
		String nameofCurrMethod = Thread.currentThread()
	            .getStackTrace()[1]
	            .getMethodName();
		System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Started");
		try {
			Thread.sleep(3000);
			//System.out.println(nameofCurrMethod+"Testcase is :"+" "+"Started");
			FP = HP.clickOnFee();
			wait(1000);
			FP.validateAllStudentsOverview();
			System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Completed");
		}  catch (Exception error) {
			// TODO Auto-generated catch block
			System.out.println(error.toString()+" :"+nameofCurrMethod+" "+"failed");
		}
		
	

	}

/*	@Test(priority = 13)

	public void validateRecentActivities() throws InterruptedException {
		wait(2000);
		String nameofCurrMethod = Thread.currentThread()
                .getStackTrace()[1]
                .getMethodName();
		System.out.println("validateRecentActivities test cases started .."+nameofCurrMethod);
		FP = HP.clickOnFee();
		wait(1000);
		FP.validateRecentActivities();
		System.out.println("validateRecentActivities test cases completed .."+nameofCurrMethod);

	}*/

	/*****************************************
	 * Attendance Module
	 * 
	 * @throws InterruptedException
	 ********************/
	@Test(priority = 14)
	public void checkViewAllOptions(){
		String nameofCurrMethod = Thread.currentThread()
	            .getStackTrace()[1]
	            .getMethodName();
		System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Started");
		try {
			Thread.sleep(3000);
			
			AP = HP.clickOnAttendace();
			AP.selectPreveligeView();
			AP.clickOnViewAll();
			System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Completed");
		}  catch (Exception error) {
			// TODO Auto-generated catch block
			System.out.println(error.toString()+" :"+nameofCurrMethod+" "+"failed");
		}
		
		
	}

	@Test(priority = 15)
	public void clickGeoFence() {
		String nameofCurrMethod = Thread.currentThread()
	            .getStackTrace()[1]
	            .getMethodName();
		System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Started");
		try {
			Thread.sleep(3000);
			
			AP = HP.clickOnAttendace();
			AP.selectPreveligeView();
			AP.clickGeoFence("Geo fence");
			System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Completed");
		} catch (Exception error) {
			// TODO Auto-generated catch block
			System.out.println(error.toString()+" :"+nameofCurrMethod+" "+"failed");
		}
		
		
	}
	
	@Test(priority = 16)
	public void checkSrudentPrevileged() {
		String nameofCurrMethod = Thread.currentThread()
	            .getStackTrace()[1]
	            .getMethodName();
		System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Started");
		try {
			Thread.sleep(3000);
			
			AP = HP.clickOnAttendace();
			AP.selectPreveligeView();
			AP.clickStudentPrevilage();
			System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Completed");
		} catch (Exception error) {
			// TODO Auto-generated catch block
			System.out.println(error.toString()+" :"+nameofCurrMethod+" "+"failed");
		}
		
		
	}
	
	@Test(priority = 17)
	public void checkTeacherPrevileged() {
		String nameofCurrMethod = Thread.currentThread()
	            .getStackTrace()[1]
	            .getMethodName();
		System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Started");
		try {
			Thread.sleep(3000);
			
			AP = HP.clickOnAttendace();
			AP.selectPreveligeView();
			AP.clickTeacherPrevilage();
			System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Completed");
		} catch (Exception error) {
			// TODO Auto-generated catch block
			System.out.println(error.toString()+" :"+nameofCurrMethod+" "+"failed");
		}
		
		
		
		
	}

	/***************************** Aulas Care Test cases **********************/
	@Test(priority = 18)
	public void checkSupport() {
		String nameofCurrMethod = Thread.currentThread()
	            .getStackTrace()[1]
	            .getMethodName();
		System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Started");
		try {
			Thread.sleep(3000);
			AC = HP.clickOnAulasCare();
			AC.clickOnSupport();
			AC.clickOnViewAll("VIEW ALL");
			AC.doChart("sri do", "Hello");
			System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Completed");
		}  catch (Exception error) {
			// TODO Auto-generated catch block
			System.out.println(error.toString()+" :"+nameofCurrMethod+" "+"failed");
		}
		
		
		
		
	}

	@Test(priority = 19)
	public void fillVaccinationDetails()  {
		String nameofCurrMethod = Thread.currentThread()
	            .getStackTrace()[1]
	            .getMethodName();
		System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Started");
		try {
			Thread.sleep(3000);
			AC = HP.clickOnAulasCare();
			AC.clickCovid19("Covid-19 resources");
			System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Completed");
		} catch (Exception error) {
			// TODO Auto-generated catch block
			System.out.println(error.toString()+" :"+nameofCurrMethod+" "+"failed");
		}
		
		
		
		// AC.clickVaccination();
		// AC.registerInBrowser();

	}

	@Test(priority = 20)
	public void checkFAQs()  {
		String nameofCurrMethod = Thread.currentThread()
	            .getStackTrace()[1]
	            .getMethodName();
		System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Started");
		try {
			Thread.sleep(3000);
			AC = HP.clickOnAulasCare();
			AC.FAQs("FAQs");
			AC.checkAllFAQs();
			AC.clickBackButton2();
			System.out.println(nameofCurrMethod+" "+"Testcase is :"+" "+"Completed");
			
		} catch (Exception error) {
			// TODO Auto-generated catch block
			System.out.println(error.toString()+" :"+nameofCurrMethod+" "+"failed");
		}
		
		

	}
	

}
