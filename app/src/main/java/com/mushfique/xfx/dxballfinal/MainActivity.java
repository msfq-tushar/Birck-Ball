package com.mushfique.xfx.dxballfinal;

import android.content.Intent;
import android.provider.Settings;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

public static int level=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        RelativeLayout r=(RelativeLayout)findViewById(R.id.Dxball);
        r.setVisibility(View.VISIBLE);
        LinearLayout l=(LinearLayout)findViewById(R.id.Levelselect);
        l.setVisibility(View.GONE);
        r=(RelativeLayout)findViewById(R.id.Gameover);
        r.setVisibility(View.GONE);

        Button b=(Button)findViewById(R.id.Start);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RelativeLayout r=(RelativeLayout)findViewById(R.id.Dxball);
                r.setVisibility(View.GONE);
                LinearLayout l=(LinearLayout)findViewById(R.id.Levelselect);
                l.setVisibility(View.VISIBLE);
                r=(RelativeLayout)findViewById(R.id.Gameover);
                r.setVisibility(View.GONE);

            }
        });
        b=(Button)findViewById(R.id.Exit);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.exit(1);

            }
        });
        b=(Button)findViewById(R.id.Level1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level=1;
                m();

            }
        });
        b=(Button)findViewById(R.id.Level2);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                level=2;
                m();
            }
        });
        b=(Button)findViewById(R.id.Level3);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level=3;
                m();
            }
        });
        b=(Button)findViewById(R.id.Level4);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level=4;
                m();
            }
        });
        b=(Button)findViewById(R.id.Level5);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level=5;
                m();
            }
        });
        b=(Button)findViewById(R.id.Level6);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level=6;
                m();
            }
        });
        b=(Button)findViewById(R.id.Level7);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level=7;
                m();
            }
        });
        b=(Button)findViewById(R.id.Level8);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level=8;
                m();
            }
        });
        b=(Button)findViewById(R.id.Level9);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level=9;
                m();
            }
        });
        b=(Button)findViewById(R.id.Level10);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level=10;
                m();
            }
        });
        b=(Button)findViewById(R.id.Restart);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
m();
            }
        });
        b=(Button)findViewById(R.id.MainMenu);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RelativeLayout r=(RelativeLayout)findViewById(R.id.Dxball);
                r.setVisibility(View.VISIBLE);
                LinearLayout l=(LinearLayout)findViewById(R.id.Levelselect);
                l.setVisibility(View.GONE);
                r=(RelativeLayout)findViewById(R.id.Gameover);
                r.setVisibility(View.GONE);

            }
        });



    }

    public void m()
    {Intent i = new Intent(this, gamePage.class);
        RelativeLayout r=(RelativeLayout)findViewById(R.id.Dxball);
        r.setVisibility(View.GONE);
        LinearLayout l=(LinearLayout)findViewById(R.id.Levelselect);
        l.setVisibility(View.GONE);
        r=(RelativeLayout)findViewById(R.id.Gameover);
        r.setVisibility(View.VISIBLE);

        startActivity(i);}

}