import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
       int level=selectLevel();//选择难度
       int range=getRandomRange(level);//根据难度得到生成随机数范围
        int random=generateRandom(range);//根据范围生成随机数
        int toGuessCount=getToGuessCount(level);//根据难度得到可猜次数


        playGame(random,toGuessCount);//开始游戏
        
    }

    private static int generateRandom(int range) {//Alt+enter  //Alt+Shift+Enter
        Random random=new Random();
        return random.nextInt(range);
    }


    public static int selectLevel() {
        Scanner sc=new Scanner(System.in);
        System.out.print("请选择难度:");
        return sc.nextInt();
    }

    private static int getRandomRange(int level) {
        switch (level){
            case 0:
                return 10;
            case 1:
                return 100;
            case 2:
                return 1000;
            default:
                return 0;

        }
    }

    public static int getToGuessCount(int level) {
        switch (level){
            case 0:
                return 10;
            case 1:
                return 7;
            case 2:
                return 5;
            default:
                return 0;
        }
    }

    public static void playGame(int random, int toGuessCount) {
        Scanner sc=new Scanner(System.in);

        int count=0;
        System.out.print("请输入一个数字：");
        while (sc.hasNext()&&count<toGuessCount){
            int n=sc.nextInt();
            count++;
            if (n==random){
                System.out.println("游戏成功");
                return;
            }
            else if (n<random){
                System.out.println("猜小了,还有"+(toGuessCount-count)+"次机会可用");
            }
            else {
                System.out.println("猜大了,还有"+(toGuessCount-count)+"次机会可用");
            }
        }
    }
}
