import java.time.LocalDate;
import java.time.Period;

public class Person
{
    //static é como se fosse uma variável da classe, não pertence à instancia para acessar "Person.teste()"
    public static String teste(){
        return "teste";
    }

    private final String name;
    private LocalDate birthDate;

    //aplicando regras de negócios, name não pode ser alterado, idade é calculada sempre que chama o metodo "getAge()"
    public Person(String name, LocalDate birthDate) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("O nome não pode ser vazio.");
        }

        if (birthDate == null) {
            throw new IllegalArgumentException("A data de nascimento é obrigatória.");
        }

        if (birthDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("A data de nascimento não pode estar no futuro.");
        }

        this.name = name;
        this.birthDate = birthDate;
    }
    public String getName (){
        return name;
    }

    public int getAge() {
        //periodo entre data de nascimento e a data de hoje -> retorna 0000-00-00 -> pega o ano e tem a idade
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}
