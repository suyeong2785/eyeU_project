package com.example.eyeu;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class EyeRecoveryVideo extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_recovery_video);

            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.waterfall);

            videoView = findViewById(R.id.video);
            videoView.setVideoURI(uri);

            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    //비디오 시작
                    videoView.start();
                }
            });



    }

    //화면에 안보일때...
    @Override
    protected void onPause() {
        super.onPause();

        //비디오 일시 정지
        if(videoView !=null && videoView.isPlaying()) videoView.pause();
    }
    //액티비티가 메모리에서 사라질때..
    @Override
    protected void onDestroy() {
        super.onDestroy();
        //
        if(videoView!=null) videoView.stopPlayback();
    }
}