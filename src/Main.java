public class Main {
    public static void main(String[] args) {
        int[] myArray = {0,1,2,2,3,0,4,2};
        int val = 2;

        Solution solution = new Solution();
        int k = solution.removeElement(myArray,val);

        System.out.println("" + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int i =0;
        int n = nums.length;
        while(i<n){
            if(nums[i] == val){
                nums[i]=nums[n-1];
                n--;
            }else{
                i++;
            }
        }
        return n;
    }
}
