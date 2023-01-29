package basic;

public class EqualsExample {
    public static void main(String[] args) {
        String name = "abcd efgh";
        String name2 = "abcd";
        name2 = name2 + " efgh";
        String name3 = "abcd efgh";


        System.out.println(name);
        System.out.println(name2);
        System.out.println(name == name2);
        System.out.println(name == name3);
		System.out.println(name.equals(name));
		System.out.println(name.equals(name2));
		System.out.println(name.equals(name3));

		System.out.println(name.equals(name));
		System.out.println(name2.equals(name));
		System.out.println(name3.equals(name));
    }
}
