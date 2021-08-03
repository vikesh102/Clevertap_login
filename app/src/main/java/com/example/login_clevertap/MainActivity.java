package com.example.login_clevertap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.clevertap.android.sdk.CleverTapAPI;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText email;
    private Button Login;
    private TextView info;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CleverTapAPI clevertapDefaultInstance = CleverTapAPI.getDefaultInstance(getApplicationContext());


        username = (EditText) findViewById(R.id.yourusername);
        email = (EditText) findViewById(R.id.youremail);
        Login = findViewById(R.id.buttonlogin);
        info.setText("Wrong username or email: + String.ValueOf(counter)");


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HashMap<String, Object> userdetails = new HashMap<String, Object>();
                userdetails.put("Name", "Jack Montana");
                userdetails.put("email", "vikesh.shrivastav@gmail.com");


                CleverTapAPI.getDefaultInstance(getApplicationContext()).onUserLogin(userdetails);

                {


                }
            }
        });


    }


    private void validate(String username, String email) {

        if ((username.equals("Vikesh")) && (email.equals("vikesh@clevertap.com"))) {


            Intent intent = new Intent(MainActivity.this, nextpage.class);

            startActivity(intent);
        } else {


            counter--;
            if (counter == 0) {
                Login.setEnabled(false);
            }
        }
    }
}








