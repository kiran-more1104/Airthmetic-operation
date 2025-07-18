public class ReverseNum {
    public static void main(String[] args) {
        int num = 1234, reverse = 0;
        do {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        } while (num != 0);
        System.out.println("Reversed number = " + reverse);
    }
}