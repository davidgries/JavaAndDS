public class DdLck {
    public static Integer a= 3;
    public static Integer b= 4;
    public static void main(String[] args) {
        (new P1()).start();
        (new P2()).start();
    }
}

class P1 extends Thread {
    public void run() {
        synchronized (DdLck.a) {
            System.out.println("P1 has a");
            synchronized (DdLck.b) {
            }
        }
        System.out.println("P1 fnished");
    }
}

class P2 extends Thread {
    public void run() {
        
        synchronized (DdLck.b) {
            System.out.println("P2 has b");
            synchronized (DdLck.a) {
            }
        }
        System.out.println("P2 fnished");
    }
}