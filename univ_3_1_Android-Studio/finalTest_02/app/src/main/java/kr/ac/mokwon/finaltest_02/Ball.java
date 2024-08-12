package kr.ac.mokwon.finaltest_02;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Ball {
    int x, y, xInc, yInc, radius;
    static int WIDTH = 320, HEIGHT = 320;
    Paint p;
    public Ball(int r) {
        radius = r;
        x = 100;
        y = 100;
        p = new Paint();
        p.setColor(Color.RED);
    }

    public void Draw(Canvas c){
        c.drawCircle(x, y, radius, p);
    }

}
