

class Teacher{
    public String name;
    public int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Teacher:父类 构造方法执行");
    }
    {
        System.out.println("Teacher:父类 实例代码块执行");
    }
    static {
        System.out.println("Teacher:父类 静态代码块执行");
    }
}

class Student extends Teacher{
    public Student(String name, int age) {
        super(name, age);
        System.out.println("Student:子类 构造方法执行");
    }
    {
        System.out.println("Student:子类 实例代码块执行");
    }
    static {
        System.out.println("Student:子类 静态代码块执行");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Student t1=new Student("小刘",25);
        Student t2=new Student("小万",22);
    }
}