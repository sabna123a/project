package new1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
@DataProvider(name="sabna")
public static Object[][]DataSet(){
	Object[][] obj= {{"valid","sabna123","12345"},
			{"invalid","sob12","345"},
			{"in","jonah","123"}
			};
	return obj;		
}
@Test(dataProvider ="sabna")
public void sampledata(String type, String username,String password) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabna\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver t=new ChromeDriver();
	t.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	t.get("http://mycontactform.com");
	t.findElementById("user").sendKeys(username);
	t.findElementById("pass").sendKeys(password);
	t.findElementByName("btnsubmit").click();
	
	if(type.equals("valid"))
	{
		System.out.println("valid data");
		t.findElementByLinkText("logout").click();
	}
	else
	{
		System.out.println("invalid data");
		Thread.sleep(2000);
		t.quit();
	}
	}
	
	
	
	
	}


