import java.util.Arrays;
import java.util.Scanner;

public class pracMethod {
    public static void main(String[] args) {
        long[] array={1,1,2,2,3,4,4};
        System.out.println(Arrays.toString(array));

        long ans=findNum(array);
        System.out.println("只出现一次的元素是"+ans);

        int n=3;
        System.out.println("第"+n+"项Fibonacci数为"+Fibonacci(n));//0、1、1、2、3、5、8、13、21、34

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入n值：");
        int n1=sc.nextInt();
        long sum=0;
        for (int i=1;i<=n;i++){
            sum+=factorialSum(i);
        }
        System.out.println("从1到"+n+"的阶乘和为"+sum);
    }
    public static long findNum(long[] array){ //1、有一组数据，只有一个数字是出现一次，其他是两次，找出这个数字。
        long ans=0;
        for (int i=0;i<array.length;i++){
            ans^=array[i];//0^a=a,a^b^b=a
        }
        return ans;
    }
    public static long Fibonacci(long n){ //2、求斐波那契数列的第n项。(迭代实现)
        if (n<0){
            throw new RuntimeException("传入的参数不合法");
        }
        else if (n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }

    public static long factorialSum(long n){ //3、求阶乘和,从1开始
        long sum=0;
        long ans=1;
        if (n<=0){
            throw new RuntimeException("传入的参数不合法");
        }
        else {
            for (int i=1;i<=n;i++){
                ans*=i;
            }
            return ans;
        }
    }
}
