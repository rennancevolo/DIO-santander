import java.util.Scanner;

public class Main {
    public static void Menu()
    {
        System.out.println("---------MENU--------");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Divisão");
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro numero");
        var value1 = scanner.nextInt();

        System.out.println("Informe o segundo numero"); 
        var value2 = scanner.nextInt();

        Menu();
        var option = scanner.nextInt();

        switch (option)
        {
            case 1:
                System.out.printf("%s + %s = %s", value1, value2, value1 + value2);
                break;

            case 2:
                System.out.printf("%s + %s = %s", value1, value2, value1 - value2);
                break;

            case 3:
                System.out.printf("%s + %s = %s", value1, value2, value1 * value2);
                break;

            case 4:
                System.out.printf("%s + %s = %s", value1, value2, value1 / value2);
                break;
        }
    }
}