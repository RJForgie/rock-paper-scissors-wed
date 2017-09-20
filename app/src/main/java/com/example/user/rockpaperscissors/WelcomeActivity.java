package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WelcomeActivity extends AppCompatActivity {

    Button playButton;
    EditText nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


    }

//    public void onPlayButtonClicked(View playButton){
//        Intent intent = new Intent(this, PlayActivity.class);
//        startActivity(intent);
//    }

    public void onPlayButtonClicked(View button) {
        Intent intent = new Intent(this, PlayActivity.class);
        String name = nameText.getText().toString();
        intent.putExtra("name", name );
        startActivity(intent);

        startActivity(intent);

    }
}
