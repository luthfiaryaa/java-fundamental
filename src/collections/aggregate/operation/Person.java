package collections.aggregate.operation;

import java.time.*;
import java.time.chrono.*;
import java.util.*;

public class Person {

    public Person() {

    }

    public Person(String name, LocalDate birthday, Gender gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public enum Gender {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Gender gender;
    String emailAddress;

    public int getAge() {
        return birthday.until(IsoChronology.INSTANCE.dateNow()).getYears();
    }

    public void printPerson() {
        System.out.println(name + " " + this.getAge());
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

    public static List<Person> createRoster() {
        List<Person> roster = new ArrayList<>();

        roster.add(new Person("Fred", IsoChronology.INSTANCE.date(1980,6,20)
                ,Gender.MALE,"fred@example.com"));
        roster.add(new Person("Jane", IsoChronology.INSTANCE.date(1990,7,15)
                ,Gender.MALE,"jane@example.com"));
        roster.add(new Person("George", IsoChronology.INSTANCE.date(1991,8,13)
                ,Gender.FEMALE,"george@example.com"));
        roster.add(new Person("Bob", IsoChronology.INSTANCE.date(2000,9,12)
                ,Gender.MALE,"bob@example.com"));

        return roster;
    }

    public static void main(String[] args) {
        List<Person> roster = Person.createRoster();

        // 1. Print names of members, for-each loop
        System.out.println("Member of the collection (for-each loop):");
        for (Person p : roster) {
            System.out.println(p.getName());
        }

        // 2. Print names of members, forEach operation
        System.out.println("Members of the collection (bulk data operations):");
        roster.stream().forEach(e -> System.out.println(e.getName()));

        // 3. Print names of male members, forEach operation
        System.out.println("Male member of the collection (bulk data operations):");
        roster.stream().filter(e -> e.getGender() == Person.Gender.MALE).
                forEach(e -> System.out.println(e.getName()));

        // 4. Print names of male members, for-each loop
        System.out.println("Male members of the collection (for-each loop):");
        for (Person p : roster) {
            if (p.getGender() == Person.Gender.MALE) {
                System.out.println(p.getName());
            }
        }

        // 5. Get average age of male members of the collection:
        double average = roster.stream().filter(p -> p.getGender() == Person.Gender.MALE)
                .mapToInt(Person::getAge).average().getAsDouble();
        System.out.println("Average age of male members (bulk data operations): " + average);
    }
}
