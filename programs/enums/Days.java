public class Days {
    /** Constants representing the seasons. */
    public static final int SPRING= 0;
    public static final int SUMMER= 1;
    public static final int FALL= 2;
    public static final int WINTER= 3; 
    
    public static enum Season {SPRING, SUMMER, FALL, WINTER};
    
    
    /**  … season is either 0, 1, 2, or 3 for spring, summer, fall, or winter.*/ 
    public static void m(Season s) {
        if (s == Season.WINTER) System.out.println("it IS " + s);
        
        Season[] v= Season.values();
        
        String res= "";
        for (Season se : Season.values()) {
            res= res + se + " ";
        }
        System.out.println(res);
        
        System.out.println("next");
        Season season= Season.valueOf("SUMMER");
        System.out.println("season is " + season);
        
        System.out.println(Season.values());
    } 
    
}