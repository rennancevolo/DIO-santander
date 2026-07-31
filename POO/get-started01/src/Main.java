import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var male = new Person("Rennan", LocalDate.of(2050, 6, 10));

        System.out.printf("\n%s", Person.teste());
        System.out.printf("\nMale name: %s \nMale age: %s",male.getName(), male.getAge());
    }
}