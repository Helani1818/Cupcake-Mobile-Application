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
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {
    Button ButtonBuy, ButtonOBack;
    Spinner SpinnerOrderCategory, SpinnerOrderCode;
    TextView TextPrice, TextQuantity, TextAddress, TextTelNo, TextCartNo;
    SQLiteDatabase db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
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

        createDatabase();
        ButtonBuy=(Button)findViewById(R.id.btnOrderBuy);
        ButtonOBack=(Button)findViewById(R.id.btnOrderBack);
        TextQuantity=(EditText)findViewById(R.id.txtOrderquantity);
        TextPrice=(TextView)findViewById(R.id.txtOrderPrice);
        TextAddress=(EditText)findViewById(R.id.txtOrderaaddress);
        TextTelNo=(EditText)findViewById(R.id.txtOrderphoneno);
        TextCartNo=(EditText)findViewById(R.id.txtOrdercartno);
        SpinnerOrderCategory=(Spinner)findViewById(R.id.spinnerpackage2);
        SpinnerOrderCode=(Spinner)findViewById(R.id.spinnerpackage3);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.package2, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerOrderCategory.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.package3, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerOrderCode.setAdapter(adapter1);

        ButtonOBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OrderActivity.this, CupcakesActivity.class));
            }
        });


        ButtonBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Insertintodb();
                startActivity(new Intent(OrderActivity.this, CartActivity.class));
            }
        });

    }

    protected void createDatabase()
    {
        try
        {
            db = openOrCreateDatabase("HNDMAD8210", Context.MODE_PRIVATE,null);
            db.execSQL("CREATE TABLE IF NOT EXISTS OrderTable(cartno VARCHAR PRIMARY KEY  NOT NULL, category VARCHAR, code VARCHAR, unitprice VARCHAR, quantity VARCHAR, address VARCHAR, telephoneno VARCHAR);");
        }
        catch (Exception ex) {
            Toast.makeText(getApplicationContext(), "Error Creating Database" + ex, Toast.LENGTH_LONG).show();

        }
    }

    protected void Insertintodb()
    {
        try {
            String code = SpinnerOrderCode.getOnItemSelectedListener().toString().trim();
            String cartno = TextCartNo.getText().toString().trim();
            String category = SpinnerOrderCategory.getSelectedItem().toString().trim();
            String unitprice = TextPrice.getText().toString().trim();
            String quantity = TextQuantity.getText().toString().trim();
            String address = TextAddress.getText().toString().trim();
            String telephoneno = TextTelNo.getText().toString().trim();


            boolean valid = true;

            if (cartno.isEmpty() || category.isEmpty() || code.isEmpty() || unitprice.isEmpty() || quantity.isEmpty() || address.isEmpty() || telephoneno.isEmpty()) {
                Toast.makeText(getApplicationContext(), "Please enter all details.", Toast.LENGTH_LONG).show();
                valid = false;
            }
            if (valid)
            {
                String query2 = "INSERT INTO OrderTable values('" + cartno + "', '" + category + "','" + code + "','" + unitprice + "','" + quantity + "','" + address + "', '" + telephoneno + "');";
                db.execSQL(query2);
                Toast.makeText(getApplicationContext(), "Added Successfully", Toast.LENGTH_LONG).show();
            }
        }
        catch(Exception ex)
        {
            Toast.makeText(getApplicationContext(),"Error"+ex, Toast.LENGTH_LONG).show();
        }
    }

}
