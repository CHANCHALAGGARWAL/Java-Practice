public class GradingSystem {
    public static void main(String[] args){
        int marks = 80;
        if(marks >= 90 && marks <= 100){
            System.out.println("A");
        } 
        else if(marks >= 80 && marks < 90){
            System.out.println("B");
        }
        else if(marks >= 70 && marks < 80){
            System.out.println("C");
        }
        else if (marks >= 60 && marks < 70) {
            System.out.println("D");
        }
        else if (marks < 60 && marks >= 0) {
            System.out.println("F");
        }
        else {
            System.out.println("Invalid Marks");
        }
    }
}
