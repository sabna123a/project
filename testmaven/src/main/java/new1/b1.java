package new1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class b1 {
@Test(groups="one")
public void a1() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabna\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver t=new ChromeDriver();
	t.get("http://www.mycontactform.com");
	System.out.println(t.getTitle());
	Thread.sleep(3000);
	t.quit();}
}
