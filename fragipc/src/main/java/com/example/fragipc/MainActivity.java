package com.example.fragipc;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements IfcContract {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment f1 = new Fragment1();
        Fragment f2 = new Fragment2();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.add(R.id.fr1, f1, "fragment1").add(R.id.fr2, f2, "fragment2").commit();
    }

    @Override
    public void respond(String s) {
        FragmentManager fm = getSupportFragmentManager();
        Fragment2 f2 = (Fragment2) fm.findFragmentByTag("fragment2");
        Log.e("MY_ACTIVITY", "going to pass: " + s);
        f2.updateText(s);
    }
}
