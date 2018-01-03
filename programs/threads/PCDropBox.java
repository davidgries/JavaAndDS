/** Example of diff between notify() and notifyAll(). */
public class PCDropBox {
    /** Method main creates a Producer thread, an even
      * consumer thread, and an odd consumer thread and
      * starts them. */
    public static void main(String[] args) {
        Dropbox db= new Dropbox();
        (new Thread(new Consumer(true, db))).start();
        (new Thread(new Consumer(false, db))).start();
        (new Thread(new Producer(db))).start();
    }
}

/** An instance is a bounded buffer of size 1.
  * Restriction: a consumer must ask for
  * either an even integer or an odd integer. */
class Dropbox {
    private boolean full= false;  // = "buffer is full"
    private int num;      // buffer value (if full)
    
    /** Wait for buffer to hold an even no. (if e is true) or
      * an odd no. (if e is false); then take and return it. */
    public synchronized int take(boolean e) {
        String s= e ? "Even" : "Odd";
        while (!full ||  e == (num % 2 != 0)) {
            try {
                System.out.println("wait for: " + s);
                wait();
            } catch (InterruptedException ex) { }
        }
        System.out.println(s + " took " + num);
        full= false; notifyAll(); return num;
    }
    
    /** Wait for buffer to be empty, then put n into it. */
    public synchronized void put(int n) {
        while (full) {
            try {wait();}
            catch (InterruptedException e) {}
        }
        System.out.println("Producer put in " + n);
        num= n; full= true;  notify();
    }
}
