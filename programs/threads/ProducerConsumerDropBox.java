/** example of diff between notify() and notifyAll().
 * From http
 * stackoverflow.com/questions/37026/java-notify-vs-notifyall-all-over-again
 */
public class ProducerConsumerDropBox {
    /** Study class Dropbox, which is a traditional bounded buffer of
     * one value (an integer) but with the additional requirement that
     * a consumer must ask either for an even integer or an odd integer.
     * 
     * Run this program as is and see the output that is produced --
     * a running commentary on what is happening.
     * 
     * Now change one of the notifyAll() calls in class DropBox to
     * notify() and run again --see what happens.
     *
     * This illustrates the need to use notifyAll() in such situations.
     */
    public static void main(String[] args) {
        Dropbox db= new Dropbox();
        (new Thread(new Consumer(true, db))).start();
        (new Thread(new Consumer(false, db))).start();
        (new Thread(new Producer(db))).start();
    }
}



