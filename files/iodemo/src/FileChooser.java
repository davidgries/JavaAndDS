import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.swing.JFileChooser;



/** Demo the use of a JFileChooser to obtain a file to be read and a
 * file to be wrtten. */
public class FileChooser {

    /** */
    public static void main(String[] args) {
        printNumberOfLines();

        // write3Lines();
    }
    
    /** Use JFileChooser to let the user choose a file to be read.
     * If one is chosen, print the number of lines in the file.
     * Throw a RuntimeException if an IOException is thrown while reading bf.*/
    public static void printNumberOfLines() {
        Path p= getInputPath(null);
        if (p == null) {
            System.out.println("No file chosen");
            return;
        }
        System.out.println("File " + p + " chosen.");
        try {
            BufferedReader bf= Files.newBufferedReader(p);
            String lin= bf.readLine();
            int n= 0;
            // inv: n = number of lines read, not counting line lin
            while (lin != null) {
                n= n+1;

                lin= bf.readLine();
            }
            System.out.println("File " + p + " has " + n + " lines.");
            
            bf.close();
        } catch (IOException ioe) {
            throw new RuntimeException("IOException thrown.");
        }
    }
    

    /** Use JFileChooser to let the user choose a file to be written.
     * If one is chosen, write 3 lines on it.
     * Throw a RuntimeException if an IOException is thrown while reading bf.*/
    public static void write3Lines() {
        Path p= getOutputPath(null);
        if (p == null) {
            System.out.println("No file chosen");
            return;
        }
        System.out.println("File " + p + " chosen.");
        try {
            PrintWriter pr= new PrintWriter(Files.newBufferedWriter(p));
            
            pr.println("firstline");
            pr.println("secondline");
            pr.println("thirdline");
            
            pr.close();
        } catch (IOException ioe) {
            throw new RuntimeException("IOException thrown.");
        }
    }

    /** Use a JFileChooser to obtain a Path to a file to be read.
     * If the user cancels the dialog window (and thus does not give a
     * file name), return null.
     * Parameter s can be a path on the hard drive or null. If s is not
     * null, start the JFileChooser at the path given by s.*/
    public static Path getInputPath(String s) {
            JFileChooser jd= s == null ? new JFileChooser() : new JFileChooser(s);

            jd.setDialogTitle("Choose input file");
            int returnVal= jd.showOpenDialog(null);

            if (returnVal != JFileChooser.APPROVE_OPTION) {
                return null;
            }

            return jd.getSelectedFile().toPath();
    }
    
    /** Use a JFileChooser to obtain a Path to a file to be written.
     * If the user cancels the dialog window (and thus does not give a
     * file name), return null.
     * Parameter s can be a path on the hard drive or null. If s is not
     * null, start the JFileChooser at the path given by s.*/
    public static Path getOutputPath(String s) {
            JFileChooser jd= s == null ? new JFileChooser() : new JFileChooser(s);

            jd.setDialogTitle("Choose output file");
            int returnVal= jd.showSaveDialog(null);

            if (returnVal != JFileChooser.APPROVE_OPTION) {
                return null;
            }

            return jd.getSelectedFile().toPath();
    }


}
