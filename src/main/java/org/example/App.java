package org.example;

import org.example.model.Fish;
import org.example.model.Person;
import org.example.model.Wife;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person=context.getBean("personId",Person.class);
        System.out.println(person);
        person.minusPlusImpl();
        System.out.println();
        Wife wife = context.getBean("wifeId",Wife.class);
        System.out.println(wife);
        wife.minusPlusImplCat();

//        System.out.println(person.getAnimal());
//        Fish fish = context.getBean("fishId",Fish.class);
//        System.out.println(fish );
//        fish.animalMinus();
//        fish.animalPlus();



    }
}
