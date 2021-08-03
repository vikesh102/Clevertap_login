package com.example.login_clevertap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.Button;

import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;

import java.util.HashMap;

public class nextpage extends AppCompatActivity {

    private Button Test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        CleverTapAPI clevertapDefaultInstance = CleverTapAPI.getDefaultInstance(getApplicationContext());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nextpage);


        Button button = (Button) findViewById(R.id.testbutton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                 clevertapDefaultInstance.pushEvent("site visited");

            }
        });





            }

        }










