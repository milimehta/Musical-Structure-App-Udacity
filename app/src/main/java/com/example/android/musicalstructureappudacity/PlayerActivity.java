package com.example.android.musicalstructureappudacity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player);

        playing();
    }

    public void playing() {
        Intent artistIntent = getIntent();

        TextView artistTextView = findViewById(R.id.player_artist);
        String artistForPlaying = artistIntent.getStringExtra("artist");
        artistTextView.setText(artistForPlaying);

        TextView composerTextView = findViewById(R.id.player_composer);
        String composerForPlaying = artistIntent.getStringExtra("composer");
        composerTextView.setText(composerForPlaying);
    }
}
