import java.util.Scanner;

public class ageJudge {
    public static void main(String[] args) {
        System.out.println("请输入要判断的年龄：");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 0 && age <= 18) {
            System.out.println(age + "的人是少年");
        } else if (age >= 19 && age <= 28) {
            System.out.println(age + "的人是青年");
        } else if (age >= 29 && age <= 55) {
            System.out.println(age + "的人是中年");
        } else {
            System.out.println(age + "的人是老年");
        }
    }
}
