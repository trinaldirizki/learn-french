package com.permana.learnfrench;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000,1000){

            @Override
            public void onTick(long millisUntilFinished) {
                Log.i("Seconds left", String.valueOf(millisUntilFinished /1000));
            }

            @Override
            public void onFinish() {
                Log.i("Timer finished", "Countdown finished`");
            }
        }.start();
    }

    public void clickPhrase(View view){
        String ourId = view.getResources().getResourceEntryName(view.getId());
        int resourceId = getResources().getIdentifier(ourId,"raw","com.permana.learnfrench");

        MediaPlayer mediaPlayer = MediaPlayer.create(this,resourceId);
        mediaPlayer.start();
    }
}
