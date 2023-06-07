package testngSuite;

import accessmodifiers.PublicAccessModifierDemo;
import org.testng.annotations.Test;
import polymorphism.MethodOverloadingDemo;


public class TestNGSuite1 {

    PublicAccessModifierDemo obj1=new PublicAccessModifierDemo();
    MethodOverloadingDemo obj2=new MethodOverloadingDemo();

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

}


