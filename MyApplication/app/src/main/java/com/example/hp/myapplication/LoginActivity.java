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

public class LoginActivity extends AppCompatActivity {
    Button ButtonLogin;
    TextView TextUsername,TextPassword;
    SQLiteDatabase db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
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

        ButtonLogin=(Button)findViewById(R.id.btnLogin);
        TextUsername=(EditText)findViewById(R.id.txtLUsername);
        TextPassword=(EditText)findViewById(R.id.txtLPassword);

        ButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    String username= TextUsername.getText().toString().trim();
                    String password= TextPassword.getText().toString().trim();
                    if(username.isEmpty())
                    {
                        Toast.makeText(getApplicationContext(),"Please enter the Username",Toast.LENGTH_LONG).show();
                    }
                    if (password.isEmpty())
                    {
                        Toast.makeText(getApplicationContext(),"Please enter the Password",Toast.LENGTH_LONG).show();
                    }
                    if (username.equals("Admin18") && password.equals("1818"))
                    {
                        startActivity(new Intent(LoginActivity.this,AdminInterfaceActivity.class));
                    }
                   else {
                      String query = "Select * from RegisterTable where username='" + username + "',password ='" + password + "';";
                      db=openOrCreateDatabase("HNDMAD8210",Context.MODE_PRIVATE,null);
                      Cursor result = db.rawQuery(query, null);
                        if (result.moveToFirst()) {
                            do {
                                String usertype = result.getString(4);
                                if (usertype.equals("Member")) {
                                   Intent startNewActivity = new Intent(LoginActivity.this, CupcakesActivity.class);
                                    startActivity(startNewActivity);
                                }
                            }while (result.moveToNext());
                        }
                        else
                            {
                            Toast.makeText(getApplicationContext(), "Invalid Access", Toast.LENGTH_LONG).show();
                        }
                    }
                }
                catch (Exception ex)
                {
                    Toast.makeText(getApplicationContext(), "Error"+ex, Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
