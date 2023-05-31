package new2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class b3 {
@Test(groups="two")
public void s2() throws IOException, InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabna\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver t=new ChromeDriver();
	t.get("http://www.facebook.com");
	t.findElementByLinkText("Forgotten password?").click();
	Thread.sleep(3000);
	File f=t.getScreenshotAs(OutputType.FILE);
	//=> copy,paste->fileutils->apache directory studio common io
	FileUtils.copyFile(f,new File("C:\\Users\\sabna\\eclipse-workspace\\testmaven\\src\\main\\java\\new2\\a1.png"));
	t.close();
	
}
}