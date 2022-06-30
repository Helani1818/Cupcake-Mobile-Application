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

public class WeddingDayActivity extends AppCompatActivity {
    ImageButton ButtonImage1, ButtonImage2, ButtonImage3, ButtonImage4;
    Button ButtonGo, ButtonBack;
    TextView TextWeddingAppear;
    String Description1, Description2, Description3, Description4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wedding_day);
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

        TextWeddingAppear=(TextView)findViewById(R.id.txtWeddingDay);
        ButtonImage1=(ImageButton) findViewById(R.id.imagebWedding1);
        Description1= "Code: C037. " +
                "Name: Fruity Wedding Cupcake. " +
                "Price: Rs.120. " +
                " This cupcake made by using Cheese Cake mixture. Decorated by using Cherries and Berries.";
        ButtonImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextWeddingAppear.setText(Description1);
            }
        });

        ButtonImage2=(ImageButton)findViewById(R.id.imagebWedding2);
        Description2= "Code: C038. " +
                "Name: 'Mr & Mrs' Wedding Cupcake. " +
                "Price: Rs.120. " +
                " This cupcake made by using Vanilla flavoured mixture. Used White colour icing to decorate it.";
        ButtonImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextWeddingAppear.setText(Description2);
            }
        });

        ButtonImage3=(ImageButton)findViewById(R.id.imagebWedding3);
        Description3="Code: C039. " +
                "Name: Pearl Decorated Wedding Cupcake. " +
                "Price: Rs.130. " +
                " This cupcake made by using Vanilla flavoured mixture. Used White colour icing and Crispy Sugar Pearls to decorate it.";
        ButtonImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextWeddingAppear.setText(Description3);
            }
        });

        ButtonImage4=(ImageButton)findViewById(R.id.imagebWedding4);
        Description4= "Code: C040. " +
                "Name: Choco Wedding Cupcake. " +
                "Price: Rs.130. " +
                " This cupcake made by using Chocolate flavoured mixture. Used White colour icing and Crispy Sugar Pearls to decorate it.";
        ButtonImage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextWeddingAppear.setText(Description4);
            }
        });

        ButtonGo=(Button)findViewById(R.id.btnWeddingDayGo);
        ButtonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WeddingDayActivity.this, OrderActivity.class));
            }
        });

        ButtonBack=(Button)findViewById(R.id.btnWeddingBack);
        ButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WeddingDayActivity.this, CupcakesActivity.class));
            }
        });
    }

}
