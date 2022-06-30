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

public class GraduationDayActivity extends AppCompatActivity {
ImageButton ButtonImage1, ButtonImage2, ButtonImage3, ButtonImage4;
Button ButtonGo, ButtonBack;
TextView TextGraduationAppear;
String Description1, Description2, Description3, Description4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graduation_day);
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

        TextGraduationAppear=(TextView)findViewById(R.id.txtGraduationDay);
        ButtonImage1=(ImageButton)findViewById(R.id.imagebGraduation1);
        Description1= "Code: C025. " +
                "Name: Greeny Graduation Cupcake. " +
                "Price: Rs.110. " +
                " This cupcake made by using Vanilla flavoured mixture. Green colour icing and Fondant icing Oak Hole Cap to decorate it.";
        ButtonImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextGraduationAppear.setText(Description1);
            }
        });

        ButtonImage2=(ImageButton)findViewById(R.id.imagebGraduation2);
        Description2= "Code: C026. " +
                "Name: Black and Gold themed Cupcake. " +
                "Price: Rs.120. " +
                " This cupcake made by using Chocolate flavoured mixture. Gold colour icing had used to decorate it.";
        ButtonImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextGraduationAppear.setText(Description2);
            }
        });

        ButtonImage3=(ImageButton)findViewById(R.id.imagebGraduation3);
        Description3= "Code: C027. " +
                "Name: Cheese cake Graduation Cupcake. " +
                "Price: Rs.100. " +
                " This cupcake made by using cheese cake mixture and blackcurrant. Decorated by using Oak Hole Cap made by Fondant Icing.";
        ButtonImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextGraduationAppear.setText(Description3);
            }
        });

        ButtonImage4=(ImageButton)findViewById(R.id.imagebGraduation4);
        Description4= "Code: C028. " +
                "Name: Red Velvet Graduation Cupcake. " +
                "Price: Rs.130. " +
                " This cupcake made by using Vanilla flavoured mixture and Red Velvet. Used White colour icing and Fondant Icing to decorate it.";
        ButtonImage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextGraduationAppear.setText(Description4);
            }
        });

        ButtonGo= (Button)findViewById(R.id.btnGraduationDayGo);
        ButtonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GraduationDayActivity.this, OrderActivity.class));
            }
        });

        ButtonBack=(Button)findViewById(R.id.btnGraduationBack);
        ButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GraduationDayActivity.this, CupcakesActivity.class));
            }
        });
    }

}
