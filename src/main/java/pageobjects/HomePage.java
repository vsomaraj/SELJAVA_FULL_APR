package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    public  WebElement element;

    public WebElement findWelcomeText(WebDriver driver){
        element = driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]"));
        return element;
    }
}
