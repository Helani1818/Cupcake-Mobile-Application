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

public class ChristmasDayActivity extends AppCompatActivity {
    ImageButton ButtonImage1, ButtonImage2, ButtonImage3, ButtonImage4;
    Button ButtonGo, ButtonBack;
    TextView TextChristmasAppear;
    String Description1, Description2, Description3, Description4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_christmas_day);
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

        TextChristmasAppear=(TextView)findViewById(R.id.txtChristmasDay);
        ButtonImage1=(ImageButton)findViewById(R.id.imagebChristmas1);
        Description1= "Code: C017. " +
                "Name: Rain Deer Christmas Cupcake. " +
                "Price: Rs.120. " +
                " This is made by using chocolate mixture and also used chocolate icing to decorate.";
        ButtonImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextChristmasAppear.setText(Description1);
            }
        });

        ButtonImage2=(ImageButton)findViewById(R.id.imagebChristmas2);
        Description2= "Code: C018. " +
                "Name: Christmas Tree Cupcake. " +
                "Price: Rs.100. " +
                " This is made by using Almonds and some fruits like Cherry and Raspberry.Here used some M&M to decorate it.";
        ButtonImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextChristmasAppear.setText(Description2);
            }
        });

        ButtonImage3= (ImageButton)findViewById(R.id.imagebChristmas3);
        Description3= "Code: C019. " +
                "Name: Snowman Christmas Cupcake. " +
                "Price: Rs.110. " +
                " This is made by using Love Cake mixture.Here used some Fondant Icing  to decorate it.";
        ButtonImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextChristmasAppear.setText(Description3);
            }
        });

        ButtonImage4=(ImageButton)findViewById(R.id.imagebChristmas4);
        Description4= "Code: C020. " +
                "Name: Santa Clause Cupcake. " +
                "Price: Rs.120. " +
                " This is made by using Chocolate and Almonds.Here used some Sugar Spread to decorate the cupcake.";
        ButtonImage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextChristmasAppear.setText(Description4);
            }
        });

        ButtonGo=(Button)findViewById(R.id.btnChristmasDayGo);
        ButtonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChristmasDayActivity.this, OrderActivity.class));
            }
        });

        ButtonBack=(Button)findViewById(R.id.btnChristmasBack);
        ButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChristmasDayActivity.this, CupcakesActivity.class));
            }
        });
    }

}
