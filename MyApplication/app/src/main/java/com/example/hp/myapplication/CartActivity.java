package com.example.hp.myapplication;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CartActivity extends AppCompatActivity {
    Button ButtonCancel, ButtonCartOk, ButtonView;
    TextView TextYOCategory, TextYOCode, TextYOQuantity, TextYOUPrice, TextYOCartNo;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
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

        ButtonCancel=(Button)findViewById(R.id.btnYourOrderCancel);
        ButtonCartOk=(Button)findViewById(R.id.btnYourOrderOk);
        ButtonView=(Button)findViewById(R.id.btnYourOrderShow);
        TextYOCartNo=(EditText)findViewById(R.id.txtYourOrdercartno);
        TextYOCategory=(TextView) findViewById(R.id.txtYourOrederCategory);
        TextYOCode=(TextView)findViewById(R.id.txtYourOrderCode);
        TextYOQuantity=(TextView)findViewById(R.id.txtYourOrderQuantity);
        TextYOUPrice=(TextView)findViewById(R.id.txtYourOrderUnitPrice);

        ButtonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "You have canceled the order.",Toast.LENGTH_LONG).show();
                startActivity(new Intent(CartActivity.this, MainActivity.class));
            }
        });

        ButtonCartOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CartActivity.this, OrderReceiptActivity.class));
            }
        });

        ButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewData();
            }
        });
    }

    protected void ViewData()
    {
        try {
            String cartno = TextYOCartNo.getText().toString().trim();
            String query2 = "select * from OrderTable where cartno='" +cartno + "';";
            db=openOrCreateDatabase("HNDMAD8210",Context.MODE_PRIVATE,null);
            Cursor result = db.rawQuery(query2, new String[]{});
            if (result.moveToFirst())
                do {
                    TextYOCategory.setText(result.getString(1));
                    TextYOCode.setText(result.getString(2));
                    TextYOUPrice.setText(result.getString(3));
                    TextYOQuantity.setText(result.getString(4));
                }while(result.moveToNext());
        }
        catch(Exception ex)
        {
            Toast.makeText(getApplicationContext(),"Error"+ex, Toast.LENGTH_LONG).show();
        }
    }
}


