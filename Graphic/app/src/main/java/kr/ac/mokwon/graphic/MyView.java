package kr.ac.mokwon.graphic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import androidx.annotation.NonNull;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        Paint p = new Paint();
        p.setColor(Color.YELLOW);
        p.setStrokeWidth(3);
        canvas.drawColor(Color.BLUE);
        canvas.drawLine(10, 10, 200, 10, p);
        canvas.drawRect(10, 30, 200, 120, p);
        canvas.drawCircle(100, 200, 70, p);
        p.setTextSize(40);
        canvas.drawText("This is a test!", 10, 300, p);
    }
}
