package lambda.expression;

import lambda.expression.util.*;

import java.time.*;
import java.util.*;

public class Approach1 {

    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    public static void main(String[] args) {
        List<Person> roster = new ArrayList<>();
        roster.add(new Person("Adi", LocalDate.of(1998, 8, 12), Person.Sex.MALE, "adi@mail.com"));
        roster.add(new Person("Budi", LocalDate.of(1996, 4, 7), Person.Sex.MALE, "budi@mail.com"));
        roster.add(new Person("Cella", LocalDate.of(2000, 7, 8), Person.Sex.FEMALE, "cella@mail.com"));
        roster.add(new Person("Desy", LocalDate.of(1999, 2, 28), Person.Sex.FEMALE, "desy@mail.com"));
        roster.add(new Person("Edi", LocalDate.of(1992, 12, 3), Person.Sex.MALE, "adi@mail.com"));

        for (Person p : roster) {
            p.printPerson();
        }

        System.out.println("Persons older than 20:");
        printPersonsOlderThan(roster, 20);
        System.out.println();
    }
}
