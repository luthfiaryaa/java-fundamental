package lambda.expression;

import lambda.expression.util.*;

import java.time.*;
import java.util.*;
import java.util.function.*;

public class Approach6 {
    public static void printPersonsWithPredicate(
            List<Person> roster, Predicate<Person> tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
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

        printPersonsWithPredicate(
                roster,
                p -> p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 25
        );
    }
}
