/** example of diff between notify() and notifyAll().
 * From http
 * //stackoverflow.com/questions/37026/java-notify-vs-notifyall-all-over-again
 * Slightly modified.
 * All comments are from Gries
 */

/** An instance is a bounded buffer of size 1 with
 * the requirement that a consumer ask for either an
 * even integer or an odd integer.
 * This is equivalent to a consumer asking for a load
 * of white bread or a loaf of rye bread. */
public class Dropbox {
    private boolean empty= true;  // buffer is empty iff empty is not true
    private int number;           // value in buffer (if empty false)

    /** Wait for the buffer to contain a suitable number and then take it.
     * "Suitable" means even or odd, depending on whether parameter even
     * is true or false. */
    public synchronized int take(final boolean even) {
        while (empty || (number % 2 == 0) != even) {
            try {
                System.out.format("%s is waiting ... %n", even ? "Even" : "Odd");
                wait();
            } catch (InterruptedException e) { }
        }
        System.out.format("%s took %d.%n", even ? "Even" : "Odd", number);
        empty= true;
        notifyAll();
        return number;
    }

    /** Wait for the buffer to be empty and then put n into it. */
    public synchronized void put(int n) {
        while (!empty) {
            try {wait();}
            catch (InterruptedException e) {}
        }
        number= n;
        System.out.format("Producer put %d.%n", n);
        empty= false;
        notifyAll();
    }
}
