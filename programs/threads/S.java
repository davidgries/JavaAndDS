public class S {
    public static Str c= new Str();
    public static void main(String... args) {
        Ta ta= new Ta(); T1 t1= new T1(); 
        ta.start();      t1.start();
    }
}

class Str {
    String s= "";
    public void put(char c) {
        s= s + c;
        String n= Thread.currentThread().getName();
        System.out.println(n + ". s is: " + s);
    }
}

class Ta extends Thread {
    @Override public void run() {
        setName("Ta");
        synchronized(S.c) {
            S.c.put('a');
            try {sleep(100);}
            catch (InterruptedException e) {S.c.put('?');}
            S.c.put('b');
        }
    }
}

class T1 extends Thread {
    @Override public void run() {
        setName("T1");
            S.c.put('1');
            S.c.put('2');
    }
}

//class T1 extends Thread {
//    @Override public void run() {
//        setName("T1");
//        S.c.put('1');
//        S.c.put('2');
//    }
//}