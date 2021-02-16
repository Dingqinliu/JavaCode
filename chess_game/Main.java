package chess_game;

public class Main {
    public static void main(String[] args) {
      Player player=new Player();
      Game game=new Game(player);

      //一次循环代表一次游戏
      while (true){
          game.Init();//初始化
          game.play();//开始游戏

          game.destory();//释放

          boolean q=player.queryContinue();
          if (!q){
              System.out.println("欢迎下次继续游戏！");
              break;
          }
      }
    }
}
