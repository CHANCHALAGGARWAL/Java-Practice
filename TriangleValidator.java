import java.util.*;
public class TriangleValidator{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Side a: " + a);
        System.out.println("Side b: " + b);
        System.out.println("Side c: " + c);
        if(a + b > c){
            if(b + c > a){
                if(c + a > b){
                    System.out.println("Valid Triangle.");
                } else {
            System.out.println("Invalid Triangle.");
                }
            } else {
            System.out.println("Invalid Triangle.");
            }
        } else {
            System.out.println("Invalid Triangle.");
        }
    }
}