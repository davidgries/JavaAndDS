public class Wrapper<E> {     
    private E object;     
    public void set(E ob) {         
        object= ob;     
    }     
    public E get() {         
        return object;     
    } 
    
    
    public static void main(String[] args) {
        Wrapper x= new Wrapper();
        System.out.println(x.get());
        
        Wrapper<String> s= new Wrapper<String>();
        Wrapper<Integer> h= new Wrapper<Integer>();
        String s1= s.get();
     
        Wrapper<String> s2;
            s2= new Wrapper<>();
            System.out.println(new Wrapper<>());
    }
} 