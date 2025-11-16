public class LeapYear {
    public static void main(String[] args){
        int year = 1200;
        if(year%4==0){
            if(year%400 == 0){
                if(year%100==0){
                    System.out.println("Leap Year. ");
                } else {
                    System.out.println("not Leap Year. ");
                }
            } else {
                System.out.println("not Leap Year. ");
            }
        } else {
            System.out.println("not Leap Year. ");
        }
    }
}
