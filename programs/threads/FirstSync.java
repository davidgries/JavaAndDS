public class FirstSync {
    public static X var= new X();
    public static void main(String[] arg) {
        new T1().start();
        new T2().start();
    }  
}

class X {
    public int x= 0;
}

class T1 extends Thread {
    @Override public void run() {
        synchronized(FirstSync.var) {
            FirstSync.var.x= FirstSync.var.x + 1;
        }    
        
    }
}

class T2 extends Thread {
    @Override public void run() {
        synchronized(FirstSync.var) {
            FirstSync.var.x= 2*FirstSync.var.x + 1;
        }
        
    }
}