package com.example.x17138736.recipeeze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Init our variables
    ImageButton italianButton;
    ImageButton chinesButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set our variables
        italianButton = findViewById(R.id.italianBtn);

        // Put listeners on our images
        italianButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "it works", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), ItalianActivity.class);
                startActivity(intent);
            }
        });


    }
}
