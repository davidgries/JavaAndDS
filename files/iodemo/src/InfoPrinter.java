import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/** Contains static methods to print information about a Path and
 * the file or directory described by a Path. */
public class InfoPrinter {
    /** Create a relative path for "data.txt" and print its class.
     * The path is relative to the project directory.
     * 
     * Then call printPathInfo to print info about the path.
     * 
     * Finally, call printFileInfo to print info about the file. */
    public static void main(String[] args) throws IOException {
        Path p= Paths.get("data.txt");
        System.out.println("p's class is: " + p.getClass());
        
        printPathInfo(p);
        
        System.out.println();
        printFileInfo(p);

    }

    /** Print information about the file/directory given by path p. */
    public static void printPathInfo(Path p) {
        System.out.println("\nHere is information about path p:");
        System.out.println("File system is: " + p.getFileSystem());
        System.out.println("the path file/directory: " + p.toString());
        System.out.println("number of names in path: " + p.getNameCount());
        System.out.println("parent's path is: " + p.getParent());
        System.out.println("root component is: " + p.getRoot());
        System.out.println("this path is absolute: " + p.isAbsolute());
        if (p.isAbsolute()) return;

        System.out.println("Rest of info is about absolute path corresponding to relative path.");
        p= p.toAbsolutePath();
        System.out.println("    absolute path is: " + p);
        System.out.println("    file/directory name is: " + p.getFileName());
        System.out.println("    number of names in path: " + p.getNameCount());
        System.out.println("    parent's path is: " + p.getParent());
        System.out.println("    root component is: " + p.getRoot());
    }

    /** Print information about the file determined by p */
    public static void printFileInfo(Path p) {
        System.out.println("\nHere is information about file/directory: " + p.toString());
        System.out.println("It exists: " + Files.exists(p));
        System.out.println("It" + (Files.isDirectory(p) ? " is a directory" : " is a file"));
        System.out.println("It is readable: " + Files.isReadable(p));
        System.out.println("It is writable: " + Files.isWritable(p));
    }
}
