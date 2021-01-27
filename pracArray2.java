import java.util.Arrays;

public class pracArray2 {
    public static void main(String[] args) {
       // java.util.Arrays类的各种方法
        //binarySearch--二分查找（各种重载，因为元素不同/带范围）--前提：数组是有序
        //copyOf--复制已有数组，得到其拷贝后的副本（元素不同）
        //copyOfRange--指定区间，复制已有数组[from,MIN(to,元素长度))
        //equals--比较两个数组是否“相等”--长度一样&&每个元素对应一样
        //fill--用指定元素填充数组（元素不同|带范围）
        //sort--排序(元素不同|范围不同)
        //toString--得到数组的pretty显示字符串

        testBinarySearch();
        testEquals();
        testFill();
        testSort();
        testCopy();
        testCopyOfRange();
        
    }

    private static void testCopyOfRange() {
        long[] array={1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        //[from,to)
        long[] copy1=Arrays.copyOfRange(array,2,4);//拷贝下标2和3的元素
        System.out.println(Arrays.toString(copy1));

        long[] copy2=Arrays.copyOfRange(array,2,array.length);
        System.out.println(Arrays.toString(copy2));

        long[] copy3=Arrays.copyOfRange(array,2,7);//超过，用0填充
        System.out.println(Arrays.toString(copy3));

    }

    private static void testCopy() {
        long[] array={1,2,3,4,5};
        System.out.println(Arrays.toString(array));

        long[] copy1=Arrays.copyOf(array,3);//新数组长度小于原数组长度
        System.out.println(Arrays.toString(copy1));//{1,2,3}

        long[] copy2=Arrays.copyOf(array,5);//长度相等
        System.out.println(Arrays.toString(copy2));//{1,2,3,4,5}

        long[] copy3=Arrays.copyOf(array,9);//新数组长度大于原数组长度
        System.out.println(Arrays.toString(copy3));//{1,2,3,4,5,0,0,0,0}

    }

    private static void testSort() {
        long[] array={9,5,3,2,1,7,8};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);//原地排序
        System.out.println(Arrays.toString(array));
    }

    private static void testFill() {
        long[] array=new long[10];
        System.out.println(Arrays.toString(array));
        Arrays.fill(array,1,8,50);//下标1到8的位置均填充为50
        System.out.println(Arrays.toString(array));

    }

    private static void testEquals() {//长度和对应元素均相等
        long[] array1={1,3,5,7};
        long[] array2={1,3,5};

        System.out.println(Arrays.equals(array1, array2));//false
    }

    private static void testBinarySearch() {
        long[] arrays1={1,3,5,7,9,9,11,13,15};
        System.out.println(Arrays.binarySearch(arrays1, 7));//应为3
        System.out.println(Arrays.binarySearch(arrays1, 9));//4 or 5均可
        System.out.println(Arrays.binarySearch(arrays1, -2));//不存在的元素，返回非法下标（负值）

        //若数组无序，属于行为未定义，返回什么都是正确的（没有期望值）
        long[] array2={3,1,5,7,9};
        System.out.println(Arrays.binarySearch(array2, 1));//仍返回非法下标（负值）
    }
}
