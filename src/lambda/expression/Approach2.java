package lambda.expression;

import lambda.expression.util.*;

import java.time.*;
import java.util.*;

public class Approach2 {

    public static void printPersonsWithinAgeRange(
            List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
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

        System.out.println("Persons between the ages of 14 and 30:");
        printPersonsWithinAgeRange(roster, 14, 30);
        System.out.println();
    }

}
