package kr.ac.mokwon.test_ex;

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
        y = (int)(Math.random() * (HEIGHT - r * 2) + r);
        xInc = (int)(Math.random() * 9 + 1);
        yInc = (int)(Math.random() * 9 + 1);

        p = new Paint();
        p.setColor(Color.RED);
    }

    public void Draw(Canvas c){
        if(x < radius || x > WIDTH - radius){
            xInc = -xInc;
        }

        if(y < radius || y > HEIGHT - radius){
            yInc = -yInc;
        }

        x += xInc;
        y += yInc;

        c.drawCircle(x, y, radius, p);
    }
}
