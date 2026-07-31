public class Person
{
    //static é como se fosse uma variável da classe, não pertence à instancia para acessar "Person.teste()"
    public static String teste(){
        return "teste";
    }

    private final String name;
    private int age;

    //aplicando regras de negócios, name não pode ser alterado
    public Person(String name) {
        this.name = name;
    }
    public String getName (){
        return name;
    }

    public int getAge() {
        return age;
    }
    public void setAge (int age){
        this.age = age;
    }
}
