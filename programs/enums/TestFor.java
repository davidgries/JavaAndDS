import java.util.*;

public class TestFor {
    static int  five= 5;
    
    public static void m() {
        for (System.out.println(5); five > 6; ) 
            System.out.println(6);
        
        int k= 0;
        //for (; ; k= k+1) System.out.println(k);
        
        k= 0;
        do {System.out.println(k); k= k+1;} while (k < 10) ;
        
        ArrayList<Integer> s= new ArrayList<Integer>();
        
        for (Integer v : s) {
            k= v;
        }
    }
    
    
    
    public static int sum(int... numbers) {
        int sum= 0;
        
        numbers[0]= 5;
        System.out.println(numbers.length);
        
        for (int k= 0; k < numbers.length; k= k+1) sum= sum + numbers[k];
        
        for (int n: numbers) sum= sum + n;
        return sum;
        
    }
    
    public static void main(String... args) {
        System.out.println("Got here");
        
        System.out.println(sum (5, 2, 2, 2));
        
        
        System.out.println(sum(new int[]{5, 2, 2, 2}));
    }
    
    /** return the value of sum plus all the numbers in nums. */ 
    public static int addTo(int sum, int... nums) {       
        for (int k= 0; k < nums.length; k= k+1) sum= sum + nums[k];
        System.out.println("sugared addTo");
        return sum;  
        } 
    
   /** return the value of sum + num1. */ 
    public static int addTo(int sum, int num1) {       
        System.out.println("1-array");
        return sum + num1;  
        }
    
    /** return the value of sum + num1 + num2. */ 
    public static int addTo(int sum, int num1, int num2) {       
        System.out.println("2-array addTo");
        return sum + num1 + num2;  
        }
}