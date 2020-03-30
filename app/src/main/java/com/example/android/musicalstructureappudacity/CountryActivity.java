package com.example.android.musicalstructureappudacity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CountryActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_list);


        ArrayList<Artist> artists = new ArrayList<Artist>();

        artists.add(new Artist("Taylor Swift",
                "Back To December"));
        artists.add(new Artist("Taylor Swift",
                "Begin Again"));
        artists.add(new Artist("Taylor Swift",
                "Red"));
        artists.add(new Artist("Taylor Swift",
                "Love Story"));
        artists.add(new Artist("Taylor Swift",
                "Cornelia Street"));
        artists.add(new Artist("Taylor Swift",
                "Speak Now"));
        artists.add(new Artist("Taylor Swift",
                "Fifteen"));
        artists.add(new Artist("Taylor Swift",
                "Fearless"));
        artists.add(new Artist("Taylor Swift",
                "You Belong With Me"));
        artists.add(new Artist("Taylor Swift",
                "We Are Never Getting Back Together"));

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
