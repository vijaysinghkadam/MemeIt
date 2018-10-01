package com.sinh.vijay.memeit.Login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import com.sinh.vijay.memeit.R;

/**
 * Created by vijay on 10/1/18.
 */

public class login extends AppCompatActivity {
    private static final String TAG = "LoginActivity";



    private Context mContext;
    private EditText mEmail, mPassword;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        mEmail = findViewById(R.id.input_email);
        mPassword = findViewById(R.id.input_password);
        mContext = login.this;
        Log.d(TAG, "onCreate: started.");

        Database();
        init();

    }

    private void init() {
        TextView linkSignUp = (TextView) findViewById(R.id.link_signup);
        linkSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: navigating to register screen");
                Intent intent = new Intent(login.this, register.class);
                startActivity(intent);
            }
        });
    }



    private void Database() {

    }


}
