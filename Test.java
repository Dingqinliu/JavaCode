import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(Odd_Even(arr)));
    }

    public static int[] Odd_Even(int[] a) {
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            while ((left < right) && a[left] % 2 != 0)//从左边开始找一个奇数
            {
                left++;
            }
            while ((left < right) && a[right] % 2 == 0)//从右边开始找一个偶数
            {
                right--;
            }
            if (left < right)//两个循环找出奇数偶数， 若left<right，则交换
            {
                int tmp = a[left];
                a[left] = a[right];
                a[right] = tmp;
            }
        }
        return a;
    }
}
