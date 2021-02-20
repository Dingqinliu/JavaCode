public class Test {
    public static void main(String[] args) {
        Person p1=new Person("小刘",25);
        Person p2=new Person("小万",22);
    }
}

class Person{
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("构造方法执行");
    }
    {
        System.out.println("实例代码块执行");
    }
    static {
        System.out.println("静态代码块执行");
    }

    //在无继承关系时，代码块的执行顺序为：静态代码块先执行，实例代码块接着执行，最后构造方法执行。
}
