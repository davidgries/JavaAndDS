import java.util.Random;

/** An instance repeatedly sleeps for a random time
 *  and then puts a random number into a buffer. */
public class Producer implements Runnable {
    private Dropbox dropbox; // The 1-item buffer

    /** Constructor: an instance using Dropbox d. */
    public Producer(Dropbox d) { dropbox= d; }

    /** Forever: sleep for a random time in 0..99 and
     * put a random number from 0..9 into the buffer. */
    public void run() {
        Random random= new Random();
        while (true) {
            int n= random.nextInt(10);
            try {
                Thread.sleep(random.nextInt(100));
                dropbox.put(n);
            } catch (InterruptedException e) { }
        }
    }
}