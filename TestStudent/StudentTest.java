public class StudentTest {
    public static void main(String[] args) {
       //构造对象，并且得到a引用，用于后续操作对象
        Student a=new Student();
        //通过a引用，为对象的属性进行赋值操作。
        a.name="张三";
        a.age=18;
        a.courseArray=new String[]{"数据结构","操作系统"};

        //通过a引用，调用属于该对象的方法。
        a.selfIntroduction();


        Student b=new Student();
        b.name="李四";
        b.age=20;
        b.courseArray=new String[]{"计算机网络","单片机"};

        b.selfIntroduction();

        //对象a b执行的方法是相同的，但属性的值不同，所以打印结果也不同。
    }
}
