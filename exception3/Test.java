package CSDN;

import java.util.Scanner;

public class Test {
    //7、使用try负责回收资源
    //将Scanner对象在try的()中创建，就能保证在try执行完毕后自动调用Scanner的close方法
    public static void main1(String[] args) {

        try (Scanner sc=new Scanner(System.in)){
            int num=sc.nextInt();
            System.out.println("num="+num);
        }catch (Exception a) {
            a.printStackTrace();//打印出现异常的调用栈
        }
    }
    //8、如果本方法中没有合适的处理异常的方式，就会沿着调用栈向上传递
    public static void main2(String[] args) {
        try {
            func();
        }catch (ArrayIndexOutOfBoundsException a){
            a.printStackTrace();
        }
        System.out.println("after try catch");
    }
//    public static void func(){
//        int[] arr={1,3,5};
//        System.out.println(arr[3]);
//    }

    //9、如果向上一直传递都没有合适的方法处理异常，最终就会交给JVM处理，程序就会异常终止
    public static void main(String[] args) {
            func();
            System.out.println("after try catch");
    }
    public static void func(){
        int[] arr={1,3,5};
        System.out.println(arr[3]);
    }

    //总结:异常处理流程
    //程序先执行try中的代码
    //如果try中的代码出现异常，就会结束try中的代码，看是否和catch中的异常类型匹配
    //如果找到匹配的异常类型，就会执行catch中的代码
    //如果没有找到匹配的异常类型，就会将异常向上传递到上层调用者
    //无论是否找到匹配的异常类型，finally中的代码都会被执行到(在该方法结束之前执行)
    //如果上次调用者也不能处理该异常，就继续向上传递
    //一直到main方法也没有合适的代码处理异常，就会交给JVM进行处理，此时程序就会异常终止
}
