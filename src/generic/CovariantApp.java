package generic;

public class CovariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("two");
        MyData<Integer> integerMyData = new MyData<>(1);
        process(stringMyData);
        process(integerMyData);

      //  MyData<? extends Object> myData = stringMyData;
    }

    public static void process(MyData<? extends Object> myData) {
        System.out.println(myData.getData());
        //myData.setData(1);
    }
}
