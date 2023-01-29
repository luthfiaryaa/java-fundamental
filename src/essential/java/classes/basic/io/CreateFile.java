package essential.java.classes.basic.io;

import java.io.*;

public class CreateFile {
    public static void main(String[] args) {

        String[] names = {"John", "Carl", "Jerry"};

        try {
            // create new file IO
            BufferedWriter writer = new BufferedWriter(new FileWriter("newfile.txt"));
            writer.write("Writing to a file");
            writer.write("\nHere is another line");

            for (String name : names) {
                writer.write("\n" + name);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // erad file
        try {
            BufferedReader reader = new BufferedReader(new FileReader("newfile.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
