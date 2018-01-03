public class C {
    int y;
    HAP b= new HAP();
    
    public C(int y) {
        this.y= y;
        b.use(new Inner());
    }
    
    public class Inner implements In {
        public void m(int x) {y= x;}
    }  
}