package kr.ac.mokwon.finaltest_02;

import android.graphics.Canvas;
import android.graphics.Color;
import android.view.SurfaceHolder;

public class MyThread extends Thread{
    SurfaceHolder holder;
    Ball ball;
    boolean isRunning;

    public MyThread(SurfaceHolder holder, Ball ball) {
        this.holder = holder;
        this.ball = ball;
    }

    @Override
    public void run() {
        while(isRunning){
            Canvas c = null;

            try{
                c = holder.lockCanvas();
                synchronized (holder){
                        ball.Draw(c);
                }
            }finally {
                if(c != null){
                    holder.unlockCanvasAndPost(c);
                }
            }
        }
    }

    public void SetRunnring(Boolean b){
        isRunning = b;
    }
}
