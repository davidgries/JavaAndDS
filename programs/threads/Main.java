import java.util.Random;
public class Main {
    /** Create a two Consumer threads and a
      * Producer thread and start all three. */
    public static void main(String[] args) {
        Dropbox box= new Dropbox();
        new Thread(new Consumer(box)).start();
        new Thread(new Consumer(box)).start();
        new Thread(new Producer(box)).start();
    }
}

/** An instance is a dropbox: A place for producers to
  * store an integer and for consumers to take integers. */
class Dropbox {
    private boolean full= false;  // = "buffer is full"
    private int box;      // dropbox value (if full)
    
    /** Wait for box to hold an integer; then take and return it. */
    public synchronized int take() {
        while (!full) {
            try { wait();}
            catch (InterruptedException ex) { }
        }
        full= false; notifyAll(); return box;
    }
    
    /** Wait for box to be empty, then put n into it. */
    public synchronized void put(int n) {
        while (full) {
            try {wait();}
            catch (InterruptedException e) {}
        }
        box= n; full= true;  notifyAll();
    }
}


/** An instance alternately takes an
  * integer from a Dropbox and sleeps */
class Consumer implements Runnable { 
    private Dropbox box;
    
    /** Constructor: a Consumer using db */
    public Consumer(Dropbox db) {box= db; }
    
    /** Forever: Get a value from the Dropbox
      * and sleep for a random time. */
    @Override public void run() {
        Random random= new Random();
        while (true) {
            int i= box.take();
            System.out.println(
                               Thread.currentThread().getName() +
                               " " + i);
            try {
                Thread.sleep(random.nextInt(100));
            } catch (InterruptedException e) { }
        }}}

/** An instance repeatedly sleeps and
  *  puts a random number into a Dropbox. */
class Producer implements Runnable {
    private Dropbox box;
    
    /** Constructor: a Producer using db */
    public Producer(Dropbox db) {box= db;}
    
    /** Forever: sleep for a random time and
      * put a random number into the Dropbox. */
    public void run() {
        Random random= new Random();
        while (true) {
            int n= random.nextInt(10);
            try {
                Thread.sleep(random.nextInt(100));
            } catch (InterruptedException e) { }
            box.put(n);
        }
    }
}
