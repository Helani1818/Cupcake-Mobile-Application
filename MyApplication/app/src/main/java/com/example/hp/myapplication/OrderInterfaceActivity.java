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

public class OrderInterfaceActivity extends AppCompatActivity {
    Button ButtonOIOk, ButtonOIView;
    TextView TextOICode, TextOIUPrice, TextOIQuantity, TextOIAddress, TextOICartNo;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_interface);
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

        ButtonOIOk=(Button)findViewById(R.id.btnOIOK);

        ButtonOIOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OrderInterfaceActivity.this, OrderReceiptActivity.class));
            }
        });

        TextOICartNo=(EditText)findViewById(R.id.txtOIcartno);
        TextOICode=(TextView)findViewById(R.id.txtOICupcakeCode);
        TextOIUPrice=(TextView)findViewById(R.id.txtOIUnitPrice);
        TextOIQuantity=(TextView)findViewById(R.id.txtOIQuantity);
        TextOIAddress=(TextView)findViewById(R.id.txtOIAddress);

        ButtonOIView=(Button)findViewById(R.id.btnOIView);
        ButtonOIView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String cartno = TextOICartNo.getText().toString().trim();
                    String query2 = "Select*from OrderTable where cartno='" +cartno+ "';";
                    db=openOrCreateDatabase("HNDMAD8210",Context.MODE_PRIVATE,null);
                    Cursor result = db.rawQuery(query2, new String[]{});
                    if (result.moveToFirst())
                        do {

                            TextOICode.setText(result.getString(2));
                            TextOIUPrice.setText(result.getString(3));
                            TextOIQuantity.setText(result.getString(4));
                            TextOIAddress.setText(result.getString(5));
                        }while(result.moveToNext());
                }
                catch(Exception ex)
                {
                    Toast.makeText(getApplicationContext(),"Error"+ex, Toast.LENGTH_LONG).show();
                }
            }
        });


    }

}
