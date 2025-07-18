public class OrderOfExecution {
    static {
        System.out.println("Static Block Executed");
    }

    {
        System.out.println("Instance Block Executed");
    }

    OrderOfExecution() {
        System.out.println("Constructor Executed");
    }

    public static void main(String[] args) {
        System.out.println("Main Method Started");
        new OrderOfExecution();
        new OrderOfExecution();
    }
}