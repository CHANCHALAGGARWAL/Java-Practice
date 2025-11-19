import java.util.*;
public class PasswordValidator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();
        boolean hasDigit = false;
        boolean hasUpper = false;
        if(pass.length()<8){
            System.out.println("INVALID PASSWORD");
            return;
        }
        for(int i = 0; i < pass.length(); i++){
            char ch = pass.charAt(i);
            if(Character.isUpperCase(ch)){
                hasUpper = true;
            }
            if(Character.isDigit(ch)){
                hasDigit = true;
            }
        }
        if(hasUpper && hasDigit){
            System.out.println("VALID PASSWORD");
        } else {
            System.out.println("INVALID PASSWORD");
        }
        
    }
}
