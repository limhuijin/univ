package kr.ac.mokwon.finaltest_02;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;

public class MySurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    MyThread myThread;
    Ball ball;
    public MySurfaceView(Context context) {
        super(context);

        SurfaceHolder holder = getHolder();
        holder.addCallback(this);

        ball = new Ball(10);

        myThread = new MyThread(holder, ball);

    }

    public MySurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        SurfaceHolder holder = getHolder();
        holder.addCallback(this);

        ball = new Ball(10);

        myThread = new MyThread(holder, ball);
    }

    @Override
    public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
        myThread.SetRunnring(true);
        myThread.start();
    }
    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
        myThread.SetRunnring(false);
        boolean retry = true;
        while(retry){
            try {
                myThread.join();
                retry = false;
            }catch (InterruptedException e){

            }
        }
    }
    @Override
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }


    public void btn01(){
        ball.x -= 10;
    }

    public void btn02(){
        ball.y += 10;
    }
    public void btn03(){
        ball.y -= 10;
    }
    public void btn04(){
        ball.x += 10;
    }

}