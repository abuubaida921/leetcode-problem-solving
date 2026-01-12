public class Main {
    public static void main(String[] args) {
        int[] myArray = {1,3,5,6};
        int target = 5;

        Solution solution = new Solution();
        int k = solution.searchInsert(myArray,target);

        System.out.println("" + k);
        System.out.print("Final Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        int postion = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < target){
                postion = i + 1;
            }
        }
        return postion;
    }
}
