package accessmodifiers;

public class DefaultAccessModifierDemo {
    int a;
    int b;
    int result;
    DefaultAccessModifierDemo(){
        a=100;
        b=400;
        result=0;
    }
    void addition(){
        result=a+b;
    }
    void printResult(){
        System.out.println("The Sum is:"+result);

    }
    public static void main(String[] args){
        DefaultAccessModifierDemo obj1=new DefaultAccessModifierDemo();
        obj1.addition();
        obj1.printResult();
    }

}
