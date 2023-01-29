package basic;

public class ToStringDemo {
    public String name;
    public int price;

    public ToStringDemo(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        ToStringDemo test = new ToStringDemo("Book",3000);

        System.out.println(test.name);
        System.out.println(test.toString());
    }
}
