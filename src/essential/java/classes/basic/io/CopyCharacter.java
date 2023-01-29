package essential.java.classes.basic.io;

import java.io.*;

public class CopyCharacter {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("inagain.txt");
            outputStream = new FileWriter("outagain.txt");

            int c;
            while ((c = inputStream.read()) !=-1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
