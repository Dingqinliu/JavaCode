import java.util.Arrays;

public class twoDimArray {
    public static void main(String[] args) {
        long[][] a={
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };

        long[][] b=null;

        long[][] c={
                {3,2,1},
                null,
                null,
                {1,2}
        };

        printArray(a);
        System.out.println(Arrays.toString(a));

        printArray(b);
        System.out.println(Arrays.toString(b));

        printArray(c);
        System.out.println(Arrays.toString(c));
//        long[] b=a[2];
//        a[2]=a[3];
//        a[3]=b;
//
//        System.out.println(Arrays.toString(b));
//        System.out.println(Arrays.toString(a[3]));
    }
    //二维数组整体打印
    public static void printArray(long[][] array) {
       //方法一 现写
        if (array== null) {
            System.out.println("null");
            return;
        }
        else {
            for (int i = 0; i < array.length; i++) {
                if (array[i]==null){
                    System.out.println("null");
                    continue;
                }
                System.out.print("[");
                for (int j = 0; j < array[i].length - 1; j++) {
                    System.out.print(array[i][j] + ",");
                }
                System.out.print(array[i][array[i].length - 1] + "]");
                System.out.printf("\n");
            }
        }
    }
}
