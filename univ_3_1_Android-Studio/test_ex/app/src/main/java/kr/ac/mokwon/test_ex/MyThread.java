package kr.ac.mokwon.test_ex;

import android.graphics.Canvas;
import android.graphics.Color;
import android.view.SurfaceHolder;

public class MyThread extends Thread{
    SurfaceHolder holder;
    Ball[] balls;
    boolean isRunning;

    public MyThread(SurfaceHolder holder, Ball[] balls) {
        this.holder = holder;
        this.balls = balls;
    }

    @Override
    public void run() {
        while(isRunning){
            Canvas c = null;

            try{
                c = holder.lockCanvas();
                c.drawColor(Color.BLACK);
                synchronized (holder){
                    for(Ball b : balls){
                        b.Draw(c);
                    }
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

    public Ball[] getBalls() {
        return balls;
    }

    public void setBalls(Ball[] balls) {
        this.balls = balls;
    }
}
