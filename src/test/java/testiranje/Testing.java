package testiranje;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testing {
    @Test
    public void startWebDriver(){
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://localhost:5173/");
        driver.manage().window().maximize();
        driver.close();
    }

}
