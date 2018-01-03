public class TestByte {
    
    public static void m(byte b) {
    
    }
    
    public static void mm() {
        m((byte) 0);
        byte b= 0;
        
        
        System.out.println("cast 128 to byte gives " + (byte)(128));
        System.out.println("(Long)(Integer.MAX_VALUE) + 1: " +
                           ((long)Integer.MAX_VALUE) + 1);
        System.out.println("(int)((long)(Integer.MAX_VALUE) + 1) " +
                           (int)((long)(Integer.MAX_VALUE) + 1));
        
        int i= 5_300_000;
        System.out.println(i);
        
        
        int c= 0b0110;
        System.out.println(c);
        
        char x= 99;
        System.out.println("x is " + x);
        
        int y= 'c';
        
        System.out.println("y is " + y);
        
        short sft= 128;
        byte bsht= (byte) sft;
        
        System.out.println("t-c of 128: " + Integer.toBinaryString(128));
        
        System.out.println(Integer.toBinaryString(bsht));
        
        System.out.println(Integer.toBinaryString(bsht));
       
        
        System.out.println("t-c of  127: " + Integer.toBinaryString(127));
        System.out.println("t-c of -127: " + Integer.toBinaryString(-127));
    }
}