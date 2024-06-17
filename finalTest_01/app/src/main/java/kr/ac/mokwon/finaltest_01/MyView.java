package kr.ac.mokwon.finaltest_01;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyView extends SurfaceView {
    Bitmap x;
    public MyView(Context context) {
        super(context);
        setBackgroundColor(Color.YELLOW);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        x = BitmapFactory.decodeResource(getResources(), R.drawable.neko);
        Matrix m = new Matrix();
        m.preScale(1f, -1f);
        Bitmap mb = Bitmap.createBitmap(x, 0, 0, x.getWidth(), x.getHeight(), m, false);
        canvas.drawBitmap(mb, 0, 0, null);
    }
}
