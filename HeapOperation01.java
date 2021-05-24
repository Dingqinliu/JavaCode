import java.util.Arrays;

public class HeapOperation01 {
    public static void main(String[] args) {
        long[] array = {27, 15, 19, 18, 28, 34, 65, 49, 25, 37};
        HeapOperation01 p = new HeapOperation01();
        p.shiftDown(array, 0);
        System.out.println(Arrays.toString(array));
    }

    private void shiftDown(long[] array, int parent) {
        int size = array.length;
        int child = parent * 2 + 1;//把孩子标记成左孩子 因为无左必无右

        while (child < size) {
            //如果左右孩子都有，线找到这俩孩子中最小的那个，用child标记
            if (child + 1 < size && array[child] > array[child + 1]) {
                child = child +1;
            }
            if (array[parent] <= array[child]) {
                break;
            } else {
                long temp = array[child];
                array[child] = array[parent];
                array[parent] = temp;
            }
            //向下调整后可能不满足条件 所以继续向下调整
            parent=child;
            child=parent*2+1;
        }
    }
}
