//调整数组顺序使奇数位于偶数前面
//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
// 使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分

public class JZ21 {
    public int[] exchange(int[] nums){
        //思路一 双指针？ 效率有点低
//        int left=0;
//        int right=nums.length-1;
//        while (left<right) {
//            while (left < right && nums[left] % 2 != 0) {
//                left++;
//            }
//            while (left < right && nums[right] % 2 == 0) {
//                right--;
//            }
//            if (left < right) {
//                int res = nums[left];
//                nums[left] = nums[right];
//                nums[right] = res;
//            }
//        }
        return nums;

        //思路二
    }
}
