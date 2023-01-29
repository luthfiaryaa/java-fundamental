package essential.java.classes.basic.io;

import java.nio.file.*;

public class FileTest {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("usage: Filetest file");
            System.exit(-1);
        }

        Path inputPath = Paths.get(args[0]);
        Path fullPath = inputPath.toAbsolutePath();
    }
}
