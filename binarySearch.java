public class binarySearch {
    public static void main(String[] args) {
        long[] array={0,1,2,3,4,5,6,7,8};
        for (long i=-1;i<10;i++){//所有元素以及不存在的元素全检测
            System.out.println(binarySearch(array,i));
        }

        long[] array2={};
        System.out.println("空数组检测：");
        System.out.println(binarySearch(array2, 2));//空数组检测

    }
    public static int binarySearch(long[] array,long target){
        //前提：array是有序数组
        //找到target所在的下标，如果有多个target，不保证找到哪一个
        //若没找到 返回-1
        //待查找区间表示为[lowIndex,highIndex)
        //最开始的时候 lowIndex=0,highIndex=array.length
        //中间位置元素下标是 midIndex=(lowIndex+highIndex)/2
        //待查找区间内元素个数=highInex-lowIndex,当它<=0,停止查找
        int lowIndex=0;
        int highIndex=array.length;


        while (highIndex-lowIndex>0){
            int midIndex=(lowIndex+highIndex)/2;
            long midElement=array[midIndex];

            if (target==midElement){//
                return midIndex;
            }
            else if(target<midElement){//丢掉右边，包括midIndex所指向的元素

                highIndex=midIndex;//因为highIndex的使用是开区间，所以这里不减去1
            }
            else {
                lowIndex = midIndex + 1;//丢掉左边，包括midIndex,闭区间，需要+1
            }
        }
        return -1;//所找元素不在区间里 返回-1
    }
}
