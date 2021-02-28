import java.util.Arrays;

public class removeElement {
    //原地移除数组中值为val的元素，返回数组的长度
    public int remove(int[] nums,int val){
        int temp=nums.length;
        if (nums==null||nums.length==0){
            return 0;
        }
        int j=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=val){
                nums[j++]=nums[i];
            }
            else {
                temp--;
            }
        }
        for (int i=0;i<temp;i++){
            System.out.println(nums[i]);
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] array={1,2,3,2,4,5,2};
        int val=2;
        removeElement r=new removeElement();
        int rs = r.remove(array, 2);
    }
}
