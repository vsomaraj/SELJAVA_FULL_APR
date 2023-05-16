package accessmodifiers;

public class Access_PrivateAccessModifierDemo {
    private int a;
    private int b;
    private int result;
    Access_PrivateAccessModifierDemo(){
        a=100;
        b=400;
        result=0;
    }
    private void addition(){
        result=a+b;
    }
    private void printResult(){
        System.out.println("The Sum is:"+result);

    }
    public static void main(String[] args){
//        PrivateAccessModifierDemo obj1=new PrivateAccessModifierDemo();
//        obj1.addition();
//        obj1.printResult();
    }

}
