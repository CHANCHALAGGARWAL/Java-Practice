

public class SearchandReplace {
    static String searchAndreplace(String str,char search, char replace){
        if(str.length()==0){
            return "";
        }
        char current = str.charAt(0);
        if(current == search){
            return replace + searchAndreplace(str.substring(1),'l','x');
        }
        return current + searchAndreplace(str.substring(1),'l','x');
    }
    public static void main(String[] args){
        String result = searchAndreplace("Hello",'l','x');
        System.out.println(result);
    }
}
