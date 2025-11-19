import java.util.*;
public class AbsoluteDifference {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int AbsoluteDifference = Math.abs(x - y);
        if(AbsoluteDifference>10){
            System.out.println("Large Difference");
        } else{
            System.out.println("Small Difference");
        }
        sc.close();
    }
}
