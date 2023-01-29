package essential.java.classes.exception;

public class ExampleThrow {

    static void checkAge(int Age) {
        if (Age < 18){
            throw new ArithmeticException("access denied, you must be at least over 18 years of age");
        } else {
            System.out.println("access received");
        }
    }

    public static void main(String[] args) {
        checkAge(20);
        System.out.println("");
        checkAge(11);
    }
}
