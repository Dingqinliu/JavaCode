public class Solution1 {
    //给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引
    // 如果目标值不存在于数组中，返回它将会被按顺序插入的位置
    // 假设数组中无重复元素
    public int searchInsert(int[] nums,int target){
        for (int i=0;i<nums.length;i++){
            if (nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] array={1,3,5,7,9};
        int target=2;
        Solution1 a=new Solution1();
        int i=a.searchInsert(array, target);
        System.out.println(i);
    }
}
