package Questions;
public class GreaterNumberThree {
    public static void main(String[] args){
        int a = 21;
        int b = 19;
        int c = 27;
        if (a>b){
            if(a>c){
                System.out.println(a + " a is greater");
            }
            else {
                System.out.println(c + " c is greater");
            }
        } else {
            if(b>c){
                System.out.println(b + " b is greater");
            }
            else {
                System.out.println(c + " c is greater");
            }
        }
    }
}
