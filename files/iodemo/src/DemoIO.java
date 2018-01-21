import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.net.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.*;

/** Demo IO */
public class DemoIO {

    public static String courseLinksPage=
            "http://www.cs.cornell.edu/courses/CS2110/2017fa/links.html";

    /** Demo IO stuff */
    public static void main(String[] pars) throws IOException {
//        fileDec();   // Demo 1: File declaration and use.
//        fileDirectory(); // Demo getting files in a directory
//
//        Path p= Paths.get("res/note.xml");
//        int n= getSize(p);
//        System.out.println("number of lines in map1.xml: " + n);
//
//        URLlines(15, new URL(courseLinksPage));
//
//        System.out.println("Finished writing URL lines: \n");

        extract();
    }

    /** Create a Path, print length of file and absolute path 
     * @throws IOException */
    public static void fileDec() throws IOException {
        Path p= Paths.get("res/note.xml");
        System.out.println("\nlength of File p is " + Files.size(p));
        System.out.println("Absolute path is " + p.toAbsolutePath());
    }

    /** Print the entries in directory "dir" 
     * @throws IOException */
    public static void fileDirectory() throws IOException {
        Path p= Paths.get("dir");
        if (Files.isDirectory(p)) {
            ArrayList<Path> paths= getEntries(p);
            System.out.println("\nfiles in dir are: " + paths);
        }
    }

    /** Return a list of entries in directory p.
     * Precondition: p is a directory. 
     * @throws IOException */
    public static ArrayList<Path> getEntries(Path p) throws IOException {
        DirectoryStream<Path> entries= Files.newDirectoryStream(p);
        ArrayList<Path> paths= new ArrayList<>();
        for (Path path : entries) {
            paths.add(path);
        }
        return paths;
    }

    /** Return the number of lines in file p.
     * Precondition: p is indeed a file. */
    public static int getSize(Path p) throws IOException {
        BufferedReader br= Files.newBufferedReader(p);
        int n= 0;  // number of lines read so far
        String lin= br.readLine();
        // invariant: n is the number of lines read thus far, NOT
        //    counting the last line read, lin.
        while (lin != null) {
            n= n+1;
            lin= br.readLine();
        }
        br.close();
        return n;
    }

    /** Print the first n lines of the html file given by URL */
    public static void URLlines(int n, URL url) throws IOException {
        InputStreamReader isr= new InputStreamReader(url.openStream());
        BufferedReader br= new BufferedReader(isr);
        String lin= br.readLine();
        int h= 0;
        // invariant: h lines have been printed and line is the next
        //            one to print (if not null)
        while (h < n  &&  lin != null) {
            System.out.println(lin);
            h= h+1;
            
            lin= br.readLine();
        }
        br.close();
    }


    /** Obtain a file name from the user using a JFileChooser
      and return a reader that is linked to it. If the user cancels the
      dialog window (and thus does not give a file name) or there
      is an IO error, return null.
      Parameter s can be a path on the hard drive or null. If s is not null,
      start the JFileChooser at the path given by s.*/
    public static BufferedReader getReader(String s) {
        try {
            JFileChooser jd;
            if (s == null) {
                jd= new JFileChooser();
            }
            else {
                jd= new JFileChooser(s);
            }

            jd.setDialogTitle("Choose input file");
            int returnVal= jd.showOpenDialog(null);

            if (returnVal != JFileChooser.APPROVE_OPTION) {
                System.out.println("Dialog window canceled, or IO error");
                return null;
            }

            System.out.println("You chose file " + jd.getSelectedFile());
            Path p= jd.getSelectedFile().toPath();
            return Files.newBufferedReader(p);
        }
        catch (IOException e) {
            return null;
        }
    }

    /** Obtain a file name from the user using a JFileChooser
    and return a writer that is linked to it. If the user cancels the
    dialog window (and thus does not give a file name) or there
    is an IO error, return null.
    Parameter s can be a path on the hard drive or null. Don't use s.*/
    public static PrintWriter getWriter(String s) throws IOException {

        try {
            JFileChooser jd= new JFileChooser();

            jd.setDialogTitle("Choose output file");
            jd.showSaveDialog(null);
            File f= jd.getSelectedFile();
            if (f == null) {
                return null;
            }
            FileWriter fw= new FileWriter(f);
            return new PrintWriter(new BufferedWriter(new FileWriter(f)));
        } catch (IOException e) {
            return null;
        }
    }

    /** Obtain from the user an input file, expected to be a .java file (using a JFileChooser).
     * Obtain from the user an output file name to write (using a JFileChooser)
     * Write on the output file all lines of the input file that have "//" in them. */
    public static void extract() throws IOException {

        // store in input a BufferedReader for the input file.
        BufferedReader input= getReader(null);

        // Store in output a PrintStream out for the output file.
        PrintWriter output= getWriter(null);

        // Write to output all lines of input that have "//" in them
        String lin= input.readLine();
        // invariant: All input lines before the one in line that
        //            contain "//" have been placed in output
        while (lin != null) {
            if (lin.contains("//")) {
                output.println(lin);
            }
            lin= input.readLine();
        }

        // Close streams
        input.close();
        output.close();


    }

}
