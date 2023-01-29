package lambda.expression;

public class  CalculatorApp {
    interface jmlA {
        int hasil(int a, int b);
    }

    public int hasilnya(int a, int b, jmlA aa) {
        return aa.hasil(a, b);
    }

    public static void main(String[] args) {
        CalculatorApp aaa = new CalculatorApp();
        jmlA tambah = Integer::sum;
        jmlA perkalian = Integer::max;
        jmlA baaa = (a, b) -> (a/b);

        System.out.println(aaa.hasilnya(2, 2, tambah));
        System.out.println(aaa.hasilnya(2, 3, perkalian));
        System.out.println(aaa.hasilnya(0,1,baaa));
    }
}
