import java.io.BufferedReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.io.*;

/** Contains static methods to demonstrate reading a webpage. */
public class URLReader {
    public static String apple= "https://www.apple.com";
    public static String microsoft= "https://www.microsoft.com/en-us/";
    public static String tinyurl= "http://tinyurl.com";
    public static String wikiJava= "https://en.wikipedia.org/wiki/Java";
    public static String cornell= "http://www.cornell.edu";
    public static String PhDGenealogy= "https://genealogy.math.ndsu.nodak.edu/id.php?id=22781";
    public static String PGAPlayers= "https://www.pgatour.com/players.html";

    /** Read and print the first 20 lines of a webpage. Replace the
     * argument of the call of constructor URL in the first statement
     * of the method body with one of the static field names given above.
     * @throws IOException */
    public static void main(String[] args) throws IOException  {
        URL url= new URL(PGAPlayers);
        BufferedReader bf= getReader(url);
        readFile(bf, 20);
    }

    /** Print the first n lines of file br.
     * Precondition: p is a character file, like an html file.
     *               n >= 0 */
    public static void readFile(BufferedReader bf, int n) throws IOException {
        int k= 0;
        String lin= bf.readLine();
        // invariant: All lines before line lin have been read and processed, and
        //                 line lin has been read but not yet been processed, and
        //                 k is the number of lines printed.
        while (lin != null) {
            System.out.println(lin);
            k= k+1;
            if (k >= n) {
                bf.close();
                return;
            }
            lin= bf.readLine();
        }
        bf.close();
    }

    /**  Return a reader for URL url.
     * Return null if (1) url is null or
     * (2) its protocol is not  http or https. 
     * @throws IOException */
    private static BufferedReader getReader(URL url) throws IOException {
        if (url == null) return null;
        String p= url.getProtocol();
        if (!(p.equals("http")  || p.equals("https"))) return null;
        InputStream is= url.openStream();
        InputStreamReader isr= new InputStreamReader(is);
        return new BufferedReader(isr);
    }

}
