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

public class BridalShowerActivity extends AppCompatActivity {
    ImageButton ButtonImage1, ButtonImage2, ButtonImage3, ButtonImage4;
    Button ButtonGo, ButtonBack;
    TextView TextBridalAppear;
    String Description1, Description2, Description3, Description4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridal_shower);
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

        TextBridalAppear=(TextView)findViewById(R.id.txtBrdalShower);
        ButtonImage1=(ImageButton)findViewById(R.id.imagebBridal1);
        Description1= "Code: C013. " +
                "Name: Chocolate Bridal Cupcake. " +
                "Price: Rs.110. " +
                " This is made by using Chocolate cake mixture and decorated by Vanilla icing and maroon colour fondant icing flower.";
        ButtonImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextBridalAppear.setText(Description1);
            }
        });

        ButtonImage2=(ImageButton)findViewById(R.id.imagebBridal2);
        Description2= "Code: C014. " +
                "Name: Romantic Pink Bridal Cupcake. " +
                "Price: Rs.120. " +
                " This is made by vanilla flavoured mixture and decorated by Pink and Gold fondant icing.";
        ButtonImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextBridalAppear.setText(Description2);
            }
        });

        ButtonImage3=(ImageButton)findViewById(R.id.imagebBridal3);
        Description3= "Code: C015. " +
                "Name: Emballages Bridal Cupcake. " +
                "Price: Rs.130. " +
                " This is made by using Raspberries and decorated by using Pink colour icing.";
        ButtonImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextBridalAppear.setText(Description3);
            }
        });

        ButtonImage4=(ImageButton)findViewById(R.id.imagebBridal4);
        Description4= "Code: C016. " +
                "Name: 'I Do' Bridal Cupcake. " +
                "Price: Rs.100. " +
                " This is made by using Vanilla flavoured mixture and decorated by using icing and crispy sugar white pearls.";
        ButtonImage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextBridalAppear.setText(Description4);
            }
        });

        ButtonGo=(Button)findViewById(R.id.btnBridalShowerGo);
        ButtonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BridalShowerActivity.this, OrderActivity.class));
            }
        });

        ButtonBack=(Button)findViewById(R.id.btnBridalShowerBack);
        ButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BridalShowerActivity.this, CupcakesActivity.class));
            }
        });
    }

}
