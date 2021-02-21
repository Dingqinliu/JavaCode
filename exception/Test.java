package CSDN;

public class Test {
    public static void main1(String[] args) {
        //1、不处理异常
        int[] arr={1,3,5};
        System.out.println("1");
        System.out.println(arr[4]);
        System.out.println("2");
    }
    //2、使用try catch
    public static void main2(String[] args) {
        int[] arr = {1, 3, 5};
   try {
       System.out.println("1");
       System.out.println(arr[4]);
       System.out.println("2");
   }catch (ArrayIndexOutOfBoundsException a){
       a.printStackTrace();//打印出现异常的调用栈
   }
        System.out.println("after try catch");
    }

    //3、catch只能处理对应种类的异常
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};

        try {
            System.out.println("1");
            arr=null;
            System.out.println(arr[4]);
            System.out.println("2");
        }catch (ArrayIndexOutOfBoundsException a){
            a.printStackTrace();//打印出现异常的调用栈
        }
        System.out.println("after try catch");
    }
}
