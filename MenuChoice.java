
import java.util.Scanner;
public class MenuChoice {
    public static void main(String[] args){
        System.out.println( "Type Burger");
        System.out.println( "Type Pizza");
        System.out.println( "Type IceCream");
        System.out.println( "Type Drinks");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice:");
        String choice = scanner.next();
        int bill = switch (choice) {
            case "Burger" -> {
                int toppings = 50;
                int burgerCost = 300;
                int total = toppings + burgerCost;
                yield total;
            }
            case "Pizza" -> 200;
            case "IceCream" , "Drinks" -> 60;
            default -> 0;
        };
        System.out.println("Bill is : " + bill);
        scanner.close();
    }
}
