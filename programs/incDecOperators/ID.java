public class ID {
    
    public static void m() {
        int[] b= new int[]{2, 3, 4};
        
        for (int k= 0; k < b.length; k++);
        
        Integer IK= 0;
        
        b[IK++]= 5;
        System.out.println("IK is " + IK);
        
        //char c= 'a'; c++;
        //System.out.println("c is " + c);
        
        int k= 0;
        
        float f= 0; f++; 
        
        for (int i= b.length-1; i >= 0; i--) System.out.println(b[i]);
        
        System.out.println("Here come letters");
        for (char c= 'a'; c <= 'z'; c++)
            System.out.println(c);
        
        Byte b1= 127; System.out.println(++b1); 
        System.out.println("xyz");
    }
    
    public static void p() {
        int k= 5;
         int h= 6;
        while (true  &&  h < Integer.MAX_VALUE) { k= k+1; }
        return;
    }
    
    public static void q() {
        final String s1= "xy";
        final String s2= "x" + "y";
        System.out.println(s1 == s2);
        
        System.out.println("xy" == "x" + "y");
    }
    
}