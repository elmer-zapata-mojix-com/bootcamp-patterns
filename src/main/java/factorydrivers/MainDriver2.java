package factorydrivers;

import factorydrivers.DriverSelenium;
import factorydrivers.FactoryDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainDriver2 {
    public static void main(String[]arg){

        DriverSelenium driverSelenium = FactoryDriver.initialize("CHROME");
        WebDriver webDriver =driverSelenium.createDriver();
        webDriver.get("https://fedex.vizix.io");

         WebElement control;
        By locator;
        webDriver.findElement(By.className("buttonTextOauth")).click();
        new WebDriverWait(webDriver, Duration.ofSeconds(70))
                .until(ExpectedConditions.elementToBeClickable(By.id("okta-signin-username")));
        control = webDriver.findElement(By.id("okta-signin-username"));
        control.sendKeys("CENTeng");





        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webDriver.close();
    }
}
