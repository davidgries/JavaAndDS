import java.util.ArrayList;
public class Raw {
    
    public static void m1() {
        ArrayList b= new ArrayList();
        //b.add("abc");
        String s= (String) b.get(0); 
    }
    
    public static void m2() {
        ArrayList<String> b= new ArrayList<>();
        
        b.add("abc");
        String s= b.get(0); 
    }
    
    public static void m3() {
        ArrayList b;
        b= new ArrayList<String>();
        b= new ArrayList();
        //b.add("abc");  // unchecked warning
        Integer s= (Integer) b.get(0);
        //ArrayList<String> c= new ArrayList();
        
    }
    
    public static void m4() {
        ArrayList c= new ArrayList();
        //c.add(2); // unchecked call
        // ArrayList<String> b= c; // unchecked conversion
        //b.add("abc");  
        
    }
}


class W<E> {
    public E f;
    public void set(E arg) {f= arg;}
}

class M {  
    public void test(W<M> w) { 
        w.set(new M());  // unchecked warning
        w.f= new M();    // unch
    }
} 
