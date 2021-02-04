import java.util.Arrays;

public class twoDimArray2 {
    public static void main(String[] args) {
      //形参的改变不会影响实参(与形参的数据类型无关)
        long a=10;//基本类型
        long b=20;
        swap1(a,b);//实参

        System.out.println(a);
        System.out.println(b);

        long[] a1={1,3,5,7};//引用类型
        long[] b1={2,4,6,8};
        swap2(a1,b1);//实参

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(b1));

        //当多个引用指向同一个对象时
        //通过其中一个引用对 对象 进行修改，由其他引用可看到该变化
        //即 在方法中修改数据  让方法外看到
        swap3(a1,0,3);
        System.out.println(Arrays.toString(a1));
    }

    private static void swap3(long[] array, int indexA, int indexB) {
        long t=array[indexA];//解引用
        array[indexA]=array[indexB];
        array[indexB]=t;
    }

    private static void swap2(long[] x, long[] y) {
        long[] t=x;
        x=y;
        y=t;
    }

    private static void swap1(long x, long y) {
        long t=x;
        x=y;
        y=t;
    }

}
