package com.kim9212.tomom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;
import com.google.android.youtube.player.YouTubePlayerView;

public class YoutubeActivity extends AppCompatActivity {

    YouTubePlayerView youTubePlayerView;
   YouTubePlayerFragment youTubePlayerFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

       youTubePlayerFragment= (YouTubePlayerFragment)getFragmentManager().findFragmentById(R.id.youtubeFragment);
       youTubePlayerFragment.initialize("first", new YouTubePlayer.OnInitializedListener() {
           @Override
           public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
               youTubePlayer.loadVideo("hpSXpH5erqY");
           }

           @Override
           public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

           }
       });

    }
}