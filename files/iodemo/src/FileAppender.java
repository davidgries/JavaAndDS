import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/** Contains demo for appending to a file. */
public class FileAppender {

    /** Append the sequence of integers in 0..n to file number.txt.
     * if args[0] doesn't exist or is not an integer, use n = 10;
     * otherwise, use n = args[0]. File number.txt is expected to be
     * in the project directory. If it is not there, it will be created. */
    public static void main(String[] args) {
        Path p= Paths.get("number.txt"); // p is a relative Path
        try {
            int n= Integer.parseInt(args[0]);
            appendToFile(p, n);
        } catch (RuntimeException re) {
            appendToFile(p, 10);
        }

    }
    
    /** Append the numbers 0..n to file p. */
    public static void appendToFile(Path p, int n) {
        PrintWriter pr;
        try {
            pr= new PrintWriter(Files.newBufferedWriter(p, StandardOpenOption.APPEND));
        } catch (IOException io) {
            throw new RuntimeException("newBufferedWriter threw IO Exception");
        }
        
        // Write 0..n to pr.
        for (int k= 0; k <= n; k= k+1) {
            pr.println(k);
        }
        
        pr.close(); 
    }
}
