package accessmodifiers;

public class PublicAccessModifierDemo {
    public int a;
    public int b;
    public int result;
    public PublicAccessModifierDemo(){
        a=100;
        b=400;
        result=0;
    }
    public void addition(){
        result=a+b;
    }
    public void printResult(){
        System.out.println("The Sum is:"+result);

    }
    public static void main(String[] args){
        PublicAccessModifierDemo obj1=new PublicAccessModifierDemo();
        obj1.addition();
        obj1.printResult();
    }
}

