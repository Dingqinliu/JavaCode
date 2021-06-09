//旋转数组的最小数字
public class JZ11 {
     public int minArray(int[] numbers){ //第一种憨憨做法 遍历数组找出最小
//        int res=numbers[0];
//        for(int i=1;i<numbers.length;i++){
//            if (numbers[i]<=res){
//                res=numbers[i];
//            }
//        }
//        return res;

//        for (int i=0;i<numbers.length-1;i++){ //暴力之 根据旋转数组的性质找到当前元素大于下一元素的 下一元素
//            if (numbers[i]>numbers[i+1]){
//                return numbers[i+1];
//            }
//        }
//        return numbers[0];
//
        int length=numbers.length;  //二分法 一般情况 O(logN) 特殊情况 一直重复 O(N)
        int left=0;
        int right=length-1;

        if (right==0){
            return numbers[0];
        }

        while (left<right){
            int mid=left+(right-left)/2;
            if (numbers[mid]>numbers[right]){
                left=mid+1;
            }else if(numbers[mid]<numbers[right]){
                right=mid;
            }else{
                right--;
            }
        }
        return numbers[left];
    }
}
