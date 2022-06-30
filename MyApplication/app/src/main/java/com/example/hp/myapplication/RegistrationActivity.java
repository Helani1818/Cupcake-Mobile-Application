package com.example.hp.myapplication;

import android.content.Context;
import android.content.Intent;
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

public class RegistrationActivity extends AppCompatActivity {

    Button ButtonRegister, ButtonRLogin;
    TextView TextRName, TextRUsername, TextRPassword, TextRCPassword;
    SQLiteDatabase db;
    Spinner SpinnerRUserType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
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
        ButtonRegister=(Button)findViewById(R.id.btnRegister);
        ButtonRLogin=(Button)findViewById(R.id.btnRegisterLogin);
        TextRName=(EditText)findViewById(R.id.txtRName);
        TextRUsername=(EditText)findViewById(R.id.txtRUsername);
        TextRPassword=(EditText)findViewById(R.id.txtRPassword);
        TextRCPassword=(EditText)findViewById(R.id.txtRConPassword);
        SpinnerRUserType=(Spinner)findViewById(R.id.spinnerpackage4);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.package4, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerRUserType.setAdapter(adapter);


        ButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Insertintodb();
            }
        });

        ButtonRLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
            }
        });
    }

    protected void createDatabase()
    {
        try
        {
            db=openOrCreateDatabase("HNDMAD8210", Context.MODE_PRIVATE,null);
            db.execSQL("CREATE TABLE IF NOT EXISTS RegisterTable(username VARCHAR PRIMARY KEY NOT NULL, name VARCHAR,password VARCHAR, cpassword VARCHAR, usertype VARCHAR);");
        }
        catch (Exception ex)
        {
            Toast.makeText(getApplicationContext(), "Error in creating the Database", Toast.LENGTH_LONG).show();
        }
    }

    protected void Insertintodb()
    {
        try
        {
            String username = TextRUsername.getText().toString().trim();
            String name = TextRName.getText().toString().trim();
            String password = TextRPassword.getText().toString().trim();
            String cpassword = TextRCPassword.getText().toString().trim();
            String usertype= SpinnerRUserType.getSelectedItem().toString().trim();

            boolean valid = true;

            if (username.isEmpty() || name.isEmpty() || password.isEmpty() || cpassword.isEmpty() || usertype.isEmpty()) {
                Toast.makeText(getApplicationContext(), "Please enter all details.", Toast.LENGTH_LONG).show();
                valid = false;
            }
            if (!password.equals(cpassword))
            {
                Toast.makeText(getApplicationContext(), "Password and Confirm Password does not match.", Toast.LENGTH_LONG).show();
                valid=false;
            }
            if (valid) {
                String query = "INSERT INTO RegisterTable values('" + username + "','" + name + "','" + password + "','" + cpassword + "', '"+usertype+"');";
                db.execSQL(query);
                Toast.makeText(getApplicationContext(), "Added Successfully", Toast.LENGTH_LONG).show();
                startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
            }
        }
        catch(Exception ex)
        {
            Toast.makeText(getApplicationContext(),"Error"+ex, Toast.LENGTH_LONG).show();
        }

    }
}
