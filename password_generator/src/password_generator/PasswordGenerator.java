package password_generator;
import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Random Password Generator!");
        System.out.print("Enter the length of the password: ");
        int length = scanner.nextInt();

        String password = generateRandomPassword(length);
        System.out.println("Your random password is: " + password);

        scanner.close();
    }

    public static String generateRandomPassword(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{}|;:,.<>?";

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            password.append(characters.charAt(randomIndex));
        }

        return password.toString();
    }
}
