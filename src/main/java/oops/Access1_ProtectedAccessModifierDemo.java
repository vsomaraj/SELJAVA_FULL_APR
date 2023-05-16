package oops;

import accessmodifiers.ProtectedAccessModifierDemo;
import inheritance.HierarchicalInheritanceDemo;

public class Access1_ProtectedAccessModifierDemo extends ProtectedAccessModifierDemo{
    protected int a;
    protected int b;
    protected int c;
    protected Access1_ProtectedAccessModifierDemo(){
        a=900;
        b=800;
        c=0;
    }
    protected void Subtraction(){
        c=a-b;
        System.out.println("The Subtraction Result is:"+c);
    }

    public static void main(String[] args) {
//        ProtectedAccessModifierDemo obj1=new ProtectedAccessModifierDemo();
        Access1_ProtectedAccessModifierDemo obj1=new Access1_ProtectedAccessModifierDemo();
        obj1.addition();
        obj1.Subtraction();
        obj1.printResult();
    }
}
