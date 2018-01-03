
import java.util.ArrayList;
import java.math.BigInteger;
import java.util.List;
import java.util.Iterator;

import java.util.Arrays;

/** An instance contains an ordered pair. */
public class Pair<E, F> {
    public E first;  // First element of the pair
    public F second; // Second element of the pair
    
    /** Constructor: a null pair */
    public Pair() {}
    
    /** Constructor: a pair e, f */
    public Pair(E e, F f) {
        first= e;
        second= f;
    }
    
    /** return a representation of this pair. */
    public @Override String toString() {
        return "(" + first + ", " + second + ")";
    }
    
    public static void main(String... args) {
        Pair<Integer, String> p1= new Pair<>(5, "eeeee");
        
        Pair<Integer, Pair<String, Boolean>> p2= new Pair<>();
        p2.first= 5;
        p2.second= new Pair<>("a", true);
        System.out.println(p2);
        
        System.out.println("twoOf: " + twoOf(5));
        System.out.println("twoOf: " + twoOf(new Pair<>("this is not 6", 6)));
        
        System.out.println((new Pair<>(5, 3)).equals(new Pair<>(4, 3)));
        
        System.out.println(equals(new Pair<>(5, 3), new Pair<>(5, 3)));
        
        System.out.println(count(5, new Integer[]{5, 3, 5, 2}));
        
        
        System.out.println(count("b", new String[]{"bc", "b", "b", "b"}));
        
        System.out.println("\n\nwildcard stuff");
        ArrayList<Integer> c= new ArrayList<>();
        c.add(3); c.add(4);
        print(c);
        ArrayList<String> d= new ArrayList<>();
        d.add("ab"); d.add("cd");
        print(d);
        
        Pair<Integer, String> p3= new Pair<>(3, "abc");
        print(p3);
        
        System.out.println("\nDoing sum of Numbers.");
        ArrayList<Integer> x= new ArrayList<>();
        x.add(3); x.add(4);
        System.out.println("sum: " + sum(x));
        
        ArrayList<BigInteger> bi= new ArrayList<>();
        bi.add(new BigInteger("5"));
        bi.add(new BigInteger("6"));
        System.out.println("sum: " + sum(bi));
        
        System.out.println("\nTest max.");
        System.out.println("max of 1, 2, 3: " + max(1, 2, 3));
        System.out.println("max of 4, 2, 3: " + max(4, 2, 3));
        System.out.println("max of 1, 5, 3: " + max(1, 5, 3));
        System.out.println("max: " + max("abc", "c", "bdd"));
        
        
//        System.out.println("\nadd to ArrayList.");
//        ArrayList<Integer> al= new ArrayList<>();
//        Integer[] ia= {1, 5, 6, 4};
//        add(ia, al);
//        System.out.println(al);
        
        System.out.println("\ngeneric add to ArrayList.");
        ArrayList<Number> al= new ArrayList<>();
        Integer[] ia= {1, 5, 6, 4};
        add(ia, al);
        System.out.println(al);
        
        System.out.println("\ncopy ArrayList.");
        ArrayList<Integer> x1= new ArrayList<>();
        Integer[] xa= {1, 5, 6, 4};
        add(xa, x1);
        ArrayList<Object> x2= new ArrayList<>();
        copy(x1, x2);
        System.out.println(x2);
        System.out.println(max(x1));
        
        ArrayList<Student> as= new ArrayList<>();
        as.add(new Student());
        as.add(new Student());
        max(as);
        //max1(as);
        
    }
    
    /** Return true iff the fields of this equal the fields of p. */
    public boolean equals(Pair<E, F> p) {
        return first.equals(p.first)  &&  second.equals(p.second);
    }
    
    /** Return true iff the fields of p1 equal the fields of p2. */
    public static <E, F> boolean equals(Pair<E, F> p1,  Pair<E, F> p2) {
        return p1.first.equals(p2.first)  &&  p1.second.equals(p2.second);
    }
    
    /** Return a pair (v, v). */
    public static <T> Pair<T, T> twoOf(T v) {
        return new Pair<>(v, v);
    }
    
    /** Return true iff the two elements of p are equal. */
    public static <T> boolean equalElems(Pair<T, T> p) {
        return p.first.equals(p.second);
    }
    
    /** Return the number of times item occurs in b.
      * Precondition: item is not null. */ 
    public static <T> int count(T item, T[] b) {
        int n= 0;
        for (T e : b) {
            if (item.equals(e)) n= n+1;
        }
        return n;  
    }
    
    /** Return elements of b, separated by “, “ and delimited by { and }. */
    public static String toString(ArrayList<Object> b) {
        String res= "{"; 
        for (Object e : b) {         
            res= res + e;   
        }     
        return res + "}";   
    } 
    
    /** Wild card in return type. */
    public static Pair<?, ?> pp() {
        return null;
    }
    
    /** Print elements of b. */
//    public static void print(ArrayList<Object> b) {
//        for (Object e : b)
//            System.out.println(e);
//    }
    
    /** Print elements of b. */
    public static void print(ArrayList<?> b) {
        for (Object e : b)
            System.out.println(e);
        b.add(null);
    }
    
    /** Print p. */
    public static void print(Pair<?, ?> p) {
        System.out.println(p);
    }
    
    public static void m1(ArrayList<? extends Number> p) {
        Number x= p.get(5);
        // p.add(new Integer(5));
    }
    
    public static void m2(ArrayList<? super Integer> p) {
        p.add(5);
        // Integer x= p.get(5);
    }
    
    /** Return the sum of b as a double */
    public static double sum(List<? extends Number> b) {
        double s = 0.0;
        for (Number n : b)
            s= s + n.doubleValue();
        return s;
    }
    
    /** Return the maximum of x, y, and z. */
    public static <T extends Comparable<T>> T max(T x, T y, T z) {
        if (y.compareTo(x) > 0) x= y;
        // x is largest of original x, y      
        if (z.compareTo(x) > 0)
            return z;                 
        return x;  
    }
    
    /** Copy src to dest. */
    public static <T> void copy(ArrayList<? extends T> src, ArrayList<? super T> dest) {
        dest.clear();
        for (T e : src) dest.add(e); 
    }
    
    /** Put largest field first. */
    public static <T extends Comparable<T>> void order(Pair<T, T> p) {
        if (p.second.compareTo(p.first) > 0) {
            T t= p.second;
            p.second= p.first;
            p.first= t;
        }
    }
    
    /** Add elements of b to c*/
//    public static void add(int[] b, ArrayList<? super Integer> c) {
//        for (int e : b) {
//            c.add(e);
//        }
//    }
    
    /** Add elements of b to c*/
    public static <T> void add(T[] b, ArrayList<? super T> c) {
        for (T e : b) {
            c.add(e);
        }
    }
    
    /** Return the largest element in b.
      * Precondition: b contains at least one element. */
    public static <T extends Comparable<? super T>> T max(ArrayList<T> b) { 
        Iterator<T> it= b.iterator(); 
        T w= it.next(); 
        while (it.hasNext()) { 
            T e = it.next(); 
            if (e.compareTo(w) > 0) w= e; 
        } 
        return w; 
    } 
    
    /** Return the largest element in b.
      * Precondition: b contains at least one element. */
    public static <T extends Comparable<T>> T max1(ArrayList<T> b) { 
        Iterator<T> it= b.iterator(); 
        T w= it.next(); 
        while (it.hasNext()) { 
            T e = it.next(); 
            if (e.compareTo(w) > 0) w= e; 
        } 
        return w; 
    } 
    
    public static <T> T[] createArray(int n) {
        T[] a= new T[2];
        return (T[]) Arrays.copyOf(a, n);
    }
    
    public static void testCA() {
        Integer[] a= createArray(5);
    }
    
    public void mmm() {
        ArrayList<Integer>[] al= new ArrayList[2];  // compile-time error
    }
    
    public <T extends C & I1 & I2> void  m5(T p) {}
    
    public <T extends C, I1, I2> void  m6(T p, I1 q) {}
    
    public <T> void  m7(ArrayList<? extends C> p) {}
    
    public static <T extends Comparable<T> & Iterator<T>> void m(T p) {}
    
//    public static <T extends Exception> void execute() {
//        try {
//        } catch (T e) { 
//        }
//    }
    
    /** Create a new E and append it to b. */
    public static <E> void append(ArrayList<E> b) {
        //E e= new E();  // compile-time error
        //b.add(e);
    }
    
}
class X extends Throwable {}

class D<T extends C & I2 & I1> {}

//class CC<T>  extends Exception {}

