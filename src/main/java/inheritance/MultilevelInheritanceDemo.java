package inheritance;

import oops.Access1_ProtectedAccessModifierDemo;

public class MultilevelInheritanceDemo extends Access1_ProtectedAccessModifierDemo {
    int a;
    int b;
    int c;
    MultilevelInheritanceDemo(){
        a=900;
        b=800;
        c=0;
    }
    void Multiplication(){
        c=a*b;
        System.out.println("The Product is:"+c);
    }

    public static void main(String[] args) {
        MultilevelInheritanceDemo obj1=new MultilevelInheritanceDemo();
        obj1.Multiplication();
        obj1.addition();
        obj1.Subtraction();
        obj1.printResult();
    }
}
