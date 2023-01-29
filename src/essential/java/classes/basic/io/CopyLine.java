package essential.java.classes.basic.io;

import java.io.*;

public class CopyLine {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("inagain.txt"));
            outputStream = new PrintWriter(new FileWriter("outagain.txt"));

            String l;
            while ((l = inputStream.readLine()) != null){
                outputStream.println(l);
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
