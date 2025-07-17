public class SumOverload {

    // Method with two int parameters
    int sum(int a, int b) {
        return a + b;
    }

    // Method with three int parameters
    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        SumOverload obj = new SumOverload();
        System.out.println("Sum of 10 and 20: " + obj.sum(10, 20));
        System.out.println("Sum of 5, 15, and 25: " + obj.sum(5, 15, 25));
    }
}