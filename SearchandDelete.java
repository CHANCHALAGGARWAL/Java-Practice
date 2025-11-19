

public class SearchandDelete {
    static String searchAnddelete(String str,char search, char replace){
        if(str.length()==0){
            return "";
        }
        char current = str.charAt(0);
        if(current == search){
            return searchAnddelete(str.substring(1),'l','x');
        }
        return current + searchAnddelete(str.substring(1),'l','x');
    }
    public static void main(String[] args){
        String result = searchAnddelete("Hello",'l','x');
        System.out.println(result);
    }
}
