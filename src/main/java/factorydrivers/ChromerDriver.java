package factorydrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromerDriver implements DriverSelenium{
    @Override
    public WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/elmerzapata/Desktop/drivers/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=2120,1400","--ignore-certificate-errors","--remote-allow-origins=*","--disable-dev-shm-usage","--no-sandbox");

        return new ChromeDriver(chromeOptions);
    }
}
