import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o depósito inicial: R$ ");
        double depositoInicial = scanner.nextDouble();

        BankAccount conta = new BankAccount(depositoInicial);

        int opcao;

        do {
            System.out.println("\n==============================");
            System.out.println("      BANCO CEVOLO");
            System.out.println("==============================");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar uso do cheque especial");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.printf("Saldo: R$ %.2f%n", conta.consultarSaldo());
                    break;

                case 2:
                    System.out.printf("Cheque especial disponível: R$ %.2f%n",
                            conta.consultarChequeEspecial());
                    break;

                case 3:
                    System.out.print("Valor do depósito: R$ ");
                    double deposito = scanner.nextDouble();

                    if (conta.depositar(deposito)) {
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Valor inválido.");
                    }
                    break;

                case 4:
                    System.out.print("Valor do saque: R$ ");
                    double saque = scanner.nextDouble();

                    if (conta.sacar(saque)) {
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 5:
                    System.out.print("Valor do boleto: R$ ");
                    double boleto = scanner.nextDouble();

                    if (conta.pagarBoleto(boleto)) {
                        System.out.println("Boleto pago com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 6:
                    if (conta.estaUsandoChequeEspecial()) {
                        System.out.println("A conta está utilizando o cheque especial.");
                    } else {
                        System.out.println("A conta NÃO está utilizando o cheque especial.");
                    }
                    break;

                case 0:
                    System.out.println("Obrigado por utilizar o Banco CEVOLO!");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}