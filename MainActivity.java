package com.example.addnewinventoryitem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.FirebaseApp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void OnClick(View v)
    {

        Intent i = new Intent(this, AddNewItem.class);

        startActivity(i);
    }

    public void OnClick2(View v)
    {

        Intent i = new Intent(this, ViewInventory.class);

        startActivity(i);
    }
}
