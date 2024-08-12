package kr.ac.mokwon.finaltest_01;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Ball {
    int x, y, xInc, yInc, radius;
    static int WIDTH = 320, HEIGHT = 320;
    Paint p;
    public Ball(int r) {
        radius = r;
        x = (int)(Math.random() * (WIDTH - r * 2) + r);
        y = (int)(Math.random() * (HEIGHT - r * 2) - 100);

        p = new Paint();
        p.setColor(Color.WHITE);
    }

    public void Draw(Canvas c){
        y += 1;

        if(y > WIDTH){
            y = -5;
        }

        c.drawCircle(x, y, radius, p);
    }
}
