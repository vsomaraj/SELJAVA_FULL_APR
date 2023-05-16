package methods;

public class ArithmeticOperations {
    public int a;
    public int b;
    public int result;
    public int x;
    public double y;
    public double result1;

    public ArithmeticOperations() {
        a = 600;
        b = 500;
        result = 0;
    }

    //Method without return value
    public void addition() {
        result = a + b;
    }

    public void printResult() {
        System.out.println("The sum is:" + result);
    }

    public double subtraction(int x, double y) {
        this.x = x;
        this.y = y;
        this.result1 = x - y;
        return result1;
    }

    public void printResult1() {
        System.out.println("The subtracted value is:" + result1);
    }

    public static void main(String[] args) {
        double result3;
        ArithmeticOperations obj1 = new ArithmeticOperations();
        obj1.addition();
        obj1.printResult();
        obj1.subtraction(20, 10.2);
        obj1.printResult1();

//        int resultMain=obj1.subtraction();
//        System.out.println(resultMain);
    }
}
