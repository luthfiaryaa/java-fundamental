package lambda.expression.util;

import java.time.*;
import java.time.chrono.*;
import java.util.*;

public class Person {
    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    public Sex gender;
    String emailAddress;

    public Person(String nameArg, LocalDate birthdayArg, Sex genderAge, String emailArg){
        name = nameArg;
        birthday = birthdayArg;
        gender = genderAge;
        emailAddress = emailArg;
    }

    public int getAge() {
        return birthday.until(IsoChronology.INSTANCE.dateNow()).getYears();
    }

    public void printPerson() {
        System.out.println(name + ", " + getAge());
    }

    public Sex getGender() {
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

}
