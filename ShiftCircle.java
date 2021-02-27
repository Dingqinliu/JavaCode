import java.util.Arrays;

public class ShiftCircle {
    //数组元素右移K
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
                   //0 1 2 3 4 5 6
        int k=3;
        Shift(array,k);
    }

    private static void Shift(int[] nums, int k) {
        int length=nums.length;//7
        int[] temp=new int[length];
        //首先处理 使k<length
        // 然后i+k<length 令nums[i+k]=nums[i]
        //但这改变了原有的nums[i+k]位置的元素值
        //所以需要一个中间数组
        // i+k>=length i+k-length  1->0 2->1 3->2 4->3
        // k>length k=k%length
            k=k%length;
            for (int i=0;i<length;i++){
                if (k+i<length){
                    temp[i+k]=nums[i];
                }
                if(i+k>=length){
                   temp[i+k-length]=nums[i];
                }
            }
            //把temp赋给nums
        nums = Arrays.copyOf(temp, length);
        System.out.println(Arrays.toString(nums));
    }
}
