package kr.ac.mokwon.touchevent;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyView extends View {
    List<Circle> circleList;
    Paint p;
    public MyView(Context context) {
        super(context);
        p = new Paint();
        circleList = new ArrayList<>();
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);

        for(Circle circle : circleList){
            p.setColor(circle.color);
            canvas.drawCircle(circle.x, circle.y, circle.radius, p);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_DOWN){
            Random random = new Random();
            float radius = random.nextInt(100);
            int color = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            circleList.add(new Circle(event.getX(), event.getY(), radius, color));
            invalidate();
            return true;
        }

        return super.onTouchEvent(event);
    }
}
