package Recursion;
public class Triplet {
    static boolean increasingTriplet(int nums[]){
        int num_1, num_2;
        num_1 = num_2 = Integer.MAX_VALUE;
        for(int num : nums){
            if(num <= num_1){
                num_1 = num;
            }
            else if(num <= num_2){
                num_2 = num;
            }
            else{
            return true;
        }
    }
        return false;
}
    public static void main(String[] args){
        int num[] = {1,2,3,4,5};
        System.out.println(increasingTriplet(num));
    }
}
