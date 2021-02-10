import java.util.Arrays;

public class briefSummary {
    public static void main(String[] args) {
        //通过赋值表现出的“共享”特性
//        int[] a={2,3,4,5};
//        System.out.println(Arrays.toString(a));
//        int[] b=a;
//        System.out.println(Arrays.toString(b));
//        b[0]=100;
//        System.out.println(Arrays.toString(b));
//        System.out.println(Arrays.toString(a));

        //通过方法传参表现出的“共享”特性
        int[] a={1,3,7,9};
        //System.out.println(Arrays.toString(a));
        change(a);
        //System.out.println(Arrays.toString(a));
    }
    public static void change(int[] b){
        System.out.println(Arrays.toString(b));
        b[0]=100;
       System.out.println(Arrays.toString(b));
    }
}
