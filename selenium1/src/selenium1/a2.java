package selenium1;
import org.openqa.selenium.chrome.ChromeDriver;
public class a2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabna\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driv=new ChromeDriver();
		driv.get("http://www.amazon.com");
		//Thread.sleep(3000);
		//driv.quit();
		System.out.println(driv.getCurrentUrl());
		driv.findElementByPartialLinkText("sign").click();
	driv.findElementById("ap_email").sendKeys("sabna.irudayaraj@gmail.com");
	Thread.sleep(3000);
	driv.findElementByCssSelector("input[type='submit']").click();
	Thread.sleep(3000);
	driv.findElementByCssSelector("#createAccountSubmit").click();
	//Thread.sleep(3000);
	//driv.close();
	
		
	}

}
