package Basics;
public class DataTypes {
    public static void main(String args[]){
        int num = 49;
        float roi = 9.5F;
        boolean att = true;
        char c = 'A';
        System.out.println(num);
        System.out.println(roi);
        System.out.println(c);
        System.out.println(att);
        int x = 10;
        int y = x;
        System.out.println( x + 20);
        System.out.println(x);
        //x = x + 20;
        y++;
        System.out.println(y);
        System.out.println(x);
        String name = "Chanchal";
        System.out.println(name);
        String name2 = name;
        System.out.println(name2);
        StringBuffer sb = new StringBuffer("Anchal ");
        StringBuffer sb2 = sb;
        sb2.append("Aggarwal");
        System.out.println(sb);
        System.out.println(sb2);
    }
}
