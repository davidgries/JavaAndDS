public final class Coin1 /*extends Enum<Coin1>*/ {
    public static final Coin1 PENNY= new Coin1(1);
    public static final Coin1 NICKEL= new Coin1(5);
    
    private int value;
    
    /** Constructor: instance with value v. */
    public Coin1(int v) {value= v;} 
    
    /** Return the array {Penny, NICKEL} */
    public static Coin1[] values() {return null;}
    
    /** Return either PENNY or NICKEL, depending
      * on whether n is "PENNY" or "NICKEL". Throw an
      * IllegalArgumentException if n is anything else */
    public static Coin1 valueOf(String n) {return null;}
}
