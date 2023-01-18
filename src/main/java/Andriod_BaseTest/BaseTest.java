package Andriod_BaseTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	public AndroidDriver driver;
	public AppiumDriverLocalService builder;
	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException {
		//to start appium server
				 builder=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Prabhakar\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
						.withIPAddress("127.0.0.1").usingPort(4723).build();
				builder.start();
				//passing mobile details
				UiAutomator2Options options=new UiAutomator2Options();
				options.setDeviceName("Prabha Mobile");
				options.setChromedriverExecutable("C:\\Users\\Prabhakar\\Documents\\Drivers\\chromedriver.exe");
				//options.setApp("C:\\Users\\Prabhakar\\Documents\\Appium Testing\\Appium workspace\\Aulas_MobileAutomation\\src\\test\\java\\Resources\\ApiDemos-debug.apk");
				options.setApp("C:\\Users\\Prabhakar\\Documents\\Appium Testing\\Appium workspace\\Aulas_MobileAutomation\\src\\test\\java\\Resources\\General-Store.apk");
				
				
				//declare android driver
				 driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void longPress_Action(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) ele).getId()
			,"duration",2000));
	}
	public void scrollToEndAction() {
		boolean canScrollMore;
		do {
		 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 3.0
			));
	
		}while(canScrollMore);
	
	
	}
	
	public void swipeAction(WebElement ele,String direction) {
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				 "elementId", ((RemoteWebElement) ele).getId(),
			    "direction", direction,
			    "percent", 0.75
			));
	}
	
	public Double getFormatedAmount(String amount) {
		Double prize=Double.parseDouble(amount.substring(1));
		return prize;
		
	}
	
	public void wait(int wait)
	{
		try {
			Thread.sleep(wait);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
		builder.stop();
	}

}
