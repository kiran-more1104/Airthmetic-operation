public class CheckPassword {
    public static void main(String[] args) {
        String password = "mypassword";
        if (password.length() >= 8) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is too short.");
        }
    }
}