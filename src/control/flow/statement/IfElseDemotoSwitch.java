package control.flow.statement;

public class IfElseDemotoSwitch {
    public static void main(String[] args) {
        int testscore = 76;
        char grade;
        switch (testscore/10) {
            case 9: grade = 'A';
                break;
            case 8: grade = 'B';
                break;
            case 7: grade = 'C';
                break;
            case 6: grade = 'D';
                break;
            default: grade = 'F';
                break;
        }
        System.out.println("Grade = "+ grade);
    }
}
