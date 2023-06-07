package testngSuite;

import accessmodifiers.PublicAccessModifierDemo;
import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.LogoutPage;
import polymorphism.MethodOverloadingDemo;


public class TestNGSuite {
    WebDriver driverTstNG;
    WebElement elementTstNG;

    PublicAccessModifierDemo obj1=new PublicAccessModifierDemo();
    MethodOverloadingDemo obj2=new MethodOverloadingDemo();
    Base baseObj = new Base();
    LoginPage loginPageObj = new LoginPage();
    HomePage homePageObj = new HomePage();
    LogoutPage logoutPageObj = new LogoutPage();
    String email = "vysakhsraj@ymail.com";
    String password= "Password@01";


    @Test(priority = 1)
    void TC1(){
        obj1.addition();
        obj1.printResult();
    }

    @Test(priority = 2)
    void TC2() {
        obj2.addition(4, 4, 4, 4);
    }
    @Test(priority = 3)
    void TC3() {
        obj2.addition(6, 6);
    }
    @Test(priority = 4)
    void TC4(){
        obj2.addition(7,7,7);

    }

    @Test(priority = 5)
    void getWebDriverInstance(){
        driverTstNG = baseObj.createWebDriverInstance("chrome");

    }
    @Test(priority = 6)
    void openTheApplication(){
        driverTstNG.get("https://acme-test.uipath.com/login");
        elementTstNG = loginPageObj.findLoginLabel(driverTstNG);
        boolean actualResult = elementTstNG.isDisplayed();
        Assert.assertEquals(actualResult,true);

    }
    @Test(priority = 7)
    public void LoginToTheApplication(){
        elementTstNG = loginPageObj.findEmailTxtBox(driverTstNG);
        elementTstNG.sendKeys(email);
        elementTstNG = loginPageObj.findPasswordTxtBox((driverTstNG));
        elementTstNG.sendKeys(password);
        elementTstNG =loginPageObj.findLoginBtn(driverTstNG);
        elementTstNG.click();
        elementTstNG = homePageObj.findWelcomeText(driverTstNG);
        boolean actualResult = elementTstNG.isDisplayed();
        boolean expectedResult = true;
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test(priority = 8)
    public void LogoutFromTheApplication(){
        elementTstNG = logoutPageObj.findLogoutBtn(driverTstNG);
        elementTstNG.click();
        driverTstNG.quit();
    }
}


