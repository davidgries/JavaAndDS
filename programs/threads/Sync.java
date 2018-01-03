public class Sync {
    public static X var= new X();
    public static void main(String[] arg) {
        new T1().start();
        new T2().start();
    }  
}

class X {
    private int x= 0;
    
    /** Return the shared variable's value */
    public int getX() {return x;}
    
    /** Increment x. */
    public void incr() { 
        synchronized(this) {x= x + 1;}
    }
    
    /** Double x. */
    public synchronized void doubble() {
        x= 2*x;
    }
}

class T1 extends Thread {
    @Override public void run() {
        FirstSync.var.incr();
    }
}

class T2 extends Thread {
    @Override public void run() {
        FirstSync.var.doubble();
        
    }
}