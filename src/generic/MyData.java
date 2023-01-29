package generic;

public class MyData<T> {
    private T data;

    public MyData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        MyData<String> dataString = new MyData<>("one two");
        MyData<Integer> dataInteger = new MyData<>(12);
        var myDataBoolean = new MyData<Boolean>(true);
        var myDataInteger = new MyData<Integer>(30);

        System.out.println(dataString.getData());
        System.out.println(dataInteger.getData());
        System.out.println(myDataBoolean.getData());
        System.out.println(myDataInteger.getData());
    }
}
