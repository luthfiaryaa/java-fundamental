package essential.java.classes.exception;

public class ExampleTryCatchFinally {
    public static void main(String[] args) {
        try {
            int[] myNumber = {1, 2, 3};
            System.out.println(myNumber[3]);
        } catch(Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("try... catch done");
        }
    }
}
