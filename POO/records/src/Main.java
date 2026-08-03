public class Main {
    public static void main(String[] args) {
        var eu = new Person("Rennan", 22);
        System.out.println(eu);

        //cria um get por de baixo dos panos
        System.out.println(eu.name());

        var namorada = new Person("Laura", 19);
    }
}