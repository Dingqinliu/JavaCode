import java.util.Arrays;

public class praArray3 {
    public static void main(String[] args) {
        long[] array1={1,2,3,4,5,6,7,8};
        long[] array2={6,5,4,3,2,1};
        long[] array3={3,1,4,2,7,5,4,0};
        long[] array4={};

        bubbleSort(array1);
        System.out.println(Arrays.toString(array1));

        bubbleSort(array2);
        System.out.println(Arrays.toString(array2));

        bubbleSort(array3);
        System.out.println(Arrays.toString(array3));

        bubbleSort(array4);
        System.out.println(Arrays.toString(array4));


    }
    public static void bubbleSort(long[] array){
        //数组完全乱序 长度为n时需要最多n-1次冒泡
        //经过冒泡过程，把无序区间内最大值放到区间最后去
        //每经过一次冒泡 无序区间长度-1 有序区间长度+1
        //数组看作一个整体区间，无序区间是[0,array.length)，
        //无序区间：[0,array.length-i)
        for (int i=0;i<array.length-1;i++){//每循环一次,经过一次冒泡
            for (int j=0;j<array.length-i-1;j++){//相邻比较
                //j代表黑色下标 [0，array.length-i)
                //蓝色是j+1
                //保证两个下标均合法,j+1~[0,array.length-i)
                //j~[-1,array.length-i-1)
                //取交集 j~[0,array.length-i-1)
                if (array[j]>array[j+1]){
                    long t=array[j+1];
                    array[j+1]=array[j];
                    array[j]=t;
                }
            }
        }
    }
}
