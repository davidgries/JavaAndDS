import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/** Write integers to file number.text into the project directory. 
 * It is already there, it will be replaced. */
public class FileWriter {

    /** Write a sequence of integers 0..n in a new file number.txt in
     * the project directory. If a file with that name already exists,
     * replace it.
     * if args[0] doesn't exist or is not an integer, choose n = 10;
     * otherwise, use n = args[0]. */
    public static void main(String[] args) {
        Path p= Paths.get("number.txt"); // p is a relative Path
        try {
            int n= Integer.parseInt(args[0]);
            writeFile(p, n);
        } catch (RuntimeException re) {
            writeFile(p, 10);
        }

    }

    /** Write the numbers 0..n to file p, reaplcing file if it already exists */
    public static void writeFile(Path p, int n) {
        PrintWriter pr;
        try {
            pr= new PrintWriter(Files.newBufferedWriter(p));
        } catch (IOException io) {
            throw new RuntimeException("newBufferedWriter threw IO Exception");
        }
        
        // Write lines with integers in 0..n to file pr
        for (int k= 0; k <= n; k= k+1) {
            pr.println(k);
        }
        
        pr.close();
    }
}
