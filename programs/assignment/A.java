public class A {
    
    public static void m() {
        byte x= 0;
        x += 256;
        System.out.println("x = " + x);
        
        
        int k= 1;
        k += Integer.MAX_VALUE;
        System.out.println("k = " + k);
        
        char c= 'a';
        c += 1;
        System.out.println("c = " + c);
        
        int[]d= {2, 3};
        k= 0;
        d[k++]= d[k++] + 1;
        System.out.println("k = " + k);
        
        
        k= 0;
        d[k++] += 1;
        System.out.println("k = " + k);
        
        while (true && true && -3 < 5) ;
        return;
    }
}