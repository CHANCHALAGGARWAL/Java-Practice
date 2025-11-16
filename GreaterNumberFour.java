
public class GreaterNumberFour {
    public static void main(String[] args){
        int a = 5;
        int b = 4;
        int c = 9;
        int d = 2;
        if(a>b){
            if(a>c){
                if(a>d){
                    System.out.println("a is greater among a,b,c,d ");
                } else {
                    System.out.println("d is greater among a,b,c,d");
                }                
            } else {
                if(c>d){
                    System.out.println("c is greater among a,b,c,d");
                } else {
                    System.out.println("d is greater among a,b,c,d");
                }
            }
        } else {
            if(b>c){
                if(b>d){
                    System.out.println("b is greater among a,b,c,d");
                } else {
                    System.out.println("d is greater among a,b,c,d");
                }
            } else {
                if (c>d){
                    System.out.println("c is greater among a,b,c,d");
                } else {
                    System.out.println("d is greater among a,b,c,d");
                }
            }
        }
    }
}
