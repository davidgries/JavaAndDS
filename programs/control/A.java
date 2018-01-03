public class A {
    
    public static void m(int n) {
        // Print whether n is non-negative or negative and add 1 to it if it is non-negative.
        if (n >= 0) {     
            System.out.println("n is non-negative");
        }
        else {
            System.out.println("n is negative");
            n= n+1;
        }
        
        int x= 5;
        int y= 6;
        // if < < y, swap x and y
        if (x < y) {
            int t= x;
            x= y;
            y= t;
        }
    }
    
    public static void p() {
        for (int k= 0; k < 5; k= k+1) {
            if (k == 2 || k == 4) continue;
            System.out.println(k);
        }
    }
    
    public static void q() {
        for (int k= 0; k < 5; k= k+1) {      
            int j= 0;      
            while (j < 3) {          
                if (k == 2 || k == 4) continue;          
                j= j+1;             
            }             
            System.out.println(k);         } 
    }
    
    public static void z(int n) {
        int x= 0;
        d1: x= 5;
        loop2: for (int k= 0; k < n; k= k+1) 
            System.out.println(k);
    }
    
     
}