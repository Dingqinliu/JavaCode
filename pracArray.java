import java.util.Arrays;

public class pracArray {
    public static void main(String[] args) {
        long[] array1={1,6,9,11,5};
        long target=5;

        int a1=indexOf(array1,target);
        System.out.println("目标元素的下标值为"+a1);

        int a2=reverseIndexOf(array1,target);
        System.out.println("目标元素的下标值为"+a2);

        long max=arrayMax(array1);
        System.out.println("数组的最大值为"+max);

        long min=arrayMin(array1);
        System.out.println("数组的最小值为"+min);

        long sum=arraySum(array1);
        System.out.println("数组元素之和为"+sum);

        arrayFill(array1,6);
        String s= Arrays.toString(array1);
        System.out.println("将数组元素均填充为6后得到数组为:"+s);

        arrayFill(array1,1,3,5);
        String t=Arrays.toString(array1);
        System.out.println("将数组中元素下标为1~3的元素填充为5得到的数组为:"+t);
    }
    //1、在array数组中，从前往后找第一次出现的target位置。
    //找到返回其下标，没有找到则返回-1
    public static int indexOf(long[] array,long target){
        for (int i=0;i<array.length;i++){
            long b=array[i];//遍历数组中每一个元素
            if (b==target){
                return i;//找到了
            }
        }
        return -1;//循环走完，仍未找到。
    }
    //2、在array数组中，从后往前找第一次出现的target位置。
    //找到返回其下标，没有找到则返回-1
    public static int reverseIndexOf(long[] array,long target){
        for (int i=array.length-1;i>=0;i--){
            long b=array[i];
            if (b==target){
                return i;
            }
        }
        return -1;
    }

    //3、从前往后查找,找到数组中的最大值
    public static long arrayMax(long[] array){
        long max=array[0];//假定第一个元素是最大值，从前往后比较
        for (int i=1;i<array.length;i++){
            if (max<array[i]){
                max=array[i];
            }
        }
        return max;
    }

    //4、找到数组最小值
    public static long arrayMin(long[] array){
        long min=array[0];
        for (int i=1;i<array.length;i++){
            if (min>array[i]){
                min=array[i];
            }
        }
        return min;
    }

    //5、求数组元素之和
    public static long arraySum(long[] array){
        long sum=0;
        for (long element:array){//全范围遍历，不需要考虑下标
            sum+=element;
        }
        return sum;
    }

    //6、数组填充
    public static void arrayFill(long[] array,long fill){
        for (int i=0;i<array.length;i++){
            array[i]=fill;
        }
    }

    //7、以上方法，操作范围均换成[fromIndex,toIndex]。其余同理
    public static void arrayFill(long[] array,int fromIndex,int toIndex,long fill){
        //先进行合法性检查
        if (fromIndex<0||toIndex>array.length-1||fromIndex>toIndex){
            throw new RuntimeException("传入的参数不合法");
        }
        for (int i=fromIndex;i<=toIndex;i++){
            array[i]=fill;
        }
    }
}
