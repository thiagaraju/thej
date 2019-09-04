package MyDemo_01_Cucumber.MyDemo_01_Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driverclass {
		public static WebDriver configureDriver(String browserName) {
			WebDriver driver=null;
			if(browserName.equals("explorer")) {
				System.setProperty("webdriver.ie.driver", "C:\\Users\\t.thiagaraju\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			else if(browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\t.thiagaraju\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			return driver;
		}

	}


