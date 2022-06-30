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

public class BabyShowerActivity extends AppCompatActivity {
    ImageButton ButtonImage1, ButtonImage2, ButtonImage3, ButtonImage4;
    Button ButtonGo, ButtonBack;
    String Description1, Description2, Description3, Description4;
    TextView TextBabyAppear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby_shower);
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

        TextBabyAppear= (TextView)findViewById(R.id.txtBabyShower);
        ButtonImage1=(ImageButton)findViewById(R.id.imagebBaby1);
        Description1= "Code: C005. " +
                " Name: Birdy Themed Baby Shower Cupcake. " +
                "Price: Rs.100. " +
                " The Cupcake is made by using Love Cake mixture. Decorated by Vanilla Icing and a Birdy by using Fondant Icing.";
        ButtonImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextBabyAppear.setText(Description1);
            }
        });

        ButtonImage2=(ImageButton)findViewById(R.id.imagebBaby2);
        Description2= "Code: C006. " +
                " Name: Raspberry Baby Shower Cupcake. " +
                "Price: Rs.120. " +
                " The Cupcake is made by using Raspberry and Almonds. It is decorated by light pink Icing and a flower by using Fondant Icing.";
        ButtonImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextBabyAppear.setText(Description2);
            }
        });

        ButtonImage3=(ImageButton)findViewById(R.id.imagebBaby3);
        Description3= "Code: C007. " +
                " Name: Baby Shower Cupcake for a Baby Girl. " +
                "Price: Rs.100. " +
                " The Cupcake is made by Chocolate. Decorated by Pink colour Icing. This cupcake is specially made for a Baby Shower to a Girl ";
        ButtonImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextBabyAppear.setText(Description3);
            }
        });

        ButtonImage4= (ImageButton)findViewById(R.id.imagebBaby4);
        Description4= "Code: C008. " +
                " Name: Baby Shower Cupcake for a Baby Boy. " +
                "Price: Rs.110. " +
                " The Cupcake is made by Vanilla Cake mixture. Decorated by Blue colour Icing and a baby had made by using Fondant Icing.";
        ButtonImage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextBabyAppear.setText(Description4);
            }
        });

        ButtonGo=(Button)findViewById(R.id.btnBabyShowerGo);
        ButtonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BabyShowerActivity.this, OrderActivity.class));
            }
        });

        ButtonBack= (Button)findViewById(R.id.btnBabyShowerBack);
        ButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BabyShowerActivity.this, CupcakesActivity.class));
            }
        });
    }

}
