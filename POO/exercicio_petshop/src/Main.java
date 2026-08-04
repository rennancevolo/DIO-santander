import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        int option;

        do{
            System.out.println("===Escolha uma das opções===");
            System.out.println("1- Dar banho no pet");
            System.out.println("2- abastecer maquina com agua");
            System.out.println("3- abastecer maquina com shampoo");
            System.out.println("4- Verificar agua da maquina");
            System.out.println("5- Verificar shampoo da maquina");
            System.out.println("6- Verificar se tem pet no banho");
            System.out.println("7- Colocar pet na máquina");
            System.out.println("8- Retirar pet da máquina");
            System.out.println("9- Limpar máquina");
            System.out.println("0 - sair");
            System.out.println("============================");
            option = scanner.nextInt();

            switch(option){
                case 1 -> petMachine.takeAShower();
                case 2 -> petMachine.addWater();
                case 3 -> petMachine.addShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.washMachine();
                case 0 -> System.exit(0);
                default -> System.out.println("opção inválida");
            }
        }while(true);
    }

    private static void verifyWater() {
        var amout = petMachine.getWater();
        System.out.println("A máquina está com " + amout + " litros de água");
    }

    private static void verifyShampoo() {
        var amout = petMachine.getShampoo();
        System.out.println("A máquina está com " + amout + " litros de shampoo");
    }

    private static void checkIfHasPetInMachine(){
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina" : "não tem pet na máquina");
    }

    public static void setPetInMachine() {
        var name = "";
        while (name.isEmpty()){
            System.out.println("Informe o nome do pet");
            name = scanner.nextLine();
        }

        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O pet " + pet.getName() +" foi colocado na máquina");
    }


}