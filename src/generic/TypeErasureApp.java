package generic;

public class TypeErasureApp {
    public static void main(String[] args) {

        MyData myData = new MyData("two");

        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData();
    }
}
