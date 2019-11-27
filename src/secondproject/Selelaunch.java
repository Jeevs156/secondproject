
package secondproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selelaunch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Panda\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src =tk.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\screenshot\\facebook.png");
		FileUtils.copyFile(src ,des);
		driver.quit();
	}

}