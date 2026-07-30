import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Quantos anos você tem? ");
        var age = scanner.nextInt();

        System.out.println("Você é emancipado? (true/false)");
        var isEmancipated = scanner.nextBoolean();

        var canDrive = (age > 17) || (isEmancipated && age >= 16);

        System.out.printf("Você pode dirigir? (%s)", canDrive);
    }
}