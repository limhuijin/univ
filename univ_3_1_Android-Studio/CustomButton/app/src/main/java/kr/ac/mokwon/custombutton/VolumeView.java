package kr.ac.mokwon.custombutton;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

public class VolumeView extends AppCompatImageView {
    double _angle;
    VolumeListener _listener;
    public interface VolumeListener{
        public void OnChanged(double angle);
    }

    public void SetOnVolumeListener(VolumeListener listener){
        _listener = listener;
    }

    //ctrl + o
    public VolumeView(@NonNull Context context) {
        super(context);
        setImageResource(R.drawable.volume);
    }

    public VolumeView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setImageResource(R.drawable.volume);
    }

    double GetAngle(float x, float y){
        float mx = x - (getWidth() / 2);
        float my = (getHeight() / 2) - y;
        return Math.atan2(mx, my) * 180 / Math.PI;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        _angle = GetAngle(event.getX(), event.getY());
        invalidate();
        _listener.OnChanged(_angle);
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.rotate((float) _angle, getWidth() / 2, getHeight() / 2);
        super.onDraw(canvas);
    }
}
