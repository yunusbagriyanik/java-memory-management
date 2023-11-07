// The stack is an area where data is temporarily stored
// local variables are part of the stack
// each method has its own stack
class StackExample {
    // number instance variable
    int number = 100;

    // x, y local variables
    public int add(int x, int y) {
        // we are using 'number' not declaring it inside the method
        System.out.println(number);
        return x + y;
    }
}

public class Main {
    public static void main(String[] args) {
        // local variable inside main method
        var intVar = 10;

        // reference variable
        var object = new StackExample();
        var sum = object.add(5, 10);
        System.out.println(sum);
    }
}