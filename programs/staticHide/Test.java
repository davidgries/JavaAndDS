public class Test {
    public static void main(String args[]) {
        C c= new C();
        C.m();
        c.m();
        
        C s = new S();
        S.m();
        s.m();
    }
}

class C {
    public static void m() {
        System.out.println("C.m called");
    }
}

class S extends C {
    public static void m() {
        System.out.println("S.m called");
    }
}
