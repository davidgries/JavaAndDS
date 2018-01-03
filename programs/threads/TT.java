public class TT {
    public static Counter c= new Counter();
    public static void main(String... args) {
        //T1 t1= new T1();
        //T2 t2= new T2();
        //t1.start();
        //t2.start();
    }
}

class Counter {
    int c= 0;
    public void incr() {
        c= c + 1;
        String s= Thread.currentThread().getName();
        System.out.println(s + " increments c: " + c);
    }
}

//class T1 extends Thread {
//    @Override public void run() {
//        setName("T1");
//        synchronized(TT.c) {
//            TT.c.incr();
//            for (long i= 0; i < 1000000000L; i= i+1) i= i;
//            TT.c.incr();
//        }
//    }
//}

//class T2 extends Thread {
//    @Override public void run() {
//        setName("T2");
//        synchronized(TT.c) {
//            TT.c.incr();
//            TT.c.incr();
//        }
//    }
//}

//class T2 extends Thread {
//    @Override public void run() {
//        setName("T2");
//        TT.c.incr();
//        TT.c.incr();
//    }
//}