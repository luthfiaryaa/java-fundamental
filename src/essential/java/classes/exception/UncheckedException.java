package essential.java.classes.exception;

import java.io.*;

public class UncheckedException {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("aa.txt");
        } catch (IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}