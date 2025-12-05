public class findOccur {
    public static int findOccur(int arr[],int key,int index){
        if(index == arr.length){
            return index;
        }
        if(arr[index] == key){
            System.out.print(index + " ");
        }
        return findOccur(arr,key,index + 1);
    }
    public static void main(String[] args){
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        int index = findOccur(arr,key,0);
    }
}
