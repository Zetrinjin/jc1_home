package part7.Task47;

import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Files.walkFileTree(Paths.get("C:\\Users\\Ginsai\\Desktop\\test"), new MyFileVisitor());
    }
}
