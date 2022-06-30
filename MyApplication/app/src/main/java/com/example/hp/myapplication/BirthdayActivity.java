package com.example.hp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class BirthdayActivity extends AppCompatActivity {
    ImageButton ButtonImage1, ButtonImage2, ButtonImage3, ButtonImage4;
    Button ButtonBack, ButtonGo;
    TextView TextBirthdayAppear;
    String Description1, Description2, Description3, Description4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);
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

        TextBirthdayAppear=(TextView)findViewById(R.id.txtBirthday);
        ButtonImage1=(ImageButton)findViewById(R.id.imagebBirthday1);
        Description1= "Code: C009. " +
                "Name: Little Elephant themed Cupcake. " +
                "Price: Rs.120. " +
                " This is made by using Vanilla mixture and decorated by fondant icing elephant.";
        ButtonImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextBirthdayAppear.setText(Description1);
            }
        });

        ButtonImage2=(ImageButton)findViewById(R.id.imagebBirthday2);
        Description2= "Code: C010. " +
                "Name: Choco Birthday Cupcake. " +
                "Price: Rs.100. " +
                " This is made by chocolate mixture and decorated by Vanilla Icing and marbles.";
        ButtonImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextBirthdayAppear.setText(Description2);
            }
        });

        ButtonImage3= (ImageButton)findViewById(R.id.imagebBirthday3);
        Description3= "Code: C011. " +
                "Name: Girly Birthday Cupcake. " +
                "Price: Rs.110. " +
                " This is made by vanilla cake mixture and decorated by Fondant Icing dress.";
        ButtonImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextBirthdayAppear.setText(Description3);
            }
        });

        ButtonImage4= (ImageButton)findViewById(R.id.imagebBirthday4);
        Description4= "Code: C012. " +
                "Name: Superman Birthday Cupcake. " +
                "Price: Rs.120. " +
                " This is made specially for boys by using Vanilla flavoured mixture and blue colour icing.";
        ButtonImage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextBirthdayAppear.setText(Description4);
            }
        });

        ButtonGo= (Button)findViewById(R.id.btnBirthdayGo);
        ButtonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BirthdayActivity.this, OrderActivity.class));
            }
        });

        ButtonBack= (Button)findViewById(R.id.btnBirthdayBack);
        ButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BirthdayActivity.this, CupcakesActivity.class));
            }
        });
    }

}
