public class T extends Thread {
    public static void main(String args[]) {
        (new T()).start();
        for (int i= 0; i < 20; i= i+1) {
            System.out.println("main thread, i = " + i);
        }
        for (int i= 0; i < 500; i= i+1) new T();
    }
    
    public @Override void run() {
        for (int k= 0; k < 20; k= k+1) {
            System.out.println("new thread, k = " + k);
        }
    } 
}