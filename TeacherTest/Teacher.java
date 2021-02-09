//定义构造方法
//接近于方法，但有区别：
//1、没有返回值类型
//2、出现方法名的位置必须使用类名
public class Teacher {
    public String name;
    public int age;
    public String[] courseArray;

    //定义构造器 构造方法重载--方法名相同 参数列表不同
    //没有参数的
    public Teacher(){

    }

    //一个参数的
    public Teacher(String name){
        this.name=name;
    }

    //两个参数的
    public Teacher(String name,int age){
        this.name=name;
        this.age=age;
    }

    //三个参数的
    public Teacher(String name,int age,String[] courseArray){    //形参和属性同名时
//        name=name;//左右均为形参 并未达到修改属性的目的
//        age=age;
//        courseArray=courseArray;

        this.name=name;
        this.age=age;
        this.courseArray=courseArray;

    }
}

//    public Teacher(String a,int b,String[] c){//形参和属性不同名时
//       name=a;//传参成功
//       age=b;
//       courseArray=c;
//    }
//}
