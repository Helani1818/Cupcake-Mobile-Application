package com.example.hp.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AdminInterfaceActivity extends AppCompatActivity {

    Button ButtonCupcakeInterface, ButtonOrderInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_interface);
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

        ButtonCupcakeInterface=(Button)findViewById(R.id.btnAICupcakeInterface);

        ButtonCupcakeInterface.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminInterfaceActivity.this, CupcakeInterfaceActivity.class));
            }
        });

        ButtonOrderInterface=(Button)findViewById(R.id.btnAIOrderInterface);
        ButtonOrderInterface.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdminInterfaceActivity.this, OrderInterfaceActivity.class));
            }
        });
    }
}
