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

public class FarewellDayActivity extends AppCompatActivity {
    ImageButton ButtonImage1, ButtonImage2, ButtonImage3, ButtonImage4;
    Button ButtonGo, ButtonBack;
    TextView TextFarewellAppear;
    String Description1, Description2, Description3, Description4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farewell_day);
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

        TextFarewellAppear= (TextView)findViewById(R.id.txtFarewellDay);
        ButtonImage1=(ImageButton)findViewById(R.id.imagebFarewell1);
        Description1="Code: C021. " +
                "Name: Choco Farewell Cupcake. " +
                "Price: Rs.100. " +
                " This is made by Chocolate mixture and decorated by Vanilla icing and Rose Flower by Fondant icing.";
        ButtonImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextFarewellAppear.setText(Description1);
            }
        });

        ButtonImage2=(ImageButton)findViewById(R.id.imagebFarewell2);
        Description2= "Code: C022. " +
                "Name: Butterfly themed Farewell Cupcake. " +
                "Price: Rs.120. " +
                " This is made by using Chocolate flavoured mixture and decorated by piping royal icing.";
        ButtonImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextFarewellAppear.setText(Description2);
            }
        });

        ButtonImage3=(ImageButton)findViewById(R.id.imagebFarewell3);
        Description3= "Code: C023. " +
                "Name: 'Bye Bye' Farewell Cupcake. " +
                "Price: Rs.120. " +
                " This is made by using Vanilla flavoured mixture and decorated by using Vanilla and Gold colour icing.";
        ButtonImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextFarewellAppear.setText(Description3);
            }
        });

        ButtonImage4=(ImageButton)findViewById(R.id.imagebFarewell4);
        Description4= "Code: C024. " +
                "Name: Blackcurrant Farewell Cupcake. " +
                "Price: Rs.130. " +
                " This cupcake made by Vanilla flavoured mixture and Blackcurrant. White colour icing and Chocolate to decorate it.";
        ButtonImage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextFarewellAppear.setText(Description4);
            }
        });

        ButtonGo=(Button)findViewById(R.id.btnFarewellDayGo);
        ButtonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FarewellDayActivity.this, OrderActivity.class));
            }
        });

        ButtonBack=(Button)findViewById(R.id.btnFarewellBack);
        ButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FarewellDayActivity.this, CupcakesActivity.class));
            }
        });
    }

}
