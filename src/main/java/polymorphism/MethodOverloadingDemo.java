package polymorphism;

public class MethodOverloadingDemo {
    int a;
    int b;
    int c;
    int d;
    int result;
    public void addition(int a, int b) {
        this.a = a;
        this.b = b;
        result = this.a + this.b;
        System.out.println("The sum of 2 digits is:" + result);
    }
    public void addition(int a, int b,int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        result = this.a + this.b + this.c;
        System.out.println("The sum of 3 digits is:" + result);
    }
    public void addition(int a, int b, int c, int d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        result=this.a+this.b+this.c+this.d;
        System.out.println("The sum of 4 digits is:"+result);
    }


    public static void main(String[] args) {
        MethodOverloadingDemo obj1=new MethodOverloadingDemo();
        obj1.addition(5,5);
        obj1.addition(5,5,5);
        obj1.addition(5,5,5,5);
    }

}
