package generic;

public class Box<T> {
    private T t;

    public void setBox(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        Box<String> box1 = new Box<>();

        box1.setBox("one");
        box.setBox(1);
        System.out.println("data: " + box.get());
        System.out.println("data: " + box1.get());
    }
}
