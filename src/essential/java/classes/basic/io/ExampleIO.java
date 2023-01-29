package essential.java.classes.basic.io;

import java.io.*;

public class ExampleIO {

    public static void main(String[] args) throws IOException {

        FileInputStream fileinput = new FileInputStream("inagain.txt");

        System.out.println((char)fileinput.read());
    }
}
