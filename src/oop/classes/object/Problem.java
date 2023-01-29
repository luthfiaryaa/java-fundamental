package oop.classes.object;

public class Problem {
    String s;
    class Inner {
        void testMethod() {
            s = "Set from inner";
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Problem problem = new Problem();
        Problem.Inner inner = problem.new Inner();

        inner.testMethod();
    }
}
