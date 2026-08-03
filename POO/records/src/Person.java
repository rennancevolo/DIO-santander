public record Person(String name, int age) {
    //valores de records nao podem ser alterados depois de criar uma instancia
    public Person{
        System.out.println("===============");
        System.out.println(name);
        System.out.println(age);
    }
}
