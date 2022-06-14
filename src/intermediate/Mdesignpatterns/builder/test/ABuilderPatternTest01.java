package intermediate.Mdesignpatterns.builder.test;

import intermediate.Mdesignpatterns.builder.domain.Person;

public class ABuilderPatternTest01 {
    public static void main(String[] args) {
        Person person =  Person.PersonBuilder
                .builder()
                .firstName("Jefferson")
                .lastName("Borges de Brito")
                .email("jborgesdebrito@hotmail.com")
                .build();

        System.out.println(person);



    }


}
