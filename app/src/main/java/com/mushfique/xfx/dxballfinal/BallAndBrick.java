package com.mushfique.xfx.dxballfinal;

/**
 * Created by XFX on Dec/20/16.
 */

public class BallAndBrick {
     public static int brick[]=new int[1000];

     public static int brickBuiud(int x)
     {   int totalbrick=0;
         int a=0;
         for(int i=0;i<100;i++)
         {


             a%=(10+x);
             a+=x;
             brick[i]=a%3;

             if(x>2&&x<7)
             {
                 if(brick[i]==0)
                     brick[i]=1;
                 else if(brick[i]==1)
                     brick[i]=2;
                 else if(brick[i]==2)
                     brick[i]=0;

             }
             if(x>6&&x<10)
             {
                 if(brick[i]==0)
                     brick[i]=2;
                 else if(brick[i]==1)
                     brick[i]=0;
                 else if(brick[i]==2)
                     brick[i]=1;

             }
             if(x==10)
                 brick[i]=2;

             totalbrick+=brick[i];
         }

         return totalbrick;
     }


}
