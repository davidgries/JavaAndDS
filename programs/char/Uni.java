public class Uni {
   
    public static void main(String[] arg) {
        String s= "السلام عليكم";
        System.out.println(s);
        char[] ca= s.toCharArray();
        for (char c : ca)
            System.out.println("char is: " + (int)c);
        
        // Store in res the unicode rep of chars in ca
        String res= "";
        for (char c : ca) {
            if (c == 32) res= res + ' ';
            else {
                String hex= Integer.toHexString(c);
                while (hex.length() < 4) hex= "0" + hex;
                res= res + "\\u" + hex;
            }  
        }
        
        System.out.println(res);
        System.out.println("\u0627\u0644\u0633\u0644\u0627\u0645 \u0639\u0644\u064a\u0643\u0645");
    }
}