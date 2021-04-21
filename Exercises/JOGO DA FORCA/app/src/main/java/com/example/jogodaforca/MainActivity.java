package com.example.jogodaforca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1Player = findViewById(R.id.b1Jogador);
        Button b2Player = findViewById(R.id.b2Jogador);
        Button bSair = findViewById(R.id.bSair);

        b1Player.setOnClickListener(this);
        b2Player.setOnClickListener(this);
        bSair.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.b1Jogador:
                Intent i = new Intent(MainActivity.this, GameActivity.class);
                startActivity(i);
                break;

            case R.id.b2Jogador:
                Toast.makeText(getApplicationContext(), "2 jogadores", Toast.LENGTH_SHORT).show();
                break;

            case R.id.bSair:
                finish();

        }
    }
}