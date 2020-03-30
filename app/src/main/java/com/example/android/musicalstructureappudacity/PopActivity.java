package com.example.android.musicalstructureappudacity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PopActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_list);


        ArrayList<Artist> artists = new ArrayList<Artist>();

        artists.add(new Artist("Ariana Grande", "My Everything"));
        artists.add(new Artist("Alan Walker", "Faded"));
        artists.add(new Artist("Alan Walker", "End of Time"));
        artists.add(new Artist("Alan Walker", "Dark Side"));
        artists.add(new Artist("Alan Walker", "Alone"));
        artists.add(new Artist("Demi Lovato", "Sorry Not Sorry"));
        artists.add(new Artist("Demi Lovato", "Sober"));
        artists.add(new Artist("The Chainsmokers", "Closer"));
        artists.add(new Artist("The Chainsmokers", "This Feeling"));
        artists.add(new Artist("The Chainsmokers", "All We Know"));

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