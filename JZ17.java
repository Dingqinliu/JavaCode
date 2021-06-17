//输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。
// 比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
//思路：最大的n位数 res 和位数n的关系
//最大的一位数9 二位数 99 三位数 999...res=10^n-1;
//考虑大数越界问题：
//当n较大时，res会超出int32整型的取值范围，超出取值范围的数字无法正常存储，但由于题目要求返回int类型数组
//相当于默认所有数字均在int 32整型取值范围内 因此不考虑大数越界问题
//so 区间[1，10^n-1] 步长为1
public class JZ17 {
//    public int[] printNumbers(int n){
    //不考虑大数越界
//        int size=(int)Math.pow(10,n)-1;
//        int[] arr=new int[size];
//        for (int i=0;i<size;i++){
//            arr[i]=i+1;
//        }
//        return arr;

    //考虑大数越界 三个问题
    // 1. 表示大数的变量类型 因为short/int/long...任意变量类型
    //数字的取值范围都是有限的 因此大数的表示应用String类型
    //2.生成数字的字符串集
    //使用int类型时，每轮可通过+1生成下个数组 而此方法无法应用到String类型
    //并且 String类型的数字的进位操作效率较低 例如从999到1000需要从个位到千位循环判断 进位三次
    //生成的列表实际上是n位0~9的全排列
    // 因此可避开进位操作 通过递归生成数字的String列表
    //3.递归生成全排列
    //基于分治算法的思想 先固定高位 向低位递归
    // 当个位已被固定时 添加数字的字符串
    //如 n=2 数字范围0~99 固定十位为0~9 按顺序依次开启递归
    //固定个位0~9，终止递归并添加数字字符串
    StringBuilder res;
    int count = 0;
    int n;
    char[] num, loop = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public String printNumber(int n) {
        this.n = n;
        res = new StringBuilder();
        num = new char[n];
        dfs(0);
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }

    void dfs(int x) {
        if (x == n) {
            res.append(String.valueOf(num) + ",");
            return;
        }
        for (char i : loop) {
            num[x] = i;
            dfs(x + 1);
        }
    }
}
