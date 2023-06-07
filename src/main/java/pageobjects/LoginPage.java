package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebElement element;

    public WebElement findLoginLabel(WebDriver driver){
        element = driver.findElement(By.xpath("//h1"));
        return element;
    }

    public WebElement findEmailTxtBox(WebDriver driver){
        element = driver.findElement(By.id("email"));
        return element;
    }
    public WebElement findPasswordTxtBox(WebDriver driver){
        element = driver.findElement(By.id("password"));
//        element = driver.findElement(By.name("password"));
        return element;
    }
    public WebElement findLoginBtn(WebDriver driver){
        element = driver.findElement(By.xpath("//button[@type='submit']"));
        return element;

    }
}
