package generic;

public class InvariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Test");
        // doIt(stringMyData); // ERROR
        // MyData<Object> objectMyData = stringMyData; // ERROR


        MyData<Object> objectMyData = new MyData<>(1000);
        // MyData<Integer> integerMyData = objectMyData; // ERROR
        // doItInteger(objectMyData);
    }

    public static void doIt(MyData<Object> objectMyData){
        // do nothing
    }

    public static void doItInteger(MyData<Integer> integerMyData){
        // do nothing
    }
}
