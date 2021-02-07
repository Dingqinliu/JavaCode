import java.util.Scanner;

public class NiuKeBC32 {
    public static void main(String[] args) {

        //先读进来
        Scanner sca=new Scanner(System.in);
        String name=sca.next();
        int age=sca.nextInt();
        String gender=sca.next();

        System.out.print("Name");
        System.out.print("    ");
        System.out.print("Age");
        System.out.print("    ");
        System.out.print("Gender");
        System.out.println();
        for (int i=0;i<21;i++) {
            System.out.print("-");
        }
        System.out.println();

        //读进来之后要输出
        System.out.printf("%-8s",name);
        System.out.printf("%-7d",age);
        System.out.printf("%s\n",gender);

    }
}
