import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/** Read and print file data.txt. 
 * It is expected to be in the project directory. */
public class FileReader {

    /** Read and print the lines of file "data.txt", which is in
     * this project directory. */
    public static void main(String[] args) throws IOException {
        Path p= Paths.get("data.txt"); // p is a relative Path
        readFile(p);
    }

    /** Print the contents of the file given by p.
     * Precondition: p is a .txt file. */
    public static void readFile(Path p) throws IOException {
        System.out.println("The file is named: " + p.toString());
        System.out.println("It contains " + Files.size(p) + " chars, counting newlines");
        System.out.println("Here they are:");

        BufferedReader bf= Files.newBufferedReader(p);

        String lin= bf.readLine();
        // invariant: All lines before line lin have been read and processed, and
        //                 line lin has been read but not yet been processed
        while (lin != null) {
            System.out.println(lin);

            lin= bf.readLine();
        }
        bf.close();
    }
}
