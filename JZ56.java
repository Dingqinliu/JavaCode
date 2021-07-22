//数组中数字出现的次数
//在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。
//请找出那个只出现一次的数字
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int singleNumber(int[] nums){
        //1、用map
//        Map<Integer,Integer> map=new HashMap<>();
//        //先把数字存储到map中
//        // 其中key存储的是当前元素
//        // value是数字出现的次数
//        for (int num:nums){
//            int value=map.getOrDefault(nums,0)+1;
//            map.put(num,value);
//
//        }
//        //遍历map中的所有元素，返回value值等于1的。
//        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
//            if (entry.getValue() == 1)
//                return entry.getKey();
//        }
//        return -1;


    }
}