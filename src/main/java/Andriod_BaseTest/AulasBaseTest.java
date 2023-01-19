package Andriod_BaseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

import com.google.common.collect.ImmutableMap;

import Pages.LoginPage;
import Utils.AndriodGestures;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AulasBaseTest  {
	
	public static AndroidDriver driver;
	public static AppiumDriverLocalService builder;
	public static LoginPage LP;
	



	// @BeforeClass
	public static void ConfigureAppium() throws IOException {
		// start appium server
		String home = System.getProperty("user.home");
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//Resources//config.properties");
		prop.load(fis);
		String ipAddress = prop.getProperty("ipAddress");
		String port = prop.getProperty("port");
		// convert string to int
		int portnumber = Integer.parseInt(port);
		builder = startAppiumServer(ipAddress, portnumber);
		// passing mobile details
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName(prop.getProperty("AndroidDeviceName")); // emulator name
		
	
		//options.setChromedriverExecutable("C://Users//Prabhakar//Documents//Drivers//chromedriver.exe");

		//options.setApp("C://Users//Prabhakar//Downloads//app-release (3).apk");
		
		
		System.out.println("The home path is :"+home);
	String strPath=home+"\\Downloads" +"\\app-release (3)"+ ".apk"; 
	
		System.out.println("The file path is "+" "+strPath);
		options.setApp(strPath);
		
		driver = new AndroidDriver(builder.getUrl(), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LP = new LoginPage(driver);
	}

	public static AppiumDriverLocalService startAppiumServer(String ipAddress, int port)  {
		// to start appium server
		
		String home2 = System.getProperty("user.home");
		//String strMainJSPath=	home2+"//AppData"+"//Roaming"+"//npm"+"//node_modules"+"//appium"+"//build"+"//lib"+"//main.js";
		String strMainJSPath="C://Users//Nandini//AppData//Roaming//npm//node_modules//appium//build//lib//main.js";
		
		
		/*builder = new AppiumServiceBuilder()
				.withAppiumJS(new File(
						"C://Users//Nandini//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress(ipAddress).usingPort(port).build();*/
		builder = new AppiumServiceBuilder()
				.withAppiumJS(new File(strMainJSPath))
				.withIPAddress(ipAddress).usingPort(port).build();
		// ipAdress=127.0.0.1
		// port=4723
		builder.start();
		return builder;
	}

	public static void ConfigureAppiumForLinux() throws IOException {
		// start appium server
		String home = System.getProperty("user.home");
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//Resources//config.properties");
		prop.load(fis);
		String ipAddress = prop.getProperty("ipAddress");
		String port = prop.getProperty("port");
		// convert string to int
		int portnumber = Integer.parseInt(port);
		builder = startAppiumServerForLinux(ipAddress, portnumber);
		// passing mobile details
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName(prop.getProperty("AndroidDeviceName")); // emulator name
		
		
	
	//options.setChromedriverExecutable("C://Users//Prabhakar//Documents//Drivers//chromedriver.exe");	
		

		//options.setApp("/home/prabha/Downloads/app-release (3).apk");
		

		System.out.println("The home path is :"+home);
	String strPath=home+"\\Downloads" +"\\app-release (3)"+ ".apk"; 
		/*
		 * options.setApp( System.getProperty("user.dir")+
		 * "\\src\\main\\java\\AppResource\\app-release.apk");
		 */

		// declare android driver
		// driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver = new AndroidDriver(builder.getUrl(), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LP = new LoginPage(driver);
	}
	
	public static AppiumDriverLocalService startAppiumServerForLinux(String ipAddress, int port) {
		// to start appium server
		builder = new AppiumServiceBuilder()
				.withAppiumJS(new File(
						"/usr/local/lib/node_modules/appium/build/lib/main.js"))
				.withIPAddress(ipAddress).usingPort(port).build();
		// ipAdress=127.0.0.1
		// port=4723
		builder.start();
		return builder;
	}
	
	
	public void longPress_Action(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(), "duration", 2000));
	}

	public void scrollToEndAction() {
		boolean canScrollMore;
		do {
			canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap
					.of("left", 100, "top", 100, "width", 200, "height", 200, "direction", "down", "percent", 3.0));

		} while (canScrollMore);

	}

	public void swipeAction(WebElement ele, String direction) {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId",
				((RemoteWebElement) ele).getId(), "direction", direction, "percent", 0.75));
	}

	public Double getFormatedAmount(String amount) {
		Double prize = Double.parseDouble(amount.substring(1));
		return prize;

	}

	public void waitTill(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	public String getScreenShotpath(String testcase) throws IOException {

		File source = driver.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\reports" + testcase + ".png";
		/*
		 * File DestFile=new File(destination); FileUtils.copyFile(source, DestFile);
		 */
		FileUtils.copyFile(source, new File(destination));

		return destination;
	}

	public void scrollAndClick(String visibleText) {
		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))"))
				.click();
	}

	public void generateCurrentDate() {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");

		// get current date time with Date()
		Date date = new Date();

		// Now format the date
		String date1 = dateFormat.format(date);

		// Print the Date
		System.out.println(date1);
	}

	public void wait(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void clickBackButton(int count) throws InterruptedException {
		Thread.sleep(3000);
		for(int i=1;i<=count;i++) {
			driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Go back\"]/android.widget.ImageView")).click();

		}
	}
	
	
	public void nameOfOS() {
        System.getProperties().list(System.out);
    }
	
	public static void NameOFOS() throws InterruptedException, IOException {
        //System.getProperties().list(System.out);
		String OSnameIs=System.getProperty("os.name");
      System.out.println("OS name is .....!"+" "+OSnameIs);
      if(OSnameIs.equalsIgnoreCase("Windows 10")) {
    	  Thread.sleep(3000);
    	 ConfigureAppium();
    	 // runAppiumService(4723);
    	  
      }
      else if(OSnameIs.equalsIgnoreCase("Linux")) {
    	  Thread.sleep(3000);
    	  ConfigureAppiumForLinux();
    	  
      }
      
      System.out.println("Appium is running on :"+" "+OSnameIs);
    }
	
	
	
	public static  AppiumDriverLocalService runAppiumService(int appiumPort) {
		String home2 = System.getProperty("user.home");
		String strMainJSPath=	home2+"//AppData"+"//Roaming"+"//npm"+"//node_modules"+"//appium"+"//build"+"//lib"+"//main.js";
        //Build parameters for appium server:
        AppiumServiceBuilder appiumServiceBuilder = new AppiumServiceBuilder();
        appiumServiceBuilder.usingPort(appiumPort)
                .withIPAddress("127.0.0.1")
                .withAppiumJS(new File(strMainJSPath))
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                .withLogFile(new File(System.getProperty("user.dir") + "/target/resources/appium_server_logs" + Thread.currentThread().getId()));
        AppiumDriverLocalService service = AppiumDriverLocalService.buildService(appiumServiceBuilder);
        service.start();
        return service;
}

	@AfterClass
	public void tearDown() {
		driver.quit();
		builder.stop();

	}

}
