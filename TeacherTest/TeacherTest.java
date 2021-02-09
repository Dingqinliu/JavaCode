import sun.security.mscapi.CPublicKey;

import java.util.Arrays;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher a=new Teacher();//调用无参的
        Teacher b=new Teacher("毛不易");
        Teacher c=new Teacher("朱一龙",33);
        Teacher d=new Teacher(
                "陈伟霆",
                30,
                new String[]{"信号与系统","通信原理","数据结构"}
           );

        System.out.println(a.age);//0
        System.out.println(b.name);//毛不易
        System.out.println(c.name);//朱一龙
        System.out.println(c.age);//33


        System.out.println(d.name);//陈伟霆
        System.out.println(d.age);//30
        System.out.println(Arrays.toString(d.courseArray));

        //没有利用传入的参数去修改对象的属性，没有对象中的属性，所以仍然保持默认值的情况。
        //即 参数只是传了 还没用

        //利用传入的值修改属性
        //形参和属性不同名
        //形参和属性同名


    }
}
