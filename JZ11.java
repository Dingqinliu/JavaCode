//旋转数组的最小数字
public class JZ11 {
    public int minArray(int[] numbers){ //第一种憨憨做法 遍历数组找出最小
        int res=numbers[0];
        for(int i=1;i<numbers.length;i++){
            if (numbers[i]<=res){
                res=numbers[i];
            }
        }
        return res;
    }
}
