package com.example.eyeu;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class eyeRecoveryVideo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_recovery_video);




            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.waterfall);

            VideoView videoView = findViewById(R.id.video);
            videoView.setVideoURI(uri);
            videoView.start();



    }

}