package biteTest;

import java.util.Arrays;

public class ArrayExchange {
    public static void main(String[] args) {
        int[] a1={1,3,5,7,9};
        int[] a2={2,4,6,8,10};
        System.out.println("a1数组："+Arrays.toString(a1));
        System.out.println("a2数组："+Arrays.toString(a2));
        exchange(a1,a2);
    }

    private static void exchange(int[] a1, int[] a2) {
        int temp=0;
        for (int i=0;i<a1.length;i++){
            a1[i]=a1[i]^a2[i];
            a2[i]=a1[i]^a2[i];
            a1[i]=a1[i]^a2[i];
        }
        System.out.println("交换后a1数组："+Arrays.toString(a1));
        System.out.println("交换后a2数组："+Arrays.toString(a2));
    }

}
