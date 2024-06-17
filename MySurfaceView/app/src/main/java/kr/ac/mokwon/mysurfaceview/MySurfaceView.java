package kr.ac.mokwon.mysurfaceview;

import android.content.Context;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import androidx.annotation.NonNull;

public class MySurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    MyThread myThread;
    public MySurfaceView(Context context) {
        super(context);

        SurfaceHolder holder = getHolder();
        holder.addCallback(this);

        Ball[] balls = new Ball[10];
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
}
