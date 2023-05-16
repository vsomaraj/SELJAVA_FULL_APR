package inheritance;

import accessmodifiers.ProtectedAccessModifierDemo;

public class HierarchicalInheritanceDemo extends ProtectedAccessModifierDemo {
    int a;
    int b;
    int c;
    HierarchicalInheritanceDemo(){
        a=900;
        b=800;
        c=0;
    }
    void Division(){
        c=a/b;
        System.out.println("The Division Result is:"+c);
    }

    public static void main(String[] args) {
        HierarchicalInheritanceDemo obj1=new HierarchicalInheritanceDemo();
        obj1.Division();
        obj1.addition();
        obj1.printResult();
    }
}
