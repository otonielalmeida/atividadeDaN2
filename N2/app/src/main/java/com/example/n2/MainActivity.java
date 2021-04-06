package com.example.n2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button btnJogo, btnPuzzle, btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJogo = findViewById(R.id.btnVelha);
        btnPuzzle = findViewById(R.id.btnPuzzle);
        btnSair = findViewById(R.id.btnSair)
    }
    btnJogo.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        abrirVelha();
    }
    });
btnPuzzle.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        abrirPuzzle();
    }
    });
btnPuzzle.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        abrirSair();
    }
    });
        private void abrirPuzzle(){
            intent janelag = new intent(this, Puzzle.class);
            startActivity(janelag);
        }
    private void abrirVelha() {
        Intent janelag = new Intent(this, Velha.class);
        startActivity(janelag);
    }
    private void abrirSair() {
        Intent janelag = new Intent(this, MainActivity.class);
        finish();
    }
    }
