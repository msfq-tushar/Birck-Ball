package com.mushfique.xfx.dxballfinal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by XFX on Dec/16/16.
 */

public class BarControl extends Service implements SensorEventListener{
    AudioManager am;
    SensorManager sm;
    Sensor s,s1;

    @Override
    public void onCreate()
    {
        sm=(SensorManager)getSystemService(SENSOR_SERVICE);


        s1=sm.getDefaultSensor(Sensor.TYPE_GRAVITY);
        sm.registerListener(this,s1,SensorManager.SENSOR_DELAY_FASTEST);

        Toast.makeText(this,"serviece on",Toast.LENGTH_SHORT).show();


    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onSensorChanged(SensorEvent event) {

            if (s1.getType() == Sensor.TYPE_GRAVITY) {
                if (event.values[0] < -1) {
                    GameCanvas.p+=10;

                    if(GameCanvas.p>GameCanvas.a-350)
                        GameCanvas.p=GameCanvas.a-350;

                }
                else if(event.values[0]>1)
                {
                    GameCanvas.p-=10;
                    if(GameCanvas.p<0)
                        GameCanvas.p=0;

                }




            }
    }
    @Override
   public void onDestroy()

    {
        sm.unregisterListener(this);
        sm.unregisterListener(this);


    }
    @Override
    public int onStartCommand(Intent intent,int flags,int startId)
    {
        return START_STICKY;
    }


    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
