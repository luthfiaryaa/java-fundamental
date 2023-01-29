package essential.java.classes.basic.io;

public class Root {
    public static void main(String[] args) {
        int i = 2;
        double r = Math.sqrt(i);

        System.out.println("The square root of ");
        System.out.println(i);
        System.out.println(" is ");
        System.out.println(r);
        System.out.println(".");

        i = 5;
        r = Math.sqrt(i);
        System.out.println("The square root of " + i + " is " + r + ".");
    }
}
