package Recursion;
public class Factorial {
    static int fact(int num){
        if(num==1){
            return 1;
        }
        return num * fact(num-1);
    }
    public static void main(String[] args){
        int num = 5;
        int result = fact(num);
        System.out.println(result);
    }
}
