package generic;

public class VariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("zero");
        MyData<Object> objectMyData = new MyData<>(1000);

        System.out.println(stringMyData.getData());
        System.out.println(objectMyData.getData());
    }
}
