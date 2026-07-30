import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um numero");
        int firstNum = scanner.nextInt();
        int num2;

        do{
            System.out.printf("\nEntre com um numero que dividido por %s dê resto 0 : ", firstNum);
            num2 = scanner.nextInt();

            if (num2 <= firstNum) {
                System.out.printf("\nEntre com um numero maior que %s!! \n", firstNum);
            }
        }while(num2 % firstNum != 0 || num2 == firstNum);

        var result = num2 % firstNum;
        System.out.printf("\n%s %% %s = %s\n", num2, firstNum, result);

         System.out.println("Fim da execução...");
    }
}