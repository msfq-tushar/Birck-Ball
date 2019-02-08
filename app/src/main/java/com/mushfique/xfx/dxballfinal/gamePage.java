package com.mushfique.xfx.dxballfinal;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class gamePage extends Activity {

    public static boolean touch = false;
    public static View v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        v=new GameCanvas(this);

        setContentView(v);


        Intent i = new Intent(this, BarControl.class);
        startService(i);
    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {

        int action = MotionEventCompat.getActionMasked(event);

        switch (action) {
            case (MotionEvent.ACTION_UP): {
                touch = true;



            }


            default:
                return super.onTouchEvent(event);
        }


    }

    @Override
    public  void onDestroy()
    {
        super.onDestroy();

        Intent i = new Intent(this, BarControl.class);
        stopService(i);

    }



}