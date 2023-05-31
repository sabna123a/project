package new1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class b2 {
@Test (groups="one")
public void s1()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabna\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();
	ob.get("https://jqueryui.com/datepicker/");
	ob.switchTo().frame(0);
	ob.findElementById("datepicker").click();
	ob.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span").click();
	ob.findElementByCssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(3) > td:nth-child(7) > a").click();}
}
