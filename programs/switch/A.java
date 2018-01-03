public class A {
    
    /** print "Excellent" if g is 'A', "OK" if g is 'B'or 'C',
      * "Passing" if g is "D", "Fail" if g is "F", "Invalid" if g is anything else */
    public static void m(char grade) {
        /* print "Excellent" if g is 'A', "OK" if g is 'B'or 'C',
         * "Passing" if g is "D", "Fail" if g is "F". */
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
            case 'C':
                System.out.println("OK");
                break;
            case 'D':
                System.out.println("Fail");
                break;
        }
    }
    
    /** Print the college years following year y */
    public static void futures(String y) {
        // Print the college years following year y
        switch (y) {
            case "freshman":
                System.out.println("sophomore");
            case "sophomore":
                System.out.println("junior");
            case "junior":
                System.out.println("senior");
            case "senior":
        }
        
    }
    
    /** Return the number of days in month m in year y. */
    public static int daysInMonth(int m, int y) {
        int numDays= 0;
        switch (m) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays= 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays= 30;
                break;
            case 2:
                if (((y % 4 == 0) && !(y % 100 == 0)) ||
                    (y % 400 == 0))
                numDays= 29;
                else
                    numDays= 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        return numDays;
    }
    
    /** return the college year year: 1 is freshman, etec.
      * return the empty string if year is not in 1..4. */
    public static String getCollegeYear(int year) {
        // Store college-year year as a String in y.
        // if y is not in 1..4, store the empty string in y
        String y;
        switch (year) {
            case 1:
                y= "freshman";
                break;
            case 2:
                y= "sophmore";
                break;
            case 3: 
                y= "junior";
                break;
            case 4: 
                y= "freshman";
                break;
                
            default: y= "";
        }
        return y;
    }
}