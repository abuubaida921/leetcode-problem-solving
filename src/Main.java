public class Main {
    public static void main(String[] args) {
        int[] myArray = {0,0,1,1,1,2,2,3,3,4};

        Solution solution = new Solution();
        int k = solution.removeDuplicates(myArray);

        System.out.println("Unique count: " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int uniqueIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }
        return uniqueIndex;
    }
}
