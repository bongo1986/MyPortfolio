package com.example.greg.myportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSpotifyStreamer;
    private Button btnSuperScore;
    private Button btnLibrary;
    private Button btnBuildItBigger;
    private Button btnXYZReader;
    private Button btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSpotifyStreamer = (Button) findViewById(R.id.btnSpotifyStreamer);
        btnSuperScore = (Button) findViewById(R.id.Scores);
        btnLibrary = (Button) findViewById(R.id.Library);
        btnBuildItBigger = (Button) findViewById(R.id.BuildItBigger);
        btnXYZReader = (Button) findViewById(R.id.XYZReader);
        btnCapstone = (Button) findViewById(R.id.Capstone);

        btnSpotifyStreamer.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                displayToast("Spotify Streamer");
            }
        });
        btnSuperScore.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                displayToast("Football Scores App");
            }
        });
        btnLibrary.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                displayToast("Library App");
            }
        });
        btnBuildItBigger.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                displayToast("Build It Bigger");
            }
        });
        btnXYZReader.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                displayToast("XYZ Reader");
            }
        });
        btnCapstone.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                displayToast("Capstone");
            }
        });
    }
    private void displayToast(String text){
        Toast.makeText(getApplicationContext(),
                text, Toast.LENGTH_LONG).show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
