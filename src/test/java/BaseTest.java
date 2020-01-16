import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseTest {
	@Test
	public void BrowserLaunch() {

		String driverPath = System.getProperty("user.dir") + "\\src\\test\\java\\Browser_Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
	}
}
