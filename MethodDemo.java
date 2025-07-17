public class MethodDemo {

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Non-static method
    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {
        // Call static method
        staticMethod();

        // Create object to call non-static method
        MethodDemo obj = new MethodDemo();
        obj.nonStaticMethod();
    }
}