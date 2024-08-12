package kr.ac.mokwon.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyView extends View {

    /*float startAngle, sweepAngle;
    float startSpeed = 2, sweepSpeed = 15;*/

    float minAngle = 0, maxAngle = 315;
    boolean isBool = true;

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        Paint p = new Paint();
        p.setColor(Color.RED);
        canvas.drawColor(Color.YELLOW);
        canvas.drawArc(new RectF(10, 10, 300, 300), minAngle, maxAngle, true, p);

        /*sweepAngle += sweepSpeed;
        if(sweepAngle > 360){
            startAngle += startSpeed;
            sweepAngle -= 360;

            if(startAngle > 360){
                startAngle -= 360;
            }
        }*/

        if(isBool){
            minAngle -= 2;
            maxAngle += 4;

            if(minAngle < -23){
                isBool = false;
            }
        }
        else{
            minAngle += 2;
            maxAngle -= 4;

            if(minAngle > 23){
                isBool = true;
            }
        }

        invalidate();
    }
}
