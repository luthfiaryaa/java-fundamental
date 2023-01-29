package generic;

public class ArrayHelper {

    public static <T> int count(T[] array) {
        return array.length;
    }

    public  static <T> void getName(T name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        String[] names = {"cat", "tiger", "owl"};
        Integer[] value = {2, 4, 8,1,2};

        getName(12);
        getName(1.2);

        System.out.println(ArrayHelper.<String>count(names));
        System.out.println(ArrayHelper.count(value));
    }
}
