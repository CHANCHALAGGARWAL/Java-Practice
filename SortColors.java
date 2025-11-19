public class SortColors {
    public static void main (String[] args){
        int c,l,h;
        int nums[] = {2,1,0,1,2,0};
        int temp;
        c = l = 0;
        h = nums.length - 1;
        while(c<=h){
            if(nums[c] == 0){
                temp = nums[c];
                nums[c] = nums[l];
                nums[l] = temp;
                l++;
                c++;
            }
            else if(nums[c]==1){
                c++;
            }
            else if(nums[c] == 2){
                temp = nums[c];
                nums[c] = nums[h];
                nums[h] = temp;
                h--;
            }
        } 
        for(int x : nums){
            System.out.print(x + " ");
    }
}
