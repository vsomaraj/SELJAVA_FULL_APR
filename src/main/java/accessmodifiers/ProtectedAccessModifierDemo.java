package accessmodifiers;

public class ProtectedAccessModifierDemo {
    protected int a;
    protected int b;
    protected int result;
    protected ProtectedAccessModifierDemo(){
        a=100;
        b=400;
        result=0;
    }
    protected void addition(){
        result=a+b;
    }
    protected void printResult(){
        System.out.println("The Sum is:"+result);

    }
    public static void main(String[] args){
        ProtectedAccessModifierDemo obj1=new ProtectedAccessModifierDemo();
        obj1.addition();
        obj1.printResult();
    }
}
