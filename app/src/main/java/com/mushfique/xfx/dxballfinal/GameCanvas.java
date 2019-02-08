package com.mushfique.xfx.dxballfinal;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class GameCanvas extends View {

     int life=6;
    int score=0;
    int totalbrick;

    Paint paint,paint2;
    int x=0,y=0;
    public static int indix=1,indiy=1;
    public static double thita=1,alpha=1;
    public static int p=0,a=0,b=0;

    boolean firstTime=true;
    protected void calculateNextPos(Canvas canvas){

x+=indix*10*alpha;
        y+=indiy*10*thita;


    }
    protected void onDraw(Canvas canvas) {

if(life>0) {


    a = canvas.getWidth();
    b = canvas.getHeight();
    if (firstTime)

    {
        totalbrick=BallAndBrick.brickBuiud(MainActivity.level);
        p = a / 2 - 175;
        firstTime = false;
        gamePage.touch = false;




    }

    if (gamePage.touch == true) {

        if (Collision.WallCollision(x, y, a, b) == true) {
            if (x < 40)
                indix *= -1;
            if (x > a - 40)
                indix *= -1;
            if (y < b/20*2+40)
                indiy *= -1;
            if (y > b - 40)
                indiy *= -1;
        }


        if (x < 40)
            x = 39;
        if (x > a - 40)
            x = a - 39;
        if (y < b/20*2+40)
            y = b/20*2+39;
        if (y > b - 100)
            y = b - 99;
    } else {
        x = p + 175;
        y = b - 97;
    }


    calculateNextPos(canvas);
    score+=Collision.brickCollition(x, y, a, b);

    canvas.drawRGB(255, 255, 255);
    paint.setColor(Color.RED);
    paint.setStyle(Paint.Style.FILL);
    canvas.drawCircle(x, y, 40, paint);


    int j = 2, k = 0;
    for (int i = 0; i < 60; i++) {
        if (i % 6 == 0 && i != 0) {
            j++;
            k = 0;
        }
        if (BallAndBrick.brick[i] == 1) {
            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.FILL);

        } else if (BallAndBrick.brick[i] == 2) {
            paint.setColor(Color.BLUE);
            paint.setStyle(Paint.Style.FILL);

        }


        if (BallAndBrick.brick[i] > 0) {
            canvas.drawRect((a / 6) * k, (b / 20) * j, (a / 6) * (k + 1) - 1, (b / 20) * (j + 1) - 1, paint);

        }
        k++;

    }
    paint.setColor(Color.GRAY);
    paint.setStyle(Paint.Style.FILL);


    canvas.drawRect(0 + p, b - 70, 350 + p, b, paint);

    Collision.barCollition(x, y, p, b);

    if (y > b - 95) {
       // firstTime = true;
        gamePage.touch = false;
        p = a / 2 - 175;
        y=b-100;
        life-=1;
    }
    paint.setColor(Color.BLACK);
    paint.setTextSize(100);
    canvas.drawRect(0, 0, a, b/20*2, paint);
    paint.setColor(Color.WHITE);
    paint.setTextSize(100);
    canvas.drawText("LIFE:"+String.valueOf(life/2),a-300,140,paint);
    paint.setColor(Color.WHITE);
    paint.setTextSize(100);
    canvas.drawText("SCORE:"+String.valueOf(score*50),20,140,paint);




    if(totalbrick==score)
    {
        paint.setColor(Color.BLACK);
        paint.setTextSize(100);
        canvas.drawText("Congratulation!!",a/5,b/2,paint);
    }


}
        else
{
    paint.setColor(Color.BLACK);
    paint.setTextSize(100);
    canvas.drawText("Game Over",a/4+20,b/2,paint);

}


        invalidate();


    }

    public GameCanvas(Context context) {
        super(context);
        paint = new Paint();


    }

    public void gameOver()
    {


    }







}
