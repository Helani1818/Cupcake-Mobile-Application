package com.example.hp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class CupcakesActivity extends AppCompatActivity {
    Button ButtonBirthday, ButtonMothersday, ButtonBridal, ButtonBaby, ButtonFarewell, ButtonGraduation, ButtonWedding, ButtonValentine, ButtonAnniversary, ButtonChristmas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cupcakes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ButtonAnniversary=(Button)findViewById(R.id.btnCupcakeAnniversary);
        ButtonAnniversary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CupcakesActivity.this, AnniversaryDayActivity.class));
            }
        });

        ButtonBaby=(Button)findViewById(R.id.btnCupcakeBaby);
        ButtonBaby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CupcakesActivity.this, BabyShowerActivity.class));
            }
        });

        ButtonBirthday=(Button)findViewById(R.id.btnCupcakeBirthday);
        ButtonBirthday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CupcakesActivity.this, BirthdayActivity.class));
            }
        });

        ButtonBridal=(Button)findViewById(R.id.btnCupcakeBridal);
        ButtonBridal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CupcakesActivity.this, BridalShowerActivity.class));
            }
        });

        ButtonChristmas=(Button)findViewById(R.id.btnCupcakeChristmas);
        ButtonChristmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CupcakesActivity.this, ChristmasDayActivity.class));
            }
        });

        ButtonFarewell=(Button)findViewById(R.id.btnCupcakeFarewell);
        ButtonFarewell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CupcakesActivity.this, FarewellDayActivity.class));
            }
        });

        ButtonGraduation=(Button)findViewById(R.id.btnCupcakeGraduation);
        ButtonGraduation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CupcakesActivity.this, GraduationDayActivity.class));
            }
        });

        ButtonMothersday=(Button)findViewById(R.id.btnCupcakeMother);
        ButtonMothersday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CupcakesActivity.this, MothersDayActivity.class));
            }
        });

        ButtonValentine=(Button)findViewById(R.id.btnCupcakeValentine);
        ButtonValentine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CupcakesActivity.this, ValentinesDayActivity.class));
            }
        });

        ButtonWedding=(Button)findViewById(R.id.btnCupcakeWedding);
        ButtonWedding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CupcakesActivity.this, WeddingDayActivity.class));
            }
        });
    }

}
