/** An enumeration of coins, giving their names and values. */
 public enum Coin {PENNY(1), NICKEL(5), DIME(10), QUARTER(25);
    private int value; // the value of the coin
    
    /** Constructor: an object with value v. */
    Coin(int v) {value= v;}
    
    private static enum CoinColor {COPPER, NICKEL, SILVER}
    
    /** Return the color of coin c. */
    private static CoinColor color(Coin c) {
        switch(c) {
            case PENNY: return CoinColor.COPPER;
            case NICKEL: return CoinColor.NICKEL;
            case DIME:  return CoinColor.SILVER;
            case QUARTER: return CoinColor.SILVER;
            default: return null;
        }
    }
    
    /** Return a representation of this coin, giving name in lower case,
      * value, and color. */
    public @Override String toString() {
        return super.toString().toLowerCase() +
            ": " + color(this) + ", worth " + value + " cents";
    }
}