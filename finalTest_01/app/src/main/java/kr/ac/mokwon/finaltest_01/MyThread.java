package kr.ac.mokwon.finaltest_01;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.SurfaceHolder;

public class MyThread extends Thread{
    SurfaceHolder holder;
    Ball[] balls;
    boolean isRunning;
    Bitmap neko;

    public MyThread(SurfaceHolder holder, Ball[] balls, Bitmap neko) {
        this.holder = holder;
        this.balls = balls;
        this.neko = neko;
    }

    @Override
    public void run() {
        while(isRunning){
            Canvas c = null;

            try{
                c = holder.lockCanvas();
                c.drawBitmap(neko, 0, 0, null);
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
}
