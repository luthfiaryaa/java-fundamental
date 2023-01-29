package essential.java.classes.exception;

import java.io.*;
import java.util.*;

public class ListOfNumber {
    private List<Integer> list;
    private static final int SIZE = 10;
    public ListOfNumber () {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++)
            list.add(new Integer(i));
    }
    public void writeList() {
        PrintWriter out = null;
        try {
            System.out.println("Entering try statement");
            out = new PrintWriter(new FileWriter("OutFile.txt"));
            for (int i = 0; i < SIZE; i++)
                out.println("Value at: " + i + " = " + list.get(i));
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Caught IndexOutOfBoundsException: " +
                    e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }

    //Answer Excersice Exception
//    public void readList() {
//        String line = null;
//        try {
//
//        } catch (FileNotFoundException e) {
//            System.err.println("Filename : " + " Not found");
//        } catch (IOException e) {
//            System.err.println(e.toString());
//        }
//    }
//
//    public static void main(String[] args) {
//
//    }
}
