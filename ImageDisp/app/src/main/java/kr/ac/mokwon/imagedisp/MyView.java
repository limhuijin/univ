package kr.ac.mokwon.imagedisp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyView extends View {
    float sX, sY, angle;

    public MyView(Context context) {
        super(context);

        setBackgroundColor(Color.YELLOW);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.neko);
        Bitmap sb = Bitmap.createScaledBitmap(b, 50, 50, false);
        Matrix m = new Matrix();
        m.preScale(0.5f, -0.5f);
        //m.preRotate(60);
        Bitmap mb = Bitmap.createBitmap(b, 0, 0, b.getWidth(), b.getHeight(), m, false);
        //canvas.drawBitmap(b, 0, 0, null);
        int centerX = canvas.getWidth() / 2;
        int centerY = canvas.getHeight() / 2;
        canvas.scale(sX, sY, centerX, centerY);
        canvas.rotate(angle, centerX, centerY);
        canvas.drawBitmap(b, 0, 0, null);
    }

    public void ShrinkPl(){
        sX += 0.3f;
        sY += 0.3f;
        invalidate();
    }

    public void ShrinkMa(){
        sX -= 0.3f;
        sY -= 0.3f;
        invalidate();
    }

    public void RatateRight(){
        angle += 30;
        invalidate();
    }

    public void RatateLeft(){
        angle -= 30;
        invalidate();
    }


    /*
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                downX = event.getX() - x;
                downY = event.getY() - y;
                return true;
            case MotionEvent.ACTION_MOVE:
                x = event.getX() - downX;
                y = event.getY() - downY;
                invalidate();
                return true;
        }
            return super.onTouchEvent(event);
        }*/

}
