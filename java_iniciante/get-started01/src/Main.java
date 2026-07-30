import java.util.Scanner;

public class Main {
    private final static String WELCOME_MESSAGE = "Olá, informe seu nome e sua Idade";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(WELCOME_MESSAGE);
        String name = scanner.next();

        System.out.println("informe sua idade");
        int age = scanner.nextInt();

        System.out.printf("Olá %s sua idade é %d \n", name, age);
    }
}