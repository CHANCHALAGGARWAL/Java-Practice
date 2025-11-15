package Basics;
public class Loops {
    public static void main(String[] args){
        int i = 1;
        /* WHILE */
        while(i<=10){
            System.out.println("Chanchal Aggarwal");
            i++;
        }
        /* FOR */
        for(int j = 1; j <= 10; j++){
            System.out.println("CHANCHAL");
        }
        /* DO WHILE */
        int k = 20;
        do{
            System.out.println("AGGARWAL");
            k++;
        } while (k<=10);
        /* ENHANCE FOR */
        int arr[] = {10,20,30,40,50};
        for(int e:arr){
            System.out.println(e);
        }
    }
}
