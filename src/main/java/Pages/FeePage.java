package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import Utils.AndriodGestures;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class FeePage extends AndriodGestures  {
	
	public AndroidDriver driver;
	public SchedulePage SP;
		
		public FeePage (AndroidDriver driver) {
			super(driver);
			this.driver=driver;
			//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}
		
		

public void validateSettings() throws InterruptedException
{
	Thread.sleep(4000);
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//*[@text='Processing fee payable by student']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Manual']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='SAVE']")).click();
	Thread.sleep(2000);
	System.out.println("validateSettings TestCase is Executed");
}

public void validateFeeViewMore() throws InterruptedException
{
	Thread.sleep(4000);
	WebElement ele1=driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.HorizontalScrollView/android.view.ViewGroup"));
	Thread.sleep(2000);
	swipeAction(ele1,"left");
	Thread.sleep(4000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='VIEW MORE']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Week']")).click();
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Months']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Months']")).click();
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Week']")).click();
	Thread.sleep(3000);
	//driver.findElement(AppiumBy.id("header-back")).click();
	driver.findElement(AppiumBy.accessibilityId("Go back")).click();
	System.out.println("feeViewMore TestCase is Executed");
}
public void validateGeneratePaymentRequestIndividual() throws InterruptedException
{
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Generate Payment Request']")).click();
	Thread.sleep(4000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Select Class']")).click();
	Thread.sleep(2000);
	//driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='0 - BP8']")).click();
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[1]")).sendKeys("9");
	Thread.sleep(2000);
	//driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='student']")).click();
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
	Thread.sleep(4000);
	driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[2]")).sendKeys("40");
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Set due date']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.SeekBar/android.view.ViewGroup[2]/android.widget.ImageView")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='14']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[3]")).sendKeys("Your College Fee ,Make Sure To Pay Before Due Date");
	Thread.sleep(2000);
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"SEND REQUEST\"));"));
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Yes']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='SEND REQUEST']")).click();
	Thread.sleep(2000);

	System.out.println("generatePaymentRequestIndividual TestCase is Executed");
	
  
}
public void validateGeneratePaymentRequestClass() throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Generate Payment Request']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Class']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Select Class']")).click();
	//driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='0 - BP8']")).click();
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[1]")).sendKeys("40");
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Set due date']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.SeekBar/android.view.ViewGroup[2]/android.widget.ImageView")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='14']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[2]")).sendKeys("Your Exam Fee ,Make Sure To Pay Before Due Date");
	Thread.sleep(2000);
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"SEND REQUEST\"));"));
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Yes']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='SEND REQUEST']")).click();
	/*
	String toastMessage=driver.findElement(By.xpath("//android.widget.Toast")).getAttribute("name");
	//Assert.assertEquals(toastMessage,"Payment request sent successfully");
	String Expected="Payment request sent successfully";
	if(toastMessage.equals(Expected))
	{
		System.out.println("toastMessage");
	}
	else
	{
		System.out.println("Error");
	}
    */
	System.out.println("generatePaymentRequestClass TestCase is Executed");
	
  
}

public void validateAddOfflinePayment() throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Add Offline Payment']")).click();
	Thread.sleep(4000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Select Class']")).click();
	Thread.sleep(2000);
	//driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='0 - BP8']")).click();
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[1]")).sendKeys("9");
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
	//driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='student']")).click();
	Thread.sleep(2000);
	//driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[2]")).click();
	//Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")).click();
	//driver.hideKeyboard();
	//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"4000\"));"));
	//driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text='4000'])[1]")).click();
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Set payment date']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='1']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ADD\"));"));
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Yes']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Cash']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='ADD']")).click();
	/*String captals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	Random rnd = new Random();
	StringBuilder name = new StringBuilder(8);
	for (int n = 0; n < 8; n++)
	{
		name.append(captals.charAt(rnd.nextInt(captals.length())));
	}
	*/
	Thread.sleep(3000);
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]")).click();
	Thread.sleep(2000);
	System.out.println("addOfflinePayment TestCase is Executed");
	
}	
public void validateTransactionsTypeofpayment() throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Transactions']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Type of payment']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='APPLY FILTER']")).click();
	Thread.sleep(6000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Type of payment']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='APPLY FILTER']")).click();
	Thread.sleep(6000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Type of payment']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='CLOSE']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[1]")).click();
	Thread.sleep(1000);
	System.out.println("validateTransactionsTypeofpayment TestCase is Executed");
	
}
public void validateTransactionsPaymentDatefilter() throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Transactions']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Payment Date']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='APPLY FILTER']")).click();
	Thread.sleep(6000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Payment Date']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='APPLY FILTER']")).click();
	Thread.sleep(6000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Payment Date']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='APPLY FILTER']")).click();
	Thread.sleep(6000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Payment Date']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='APPLY FILTER']")).click();
	Thread.sleep(6000);
	/*
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Payment Date']")).click();
	Thread.sleep(2000);
	WebElement ScrollUp=driver.findElement(AppiumBy.xpath("//android.widget.SeekBar[@content-desc=\"Bottom Sheet handle, Drag up or down to extend or minimize the Bottom Sheet\"]"));
	Thread.sleep(2000);
	swipeAction(ScrollUp,"down");
	Thread.sleep(4000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Payment Date']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='APPLY FILTER']")).click();
	Thread.sleep(6000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Payment Date']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[6]/android.view.ViewGroup/android.view.ViewGroup")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='APPLY FILTER']")).click();
	Thread.sleep(6000);
	*/
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Payment Date']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='CLOSE']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[1]")).click();
	Thread.sleep(1000);
	System.out.println("validateTransactionsPaymentDatefilter TestCase is Executed");
		
	
}
public void validateTransactionsInvoiceDownload() throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Transactions']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Download']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='DOWNLOAD']")).click();
	Thread.sleep(8000);
	WebElement back=driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Go back\"]"));
	//waitForClick(back);
	back.click();
	Thread.sleep(2000);
	WebElement payment=driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup"));
	//waitForClick(payment);
	payment.click();
	Thread.sleep(2000);
	WebElement download=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Download']"));
	//waitForClick(download);
	download.click();
	Thread.sleep(8000);
	WebElement back1=driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup"));
	//waitForClick(back1);
	back1.click();
	Thread.sleep(4000);
	WebElement back2=driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[1]"));
	//waitForClick(back2);
	back2.click();
	Thread.sleep(2000);
	System.out.println("validateTransactionsInvoiceDownload TestCase is Executed");
	
}

public void validateTransactionsAddOfflinePayment() throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Transactions']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Add']")).click();
	Thread.sleep(1000);
	WebElement selectClass=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Select Class']"));
	waitForClick(selectClass);
	selectClass.click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("(//android.widget.EditText)[1]")).sendKeys("9");
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Set payment date']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='1']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ADD\"));"));
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Yes']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Cash']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='ADD']")).click();
	Thread.sleep(3000);
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]")).click();
	Thread.sleep(2000);
	Thread.sleep(5000);
	WebElement back=driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[1]"));
	//waitForClick(back);
	back.click();
	Thread.sleep(1000);
	System.out.println("validateTransactionsAddOfflinePayment TestCase is Executed");	
	
}


public void validateAllStudentsOverview() throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='All Students']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//*[@text='VIEW MORE']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Week']")).click();
	Thread.sleep(1000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Months']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Months']")).click();
	Thread.sleep(1000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Week']")).click();
	Thread.sleep(3000);
	driver.findElement(AppiumBy.accessibilityId("Go back")).click();
	Thread.sleep(2000);
	/*
	WebElement ele1=driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[2]"));
	Thread.sleep(2000);
	swipeAction(ele1,"left");
	
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.accessibilityId("Go back")).click();
	Thread.sleep(2000);
	*/
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[1]")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.accessibilityId("Go back")).click();
	Thread.sleep(2000);
	System.out.println("validateTransactionsInvoiceDownload TestCase is Executed");
	
}
public void validateRecentActivities() throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.accessibilityId("Go back")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//*[@text='VIEW ALL']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.SeekBar[@content-desc=\"Bottom Sheet\"]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='APPLY FILTER']")).click();
	Thread.sleep(6000);
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='CLOSE']")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("Mahi Student");
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")).click();
	Thread.sleep(2000);
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
	Thread.sleep(6000);
	driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
	Thread.sleep(2000);
	System.out.println("validateTransactionsInvoiceDownload TestCase is Executed");
	
}








/*
 
	public void modeOfPayment(String mF) {
		wait(3000);
		driver.findElement(By.xpath("//*[@text='"+mF+"']")).click();
		//Generate Payment Request,Add Offline Payment,Transactions,All Students
		System.out.println("Cliked on Generate Payment Request btn...");
	}
public void individualFeeReq(String studentName,String amount) {
	wait(3000);
	selectClass();
	clickOnSearchNameorMobile(studentName);
	enterAmount(amount);
	enterDiscriotion();
	
	
}

public void selectClass() {
	wait(3000);
	driver.findElement(By.xpath("//*[@text='Select Class']")).click();
	//driver.hideKeyboard();
	wait(3000);
	driver.findElement(By.xpath("//*[@text='6353 class - ABC']")).click();
	System.out.println("Cliked on 6353 class - ABC class...");
}

public void clickOnSearchNameorMobile(String studentName) {
	wait(3000);
	driver.findElement(By.xpath("//*[@text='Search name / mobile number']")).sendKeys(studentName);
	wait(3000);

	driver.findElement(By.xpath("//*[@text='"+studentName+"']")).click();
	driver.hideKeyboard();
	System.out.println("Selected student name is :"+studentName);
	
}

public void enterAmount(String amount) {
	wait(3000);
	driver.findElement(By.xpath("//*[@text='Enter amount']")).sendKeys(amount);
	driver.hideKeyboard();
	System.out.println("Selected amount is :"+amount);
}

public void selectDueDate() {
	wait(3000);
	driver.findElement(By.xpath("//*[@text='Set due date']")).click();
	wait(3000);
	driver.findElement(By.xpath("//*[@text='Set due date']")).click();
}

public void enterDiscriotion() {
	wait(3000);
	driver.findElement(By.xpath("//*[@text='Enter description']")).sendKeys("Hello");
	wait(3000);
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	wait(3000);
	System.out.println("..Clciked on back button");
	
	
}


public void generateClassFeeReq(String amount) {
	wait(3000);
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]")).click();
	selectClass();
	enterAmount(amount);
	enterDiscriotion();
	
}

public void selectTransactionDetails() {
	wait(3000);
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
	driver.hideKeyboard();
	System.out.println("selected one of the transaction details....");
	
}

public void selectPaidDate() {
	wait(3000);
	driver.findElement(By.xpath("//*[@text='Set payment date']")).click();
	wait(3000);
	}

public void selectModeOfPayment(String paymentMode) {
	wait(3000);
	scrollToText("Type your transaction ID");
	driver.findElement(By.xpath("//*[@text='"+paymentMode+"']")).click();
	//Cash,Debit/Credit card,UPI,Bank transfer,Cheque
	if(paymentMode.equalsIgnoreCase("Debit/Credit card")) {
		wait(3000);
		driver.findElement(By.xpath("//*[@text='Type your transaction ID']")).sendKeys("123456789");
		System.out.println("The transaction id is entered...");
		
	}
	else if(paymentMode.equalsIgnoreCase("UPI")) {
		wait(3000);
		driver.findElement(By.xpath("//*[@text='Type your transaction ID']")).sendKeys("123456789");
		System.out.println("The transaction id is entered...");
		
	}
	else if(paymentMode.equalsIgnoreCase("Bank transfer")) {
		wait(3000);
		driver.findElement(By.xpath("//*[@text='Type your transaction ID']")).sendKeys("123456789");
		System.out.println("The transaction id is entered...");
		
	}
	
	else if(paymentMode.equalsIgnoreCase("Cheque")) {
		wait(3000);
		driver.findElement(By.xpath("//*[@text='Type your cheque Number']")).sendKeys("123456789");
		System.out.println("The transaction id is entered...");
		
	}
	System.out.println("The mode of payment is "+paymentMode);
}
public void AddOffilePayment(String studentName,String paymentMode) {
	wait(3000);
	selectClass();
	clickOnSearchNameorMobile(studentName);
	selectTransactionDetails();
	selectModeOfPayment(paymentMode);
	
	
	
}
 
 */


}
