package lambda.expression;

import lambda.expression.util.*;

import java.time.*;
import java.util.*;
//import static lambda.expression.Approach3.printPersons;

public class Approach4 {

    public static void printPersons(
            List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    interface CheckPerson {
        boolean test(Person p);
    }

    public static void main(String[] args) {
        List<Person> roster = new ArrayList<>();
        roster.add(new Person("Adi", LocalDate.of(1998, 8, 12), Person.Sex.MALE, "adi@mail.com"));
        roster.add(new Person("Budi", LocalDate.of(1996, 4, 7), Person.Sex.MALE, "budi@mail.com"));
        roster.add(new Person("Cella", LocalDate.of(2000, 7, 8), Person.Sex.FEMALE, "cella@mail.com"));
        roster.add(new Person("Desy", LocalDate.of(1999, 2, 28), Person.Sex.FEMALE, "desy@mail.com"));
        roster.add(new Person("Edi", LocalDate.of(1992, 12, 3), Person.Sex.MALE, "adi@mail.com"));

        System.out.println("Persons who are eligible for Selective Service " +
                "(anonymous class):");

        printPersons(roster, new CheckPerson() {
            public boolean test(Person p) {
                return p.getGender() == Person.Sex.MALE
                                && p.getAge() >= 18
                                && p.getAge() <= 25;
                    }
                }
        );

        System.out.println();

    }
}
