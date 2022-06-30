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

public class CupcakeInterfaceActivity extends AppCompatActivity {
    Button ButtonAdd, ButtonView, ButtonUpdate, ButtonDelete, ButtonBack;
    TextView TextCode, TextName, TextDescription, TextPrice;
    Spinner SpinnerOccasion;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cupcake_interface);
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
        ButtonAdd=(Button)findViewById(R.id.btnCIAdd);
        ButtonView=(Button)findViewById(R.id.btnCIView);
        ButtonUpdate=(Button)findViewById(R.id.btnCIUpdate);
        ButtonDelete=(Button)findViewById(R.id.btnCIDelete);
        ButtonBack=(Button)findViewById(R.id.btnCIBack);
        TextCode=(EditText)findViewById(R.id.txtCICode);
        TextName=(EditText)findViewById(R.id.txtCIName);
        TextDescription=(EditText)findViewById(R.id.txtCIdescription);
        TextPrice=(EditText)findViewById(R.id.txtCIprice);
        SpinnerOccasion=(Spinner)findViewById(R.id.spinnerpackage1);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.package1, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerOccasion.setAdapter(adapter);

        ButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CupcakeInterfaceActivity.this, AdminInterfaceActivity.class));
            }
        });

        ButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Insertintodb();
            }
        });

        ButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewData();
            }
        });

        ButtonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UpdateData();
            }
        });

        ButtonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DeleteData();
            }
        });
    }

    protected void createDatabase()
    {
        try
        {
            db = openOrCreateDatabase("HNDMAD8210", Context.MODE_PRIVATE,null);
            db.execSQL("CREATE TABLE IF NOT EXISTS CupcakeTable(code VARCHAR PRIMARY KEY  NOT NULL, name VARCHAR, description VARCHAR, price VARCHAR, occasion VARCHAR);");
        }
        catch (Exception ex) {
            Toast.makeText(getApplicationContext(), "Error Creating Database" + ex, Toast.LENGTH_LONG).show();

        }
    }

    protected void Insertintodb()
    {
        try
        {
            String code = TextCode.getText().toString().trim();
            String name = TextName.getText().toString().trim();
            String description = TextDescription.getText().toString().trim();
            String price = TextPrice.getText().toString().trim();
            String occasion = SpinnerOccasion.getSelectedItem().toString().trim();

            boolean valid = true;

            if (code.isEmpty() || name.isEmpty() || description.isEmpty() || price.isEmpty() || occasion.isEmpty()) {
                Toast.makeText(getApplicationContext(), "Please enter all details.", Toast.LENGTH_LONG).show();
                valid = false;
            }
            if (valid)
            {
                String query1 = "INSERT INTO CupcakeTable values('" + code + "','" + name + "','" + description + "','" + price + "', '" + occasion + "');";
                db.execSQL(query1);
                Toast.makeText(getApplicationContext(), "Added Successfully", Toast.LENGTH_LONG).show();
            }
        }
        catch(Exception ex)
        {
            Toast.makeText(getApplicationContext(),"Error"+ex, Toast.LENGTH_LONG).show();
        }

    }

    protected void ViewData()
    {
        try {
            String code = TextCode.getText().toString().trim();
            String name = TextName.getText().toString().trim();
            String description = TextDescription.getText().toString().trim();
            String price = TextPrice.getText().toString().trim();
            String occasion = SpinnerOccasion.getSelectedItem().toString().trim();
            String query1 = "Select*from CupcakeTable where code='" + code + "';";
            db=openOrCreateDatabase("HNDMAD8210", Context.MODE_PRIVATE,null);
            Cursor result = db.rawQuery(query1, new String[]{});
            if (result.moveToFirst())
            {
                do {
                    TextName.setText(result.getString(1));
                    TextDescription.setText(result.getString(2));
                    TextPrice.setText(result.getString(3));
                    SpinnerOccasion.toString();
                } while (result.moveToNext());
            }
            else {
                Toast.makeText(getApplicationContext(), "Data not Found", Toast.LENGTH_LONG).show();
            }
        }
        catch(Exception ex)
        {
            Toast.makeText(getApplicationContext(),"Error"+ex, Toast.LENGTH_LONG).show();
        }
    }

    protected void UpdateData()
    {
        try
        {
            String code = TextCode.getText().toString().trim();
            String name = TextName.getText().toString().trim();
            String description = TextDescription.getText().toString().trim();
            String price = TextPrice.getText().toString().trim();
            String occasion = SpinnerOccasion.getSelectedItem().toString().trim();

            String query1 = "Update CupcakeTable set name='"+name+"', descrisption='"+description+"', price='"+price+"',occasion='"+occasion+"' where code='"+code+"';";
            db.execSQL(query1);

            Toast.makeText(getApplicationContext(), "Error Modifying Data",Toast.LENGTH_LONG).show();
        }
        catch(Exception ex)
        {
            Toast.makeText(getApplicationContext(),"Error"+ex, Toast.LENGTH_LONG).show();
        }
    }

    protected void DeleteData()
    {
        try
        {
            String code = TextCode.getText().toString().trim();
            String query1 = "Delete CupcakeTable where code='"+code+"';";
            db.execSQL(query1);

            Toast.makeText(getApplicationContext(), "Error Deleting Data",Toast.LENGTH_LONG).show();
        }
        catch(Exception ex)
        {
            Toast.makeText(getApplicationContext(),"Error"+ex, Toast.LENGTH_LONG).show();
        }
    }

}
