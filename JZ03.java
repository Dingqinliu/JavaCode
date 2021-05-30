import java.util.HashSet;
import java.util.Set;

//在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数
// 组中某些数字是重复的，但不知道有几个数字重复了，
// 也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
public class JZ03 {
    public int findRepeatNum(int[] nums){
        int res=-1;
        for(int i=0;i<nums.length;i++){ // 1、暴力解法
            for (int j=nums.length-1;j>i;j--){
                if((nums[i]^nums[j])==0){
                    res=nums[i];
                    break;
                }
            }
        }
        return res;

//                Set<Integer> set = new HashSet<Integer>(); //利用集合 添加元素 重复元素不会被添加成功
//                int repeat = -1;
//                for (int num : nums) {
//                    if (!set.add(num)) {
//                        repeat = num;
//                        break;
//                    }
//                }
//                return repeat;
    }
}
