package Pages;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import Utils.AndriodGestures;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;

public class AttendancePage extends AndriodGestures  {
public AndroidDriver driver;

	
	public AttendancePage(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
	//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void selectMyAttendance() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='MY ATTENDANCE']")).click();
		//driver.findElement(By.xpath("//*[@text='+']")).click();
		System.out.println("Clicked on my attedance section...!");
		
	}
	
	/*public void clickAttedenceSummary(String visibleText) throws InterruptedException {
		Thread.sleep(3000);
		//scrollAndClick("Attendance summary");
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Attendance summary']")).click();
		System.out.println("Clicked on attendace summary.....!");
		}*/
	public void selctSummaryOfAttendance(String visibleText) throws InterruptedException {
		Thread.sleep(3000);
		//scrollAndClick("Attendance summary");
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Attendance summary']")).click();
		System.out.println("Clicked on attendace summary.....!");
		
	}
	public void clickWeeklySummary() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='android.view.ViewGroup'])[2]")).click();
		System.out.println("Clicked on weekly summary of the calender...!");
		
	}
	
	
	public void selectPreveligeView() throws InterruptedException {
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@text='PRIVILEGED VIEW']")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.View[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")).click();
		
		System.out.println("Clicked on PRIVILEGED VIEW ...!");
		Thread.sleep(3000);
	}

	public void clickGeoFence(String fence) throws InterruptedException {
		Thread.sleep(3000);
		List<WebElement> ele=driver.findElements(By.xpath("//*[@class='android.widget.TextView']"));
		int sizeIs=ele.size();
		System.out.println("The size is : ...!"+" "+sizeIs);
		for (int i=1;i<=sizeIs;i++) {
			String namesIs=driver.findElement(By.xpath("(//*[@class='android.widget.TextView'])["+i+"]")).getText();
			System.out.println("The size is : ...!"+" "+namesIs);
			
		}
		
		driver.findElement(AppiumBy.androidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true)).setMaxSearchSwipes(10)" +
		         ".scrollIntoView(new UiSelector().text(\"Geo fence\"))")).click();
		Thread.sleep(3000);
		System.out.println("Clicked on Geo fence.....!");
		
		}
	
	
	    
	public void clickOnViewAll() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='VIEW ALL']")).click();
		System.out.println("Clicked on view all ...!");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='APPROVED']")).click();
		System.out.println("Clicked on APPROVED ...!");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='REJECTED']")).click();
		System.out.println("Clicked on REJECTED ...!");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")).click();
		//driver.hideKeyboard();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
		Thread.sleep(3000);
		System.out.println("Clicked back return to HomePage...!");
		
	}
	
	void androidScrollToAnElementByText(String text) {
        try {
           driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"" + text + "\").instance(0))"));
        } catch (Exception e) {
            throw new NoSuchElementException("No element" + e);
        }
    }
	
	
	public void clickStudentPrevilage() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")).click();
		System.out.println("Clicked on the student privilage!!!.........");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='VIEW ALL']")).click();
		System.out.println("Clicked on View all.........");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='APPROVED']")).click();
		System.out.println("Clicked on APPROVED ...!");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='REJECTED']")).click();
		System.out.println("Clicked on REJECTED ...!");
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
		System.out.println("Clicked back return to HomePage...!");
		


		
	}

	public void clickTeacherPrevilage() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
		System.out.println("Clicked on the Teacher privilage!!!.........");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='VIEW ALL']")).click();
		System.out.println("Clicked on View all.........");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='APPROVED']")).click();
		System.out.println("Clicked on APPROVED ...!");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='REJECTED']")).click();
		System.out.println("Clicked on REJECTED ...!");
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")).click();
		System.out.println("Clicked back return to HomePage...!");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
