package basic;

public class TextFormat {

	public static void main(String[] args) {
		long n = 461012;
		System.out.format("%d%n", n);
		System.out.format("%d08%n", n);
		System.out.format("%+8d%n", n);
		System.out.format("%+,8d%n", n);
	}
}
