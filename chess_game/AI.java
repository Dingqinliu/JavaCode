package chess_game;

import java.util.Random;

//返回AI对象的落子位置
//用数组表示 第几行第几列 从0开始
//所以有效范围是[0,2]
public class AI {
    private final Random random=new Random();


    public int[] getPosition(){
        int r=random.nextInt(3);//[0,2]
        int c=random.nextInt(3);
        return new int[]{r,c};
    }
}
