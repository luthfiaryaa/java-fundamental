package essential.java.classes.exception;

public class RuntimeException {

    public static void main(String[] args) {
        int[] arr = {2,3,4};

        try {
            System.out.println("Array indeks: " + arr[7]);
        } catch (Exception e){
            System.err.println("error");;
        } finally {
            System.out.println("FINAL");
        }

        System.out.println("end");
    }
}
