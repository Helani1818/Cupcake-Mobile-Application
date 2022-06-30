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

public class ValentinesDayActivity extends AppCompatActivity {
    ImageButton ButtonImage1, ButtonImage2, ButtonImage3, ButtonImage4;
    Button ButtonGo, ButtonBack;
    TextView TextValentineAppear;
    String Description1, Description2, Description3, Description4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valentines_day);
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

        TextValentineAppear=(TextView)findViewById(R.id.txtValentinesday);
        ButtonImage1=(ImageButton)findViewById(R.id.imagebValentine1);
        Description1="Code: C033. " +
                "Name: 'In Love' Valentine Cupcake. " +
                "Price: Rs.130. " +
                " This cupcake made by using Chocolate flavoured mixture. Used Pink colour icing and Pixley Berry to decorate it.";
        ButtonImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextValentineAppear.setText(Description1);
            }
        });

        ButtonImage2=(ImageButton)findViewById(R.id.imagebValentine2);
        Description2= "Code: C034. " +
                "Name: Choco Valentine Cupcake. " +
                "Price: Rs.110. " +
                " This cupcake made by using Dark Chocolate flavoured mixture. Used Chocolate icing and Hearts made by fondant icing to decorate it.";
        ButtonImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextValentineAppear.setText(Description2);
            }
        });

        ButtonImage3=(ImageButton)findViewById(R.id.imagebValentine3);
        Description3= "Code: C035. " +
                "Name: Rice Crispy Valentine Cupcake. " +
                "Price: Rs.100. " +
                " This cupcake made by using Rice Crispy. Used White colour icing and heart shaped Jujubes to decorate it.";
        ButtonImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextValentineAppear.setText(Description3);
            }
        });

        ButtonImage4=(ImageButton)findViewById(R.id.imagebValentine4);
        Description4= "Code: C036. " +
                "Name: Red Velvet Valentine Cupcake. " +
                "Price: Rs.130. " +
                " This cupcake made by using Red Velvet. White colour icing and Fondant Icing to decorate it.";
        ButtonImage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextValentineAppear.setText(Description4);
            }
        });

        ButtonGo=(Button)findViewById(R.id.btnValentinesdayGo);
        ButtonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ValentinesDayActivity.this, OrderActivity.class));
            }
        });

        ButtonBack=(Button)findViewById(R.id.btnValentineBack);
        ButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ValentinesDayActivity.this, CupcakesActivity.class));
            }
        });
    }

}
