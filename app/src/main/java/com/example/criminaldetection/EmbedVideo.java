package com.example.criminaldetection;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.criminaldetection.databinding.ActivityEmbedVideoBinding;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;

public class EmbedVideo extends AppCompatActivity {

    ActivityEmbedVideoBinding activityEmbedVideoBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityEmbedVideoBinding = ActivityEmbedVideoBinding.inflate(getLayoutInflater());
        setContentView(activityEmbedVideoBinding.getRoot());

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        activityEmbedVideoBinding.actionbarVideo.actionTitle.setText("Video Player");


        activityEmbedVideoBinding.youtubeVideo.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
//                String videoId = "cUWTvbn7eCI";
                String videoId = "aWIAW1K4Abs";

                youTubePlayer.cueVideo(videoId, 0);
            }
        });


    }
}