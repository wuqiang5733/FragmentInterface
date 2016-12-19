package com.tuchangwei.fragmentinterface;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FragmentTest.Callbacks{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onCallback(String str) {
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();

    }
}
