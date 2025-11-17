public class Palindrome {

    static String s = "madam";     
    static int n = s.length();     

    static boolean f(int i) {
        if (i >= n / 2) {          
            return true;
        }
        if (s.charAt(i) != s.charAt(n - i - 1)) {  
            return false;
        }
        return f(i + 1);           
    }

    public static void main(String[] args) {
        System.out.println(f(0) ? "Palindrome" : "Not Palindrome");
    }
}
