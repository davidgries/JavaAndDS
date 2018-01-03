public class Test {
    public static void main(String args[]) {
        SubC p = new SubC();
        p.m1();
        p.m2();
    }
}

class C {
    public int f= 1;
    
    public void m1() {
        System.out.println("in m1. f is " + f);
    }
}

class SubC extends C {
    public int f= 2;
    
    void m2() {
        System.out.println("in m2. f is " + f);
        System.out.println("in m2. f in the superclass is " + super.f);
    }
}

