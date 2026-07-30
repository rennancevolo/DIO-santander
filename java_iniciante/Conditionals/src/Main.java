import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        var name = scanner.next();

        System.out.println("Informe sua idade: ");
        var age = scanner.nextInt();

        var canDrive = age >= 18;

        // OPERADOR TERNÁRIO
        var message = canDrive ?
                name + ", Você tem mais de 18 anos e pode dirigir":
                name + ", Você tem menos de 18 anos e não pode dirigir";

        System.out.println(message);
        System.out.println("Fim da execução");
    }
}