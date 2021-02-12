//public class Student {
//    public Student(){
//        System.out.println("构造方法初始化");
//    }
//
//    {
//        System.out.println("构造代码块中初始化");
//    }
//
//    public String name=init();
//
//    public String init(){//和方法定义在哪无关
//        System.out.println("定义时初始化");
//        return "";
//    }
//}

//定义时初始化
public class Student {
    public String name="美女";
    public int age=25;

//重写继承自Object的toString方法
    public String toString(){
        return "Student{name="+name+"}";//返回字符串
    }

//通过构造代码块初始化
//    public String name;
//    public int age;
//    {
//        name="美女";
//        age=25;
//    }

    //构造方法时初始化
//        public Student(){
//            name="美女";
//            age=25;
//        }
    }