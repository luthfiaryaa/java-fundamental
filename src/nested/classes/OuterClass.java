package nested.classes;

public class OuterClass {

    private String outerField = "Outer Field";
    static String staticOuterField = "Static outer Field";

    class InnerClass {
        void accessMembers() {
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    static class StaticNeastedClass{
        void accessMembers(OuterClass outer) {
            //	System.out.println(outerField);
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }
    }

    class TopLevelClass {

        void accessMembers(OuterClass outer) {
            // Compiler error: Cannot make a static reference to the non-static
            //     field OuterClass.outerField
            // System.out.println(OuterClass.outerField);
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    public static void main(String[] args) {
        System.out.println("Inner class:");
        System.out.println("------------");
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.accessMembers();

        System.out.println("\nStatic nested class:");
        System.out.println("--------------------");
        StaticNeastedClass staticNestedObject = new StaticNeastedClass();
        staticNestedObject.accessMembers(outerObject);

        System.out.println("\nTop-level class:");
        System.out.println("--------------------");
        OuterClass.TopLevelClass topLevelObject = outerObject.new TopLevelClass();
        topLevelObject.accessMembers(outerObject);
    }
}
