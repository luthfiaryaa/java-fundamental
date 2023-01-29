package essential.java.classes.exception;

import java.util.*;

public class Example {
    public static void main(String[] args){
        ArrayList<Object> myList = new ArrayList<Object>();

        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for(int i = 0; i < myList.size(); i++)
            try{
                Integer var = (Integer) myList.get(i);
            }
            catch (Exception e) {
                System.out.println(e);
                System.out.println("Index of the ArrayList where the error occurred: " + i);
                System.out.println("Value of the object that triggered the error: " + myList.get(i));
            }

    }
}