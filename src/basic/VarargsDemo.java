package basic;

public class VarargsDemo {
    public static void display(int num, String... value) {
        System.out.println("Number is: " +num);
        for (String a:value) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        display(10, "Aaaa");;
        display(500,"aaa","bbb");
    }
}
