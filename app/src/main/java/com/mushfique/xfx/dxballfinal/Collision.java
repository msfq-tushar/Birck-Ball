package com.mushfique.xfx.dxballfinal;

/**
 * Created by XFX on Dec/20/16.
 */

public class Collision  {
    public static boolean WallCollision(int x,int y,int wallx,int wally)
    {   if(x<40)
        {

        return true;
        }
        if(y<wally/20*2+40)
        {

            return true;
        }
        if(x>wallx-40)
        {

            return true;
        }
        if(y>wally-40)
        {

            return true;
        }
        return false;
    }


    public static int brickCollition(int x,int y,int a, int b)
    {
        int j=2,k=0;
        for(int i=0;i<60;i++)
        {
            if(i%6==0&&i!=0)
            {
                j++;
                k=0;
            }

if(BallAndBrick.brick[i]>0)
{
            if(x>(a/6)*k-40&&x<(a/6)*(k+1)-1+40&&y>(b/20)*j-40&&y<(b/20)*(j+1)-1+40)
            {
                if(x<(a/6)*k||x>(a/6)*(k+1)-1)
                GameCanvas.indix*=-1;

                if(y<(b/20)*j||y>(b/20)*(j+1)-1)
                    GameCanvas.indiy*=-1;

                BallAndBrick.brick[i]--;
             return 1;
            }





}

            k++;

        }

        return 0;
    }

    public static void barCollition(int x,int y,int p,int b)
    {
        if(x>p-40&&x<p+350+40&&y>b-70-40&&y<b+40)
        {
            if(x<p||x>p+350-1)
            {
                GameCanvas.indix*=-1;

            }


            if(y<b||y>b-70-1)
                GameCanvas.indiy*=-1;

            if(x<p+80||x>p+350-80-1)
            {
                GameCanvas.thita=.87;
                GameCanvas.alpha=1.5;
            }
            else if(x<p+150||x>p+350-150-1)
            {
                GameCanvas.thita=1.5;
                GameCanvas.alpha=.87;
            }

            else
            {
                GameCanvas.thita=1.23;
                GameCanvas.alpha=1.23;
            }




        }
    }


}
