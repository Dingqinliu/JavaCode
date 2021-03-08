package Homework;

//给定一个整数数组，判断是否存在重复元素。
// 如果任何值在数组中出现至少两次，函数返回 true。
// 如果数组中每个元素都不相同，则返回 false。

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] num1={1,2,3,1};
        int[] num2={1,2,3,4};
        int[] num3={1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(num1));
        System.out.println(containsDuplicate(num2));
        System.out.println(containsDuplicate(num3));
    }

    private static boolean containsDuplicate(int[] nums) {
        //实现1
//        for (int i=0;i<nums.length;i++){
//            for (int j=nums.length-1;j>=i+1;j--){
//                if (i!=j && nums[i]==nums[j]){
//                    return true;
//                }
//            }
//        }
//        return false;
        //实现2
//        Set<Integer> r = new HashSet<>();
//        for(int i:nums)
//            r.add(i);
//        return r.size()<nums.length?true:false;//Set自带去重，如果去重后的长度小于原长度，则返回true

        //实现3
        return Arrays.stream(nums).distinct().count() != nums.length;
   }

}
