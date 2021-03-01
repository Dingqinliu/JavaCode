package snakeGame;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class DemoApp extends Application {
    // 在静态内部类中，可以直接访问我的其他静态顺序
//    static class MyTimer extends AnimationTimer {
//        private long lastTick = 0;
//        private Canvas canvas;
//        private GraphicsContext gc;
//        MyTimer(Canvas canvas, GraphicsContext gc) {
//            this.canvas = canvas;
//            this.gc = gc;
//        }
//        @Override
//        public void handle(long now) {
//            // now：以纳秒为单位，本次调用 handle 时的时间
//            // 1e9 科学计数法的写法 1 * 10^9
//            if (lastTick == 0 || now - lastTick > 1e9 / 48) {
//                lastTick = now;
//
//                // 通过绘制一整块大的矩形，把所有之前绘制的图形擦掉
//                gc.setFill(Color.WHITE);
//                gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
//
//                // 绘制圆形
//                gc.setFill(Color.RED);
//                gc.fillOval(x, y, 50, 50);
//
//                x += 3;
//                y += 1;
//            }
//        }
//    }

    private static int x = 400;   // 绘制圆的 x
    private static int y = 300;   // 绘制圆的 y

    // DIR: Direction 方向
//    private static final int DIR_UP = 0;
//    private static final int DIR_LEFT = 1;
//    private static final int DIR_DOWN = 2;
//    private static final int DIR_RIGHT = 3;
//
//    private static int direction = DIR_RIGHT;

    // 通过枚举（enum）实现方向，一类有限的可选的选项
    enum Direction {
        DIR_UP, DIR_LEFT, DIR_DOWN, DIR_RIGHT
    }
    private static Direction direction = Direction.DIR_LEFT;

    @Override
    public void start(Stage primaryStage) throws Exception {
        final Canvas canvas = new Canvas(800, 600);   // 画布对象
        Pane pane = new Pane();
        pane.getChildren().add(canvas);

        // 在画布上进行图形绘制
        final GraphicsContext gc = canvas.getGraphicsContext2D();     // 利用图形上下文，在画布上绘图
        // 1. 填充式的
        // 2. 不填充式的

        // 绘制矩形为例：
        // 1. 填充，设置填充的颜色
//        gc.setFill(Color.RED);
//        gc.fillRect(100, 60, 120, 80);
//
//        // 2. 不填充，设置线条颜色
//        gc.setStroke(Color.BLUE);
//        gc.setLineWidth(5);
//        gc.strokeRect(400, 60, 120, 80);
//
//        // 绘制圆形
//        gc.setFill(Color.LIGHTGREEN);
//        gc.fillOval(100, 200, 80, 80);
//
//        // 绘制一个矩形，遮盖部分圆形
//        gc.setFill(Color.YELLOW);
//        gc.fillRect(140, 240, 120, 80);
//
//        // 同心矩形的绘制
//        gc.setFill(Color.LIGHTSALMON);
//        gc.fillRect(100, 300, 120, 80);
//        gc.setFill(Color.AQUA);
//        gc.fillRect(110, 310, 100, 60);
        // 绘制结束

        //AnimationTimer timer = new MyTimer(canvas, gc);
        AnimationTimer timer = new AnimationTimer() {
            // 启动类中，可以直接使用局部变量中，被 final 修饰的，或者没被 final 修饰但也更改过的变量
            long lastTick;

            @Override
            public void handle(long now) {
                if (lastTick == 0 || now - lastTick > 1e9 / 48) {
                    lastTick = now;

                    gc.setFill(Color.WHITE);
                    gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());

                    gc.setFill(Color.BLACK);
                    gc.setFont(new Font(40));
                    gc.fillText("小游戏", 10, 40);

                    gc.setFill(Color.RED);
                    gc.fillOval(x, y, 50, 50);

                    switch (direction) {
                        case DIR_UP:
                            y--;
                            break;
                        case DIR_LEFT:
                            x--;
                            break;
                        case DIR_DOWN:
                            y++;
                            break;
                        case DIR_RIGHT:
                            x++;
                            break;
                    }
                }
            }
        };
        timer.start();  // 调用 start()，启动定时器

        Scene scene = new Scene(pane);

        // 为 scene 绑定键盘按下事件
        // 每当键盘上有 键 按下时，怎么办
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                //System.out.println(event.getEventType() + ":" + event.getCode());

                switch (event.getCode()) {
                    case W: case UP:
                        direction = Direction.DIR_UP;
                        break;
                    case A: case LEFT:
                        direction = Direction.DIR_LEFT;
                        break;
                    case S: case DOWN:
                        direction = Direction.DIR_DOWN;
                        break;
                    case D: case RIGHT:
                        direction = Direction.DIR_RIGHT;
                        break;
                }
            }
        });


        primaryStage.setScene(scene);

        primaryStage.setTitle("贪吃蛇");
        primaryStage.show();
    }

    public static void main(String[] args) {
        // launch: 引导；加载
        //Application.launch(SnakeApp.class, args);

        launch(args);
    }
}
