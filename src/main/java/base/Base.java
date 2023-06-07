package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Base {
    WebDriver driver;

    public WebDriver createWebDriverInstance(String browserType){
        switch(browserType){
            case "chrome":{

                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
                driver.manage().window().maximize();
                break;

            }
            case "edge":{
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
                driver.manage().window().maximize();
                break;

            }
            case "firefox":{
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
                driver.manage().window().maximize();
            }

        }
        return driver;
    }
}
