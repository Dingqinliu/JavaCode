package yichang;

public class Test2 {
    //4、catch可以有多个
    public static void main4(String[] args) {
        int[] arr = {1, 3, 5};

        try {
            System.out.println("1");
            arr=null;
            System.out.println(arr[4]);
            System.out.println("2");
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("数组下标越界异常");
            a.printStackTrace();//打印出现异常的调用栈
        }catch (NullPointerException b){
            System.out.println("空指针异常");
        }
        System.out.println("after try catch");
    }

    //5、用一个catch捕获所有的异常。
    public static void main5(String[] args) {
        int[] arr = {1, 3, 5};

        try {
            System.out.println("1");
            arr=null;
            System.out.println(arr[4]);
            System.out.println("2");
        }catch (Exception a) {
            System.out.println("数组下标越界异常");
            a.printStackTrace();//打印出现异常的调用栈
        }
        System.out.println("after try catch");
    }

    //6、finally表示最后的善后工作
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};

        try {
            System.out.println("1");
            arr=null;
            System.out.println(arr[4]);
            System.out.println("2");
        }catch (Exception a) {
            System.out.println("数组下标越界异常");
            a.printStackTrace();//打印出现异常的调用栈
        }finally {
            System.out.println("finally code");
        }
    }

}
