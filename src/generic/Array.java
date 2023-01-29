package generic;

public class Array {
    public static void main(String[] args) {
        String[] aaa = {"cat", "dog"};
        Integer[] value = {2, 4, 8,1,2};

        printAll(value);
        printAll(aaa);
    }

    public static <T> void printAll(T[] names) {
        for (T x:names) {
            System.out.println(x);
        }
    }
}
