package generic;

public class Box1 {
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static void main(String[] args) {
        Box1 box = new Box1();
        box.setObject(1f);

        System.out.println(box.getObject());
    }
}
