public class Wrapper2<E> {     
    private E object;     
    public void set(E ob) {         
        object= ob;     
    }     
    public E get() {         
        return object;     
    } 
    
    
    public static void main(String[] args) {
        Wrapper2 x= new Wrapper2();
        System.out.println(x.get());
        
        Wrapper2<String> s= new Wrapper2<String>();
        Wrapper2<Integer> h= new Wrapper2<Integer>();
    }
} 