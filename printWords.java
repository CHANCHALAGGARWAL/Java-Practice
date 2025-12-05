public class printWords {
    static String words[] = {"zero", "one", "two", "three", "four", "five", "six", "sev‌​en", "eight", "nine"};
    public static void printWords(int n){
        if(n == 0){
            return;
        }
        printWords(n / 10);
        int digit = n % 10;
        System.out.print(words[digit] + " " );
    }
        public static void main(String[] args) {
        int n = 2019;
        printWords(n);
    }
}
