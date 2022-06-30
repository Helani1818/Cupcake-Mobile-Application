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

public class MothersDayActivity extends AppCompatActivity {
    ImageButton ButtonImage1, ButtonImage2, ButtonImage3, ButtonImage4;
    Button ButtonGo, ButtonBack;
    TextView TextMothersDayAppear;
    String Description1, Description2, Description3, Description4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mothers_day);
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

        TextMothersDayAppear=(TextView)findViewById(R.id.txtMothersday);
        ButtonImage1= (ImageButton)findViewById(R.id.imagebmother1);
        Description1= "Code: C029. " +
                "Name: Strawberry Mother's Day Cupcake. " +
                "Price: Rs.110. " +
                " This cupcake made by using Vanilla flavoured mixture. UsedWhite colour icing and Strawberry to decorate it.";
        ButtonImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextMothersDayAppear.setText(Description1);
            }
        });

        ButtonImage2=(ImageButton)findViewById(R.id.imagebmother2);
        Description2= "Code: C030. " +
                "Name: Rainbow themed Cupcake. " +
                "Price: Rs.100. " +
                " This cupcake made by using Vanilla flavoured mixture. Used Rainbow colours icing to decorate it.";
        ButtonImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextMothersDayAppear.setText(Description2);
            }
        });

        ButtonImage3=(ImageButton)findViewById(R.id.imagebmother3);
        Description3= "Code: C031. " +
                "Name: Fruity Mother's Day Cupcake. " +
                "Price: Rs.120. " +
                " This cupcake made by using Chocolate flavoured mixture. Used White colour icing and Fruits to decorate it.";
        ButtonImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextMothersDayAppear.setText(Description3);
            }
        });

        ButtonImage4=(ImageButton)findViewById(R.id.imagebmother4);
        Description4= "Code: C032. " +
                "Name: Flower themed Cupcake. " +
                "Price: Rs.100. " +
                " This cupcake made by using Vanilla flavoured mixture. Used Piping royal icing to decorate it.";
        ButtonImage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextMothersDayAppear.setText(Description4);
            }
        });

        ButtonGo=(Button)findViewById(R.id.btnMothersdayGo);
        ButtonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MothersDayActivity.this, OrderActivity.class));
            }
        });

        ButtonBack=(Button)findViewById(R.id.btnMothersdayBack);
        ButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MothersDayActivity.this, CupcakesActivity.class));
            }
        });
    }

}
