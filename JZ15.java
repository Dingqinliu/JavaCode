//请实现一个函数，输入一个整数（以二进制串形式），
// 输出该数二进制表示中 1 的个数。
// 例如，把 9 表示成二进制是 1001，有 2 位是 1。
// 因此，如果输入9的二进制串，则该函数输出 2。
//输入必须是长度为32的二进制串

public class JZ15 {
    public int hammingWeight(int n){
        //1、十进制数转为二进制字符串 字符串转成字符数组 统计字符数组中字符‘1’的个数
//        String s=Integer.toBinaryString(n);
//        char[] ch=s.toCharArray();
//        if(ch.length>32){ //长度不能超过32
//            return -1;
//        }
//        int count=0;
//        for(int i:ch){
//            if (i =='1'){
//                count++;
//            }
//        }
//        return count;

        //2、整数减1后再和原整数按位与，会把该整数最右边的1变成0
        //那么一个整数有多少个1 就可以进行多少次这样的运算 直到所有变成0
//        int count =0;
//        while (n!=0){
//            count++;
//            n=n&(n-1);
//        }
//        return count;
//
//         3、终极懒人法
        return Integer.bitCount(n);

    }
}
