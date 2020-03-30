package com.example.android.musicalstructureappudacity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DanceActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_list);


        ArrayList<Artist> artists = new ArrayList<Artist>();

        artists.add(new Artist("Selena Gomez", "A Year Without Rain"));
        artists.add(new Artist("Selena Gomez", "Who Says"));
        artists.add(new Artist("Selena Gomez", "Hit The Lights"));
        artists.add(new Artist("Selena Gomez", "Feel Me"));
        artists.add(new Artist("Selena Gomez", "Vulnerable"));
        artists.add(new Artist("Selena Gomez", "Good For You"));
        artists.add(new Artist("Selena Gomez", "Cologne"));
        artists.add(new Artist("Ariana Grande", "7 Rings"));
        artists.add(new Artist("Ariana Grande", "Breathin"));
        artists.add(new Artist("Ariana Grande", "Break Free"));

        ArtistAdapter adapter = new ArtistAdapter(this, artists);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        Artist currentArtist = (Artist) adapterView.getItemAtPosition(position);

        String artistForPlaying = currentArtist.getArtist();
        String composerForPlaying = currentArtist.getNameOfComposer();

        Intent artistIntent = new Intent(this, PlayerActivity.class);
        artistIntent.putExtra("artist", artistForPlaying);
        artistIntent.putExtra("composer", composerForPlaying);
        startActivity(artistIntent);
    }
}
