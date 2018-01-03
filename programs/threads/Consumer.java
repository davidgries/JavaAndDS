import java.util.Random;

/** An instance alternately consumes either even or odd
  * integers (but not both) from a Dropbox and sleeps */
public class Consumer implements Runnable {
    private Dropbox dropbox; // The 1-item buffer 
    private boolean even;  // Take even values iff even
    
    /** Constructor: An instance taking values from d.
      * ---even values iff e is true. */
    public Consumer(boolean e, Dropbox d) {
        even= e;  dropbox= d;
    }
    
    /** Forever: Get value of right kind from buffer
      * and sleep for a random amount of time. */
    @Override public void run() {
        Random random= new Random();
        while (true) {
            dropbox.take(even);
            try {
              Thread.sleep(random.nextInt(100));
            } catch (InterruptedException e) { }
        }}}