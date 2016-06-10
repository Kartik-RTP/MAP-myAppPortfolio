package com.kartikgupta.map_myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.capstoneButton)  Button mCapstoneButton;
    @BindView(R.id.buildItBiggerButton) Button mBuildItBiggerButton;
    @BindView(R.id.goUbiquitousButton) Button mGoUbiquitousButton;
    @BindView(R.id.stockHawkButton) Button mStockHawkButton;
    @BindView(R.id.popularMoviesButton) Button mPopularMoviesButton;
    @BindView(R.id.makeYourAppMaterialButton) Button mMakeYourAppMaterialButton;

    String mToastCaption ="This button will launch my ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mBuildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, mToastCaption + "Build it bigger app", Toast.LENGTH_LONG).show();

            }
        });

        mCapstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,mToastCaption+"Capstone app",Toast.LENGTH_LONG).show();
            }
        });

        mGoUbiquitousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,mToastCaption+"Go ubiquitous app",Toast.LENGTH_LONG).show();
            }
        });

        mMakeYourAppMaterialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,mToastCaption+"Make Your App Material app",Toast.LENGTH_LONG).show();
            }
        });

        mStockHawkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,mToastCaption+"Stock Hawk app",Toast.LENGTH_LONG).show();
            }
        });

        mPopularMoviesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,mToastCaption+"Popular Movies app",Toast.LENGTH_LONG).show();
            }
        });


    }
}
