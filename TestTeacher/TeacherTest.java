public class TeacherTest {
    public static void main(String[] args) {
        Teacher a=new Teacher();//调用无参的
        Teacher b=new Teacher("陈伟霆");
        Teacher c=new Teacher("陈伟霆",30);
        Teacher d=new Teacher(
                "陈伟霆",
                30,
                new String[]{"信号与系统","通信原理","数据结构"}
           );
        
    }
}
