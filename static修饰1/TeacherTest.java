public class TeacherTest {
    public static void main(String[] args) {
        //针对Teacher作为对象模板的用法
        Teacher a=new Teacher("李老师1",40);
        a.introduce();//通过指向Teacher对象的引用去调用

        //针对Teacher用于静态的集合
        //使用类名调用，和对象无关
        int b=Teacher.countOfTeacher;
        System.out.println(b);//0
        System.out.println(Teacher.buildTeacher("李老师2"));
        System.out.println(Teacher.countOfTeacher);//1
        System.out.println(Teacher.getCountOfTeacher());//1
        System.out.println(Teacher.buildTeacher("李老师3"));
        System.out.println(Teacher.countOfTeacher);//2
        System.out.println(Teacher.getCountOfTeacher());//2

    }



}
