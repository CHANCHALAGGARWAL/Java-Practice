public class strLength {
    public static int strLength(int count, int index, String str){
        if(index == str.length()){
            return count;
        }
        return strLength(count + 1, index + 1, str);
    }
    public static void main(String[] args){
        String str = "HelloWorld";
        int length = strLength(0,0,str);
        System.out.println("Length of the string: " + length);
    }
}
