public class TestF{
    public static void main(String args[]) {
        T t= new T();
        S s= t;
        C c= s;
        System.out.println("t.f is " + t.f);
        System.out.println("s.f is " + s.f);
        System.out.println("c.f is " + c.f);
    }
}

class C {
    public int f= 1;
}

class S extends C {
}

class T extends S {
    public int f= 2;
}