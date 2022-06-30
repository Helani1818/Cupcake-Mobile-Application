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
import android.widget.Toast;

public class AnniversaryDayActivity extends AppCompatActivity {
    ImageButton ButtonImage1, ButtonImage2, ButtonImage3, ButtonImage4;
    Button ButtonGo, ButtonBack;
    TextView TextAnniverasryAppear;
    String Description1, Description2, Description3, Description4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anniversary_day);
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

        TextAnniverasryAppear=(TextView)findViewById(R.id.txtAnniversaryDay);
        ButtonImage1 = (ImageButton) findViewById(R.id.imagebAnniversary1);
        Description1 = "Code: C001. " +
                "Name: Fruity Anniversary Cupcake. " +
                "Price: Rs.120. " +
                " This is made by using Almonds and some fruits like Dates and Raspberry. There is a slice of chocolate on the top.";
        ButtonImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextAnniverasryAppear.setText(Description1);
            }
        });

        ButtonImage2 = (ImageButton) findViewById(R.id.imagebAnniversary2);
        Description2 = "Code: C002. " +
                " Name: Choco Anniversary Cupcake. " +
                "Price: Rs.100. " +
                " This is made by Chocolate. Decorated by Chocolate Icing and Fondant Icing.";
        ButtonImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextAnniverasryAppear.setText(Description2);
            }
        });

        ButtonImage3=(ImageButton)findViewById(R.id.imagebAnniversary3);
        Description3= "Code: C003. " +
                " Name: Mustachos Anniversary Cupcake. " +
                "Price: Rs.120. " +
                " This is made by Chocolate. Decorated by Chocolate Icing and Fondant Icing.";
        ButtonImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextAnniverasryAppear.setText(Description3);
            }
        });

        ButtonImage4=(ImageButton)findViewById(R.id.imagebAnniversary4);
        Description4= "Code: C004. " +
                " Name: Gold Topped Anniversary Cupcake. " +
                "Price: Rs.130. " +
                " This is made by Butterscotch. Decorated by Gold colour fondant flower and Vanilla Icing. ";
        ButtonImage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextAnniverasryAppear.setText(Description4);
            }
        });

        ButtonGo=(Button)findViewById(R.id.btnAnniversaryDayGo);
        ButtonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AnniversaryDayActivity.this, OrderActivity.class));
            }
        });

        ButtonBack=(Button)findViewById(R.id.btnAnniversaryBack);
        ButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AnniversaryDayActivity.this, CupcakesActivity.class));
            }
        });

    }
}
