import java.util.Arrays;

public class praRefer01 {
    public static void main(String[] args) {
        long[][] a=new long[3][];
        //a[0][0]=10;//运行时会出现空指针异常
        //拆解：
        long[] b=a[0];//a!=null，所以解引用合法
        System.out.println(b);//null
        // b[0]=10;//b==null,对null引用做解引用操作了，在这一步报异常

        //如果想实现a[0][0]=10成立，需要至少让a[0]引用指向一个元素是long的数组对象
        a[0]=new long[3];
        a[0][0]=10;
        System.out.println(a[0][0]);//10

        a[1]=new long[10];//a[0]的长度是3，a[1]的长度是10是允许的，因为对象是独立的
        a[1][0]=100;


        long[] c={1,2,3,4,5};
        long[] b1= Arrays.copyOf(c,c.length);//拷贝

        System.out.println(c==b1);//false

        c[0]=100;
        System.out.println(b1[0]);//1
        //对比 引用
        long[] b2=c;
        System.out.println(c==b2);//true

        c[1]=100;
        System.out.println(b2[1]);//100

        long[][] d={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };


    }
}
