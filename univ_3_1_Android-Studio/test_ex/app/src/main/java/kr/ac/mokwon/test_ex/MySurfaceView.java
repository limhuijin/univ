package kr.ac.mokwon.test_ex;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import androidx.annotation.NonNull;

public class MySurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    MyThread myThread;
    int count;
    public MySurfaceView(Context context) {
        super(context);
        count = 1;
        SurfaceHolder holder = getHolder();
        holder.addCallback(this);

        Ball[] balls = new  Ball[count];
        for(int i = 0; i < balls.length; i++){
            balls[i] = new Ball(10);
        }

        myThread = new MyThread(holder, balls);
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

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            count++;
            Ball[] Balls = myThread.getBalls();
            Ball[] newBalls = new Ball[count];

            for (int i = 0; i < Balls.length; i++) {
                newBalls[i] = Balls[i];
            }

            newBalls[count - 1] = new Ball(10);
            myThread.setBalls(newBalls);
            return true;
        }
        return super.onTouchEvent(event);
    }
}
