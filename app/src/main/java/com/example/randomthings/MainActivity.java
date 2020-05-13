package com.example.randomthings;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {
    private Button heroButton;
    private Button countryButton;
    private Button logoButton;
    private Button appButton;


    private AlertDialog.Builder alertDialog;
    private Button exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heroButton = (Button) findViewById(R.id.heroButton);
        heroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

        countryButton = (Button) findViewById(R.id.countryButton);
        countryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);

            }
        });

        logoButton = (Button) findViewById(R.id.logoButton);
        logoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,Main4Activity.class);
                startActivity(intent);
            }
        });


        appButton = (Button) findViewById(R.id.appsButton);
        appButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,Main5Activity.class);
                startActivity(intent);

            }
        });


        exitButton = (Button) findViewById(R.id.exitBtn);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // show the actual dialog (alert dialog)
                alertDialog = new AlertDialog.Builder(MainActivity.this);

                //set things up  - set title
                alertDialog.setTitle(R.string.title);
                alertDialog.setIcon(android.R.drawable.btn_star_big_on);

                //  - set message
                alertDialog.setMessage(R.string.message);

                // -  set Cancel label
                alertDialog.setCancelable(false);

                //   - set positive button
                alertDialog.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //exit our window activity
                        MainActivity.this.finish();
                    }
                });

                //  - set negative button
                alertDialog.setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // stay in our window activity
                        dialog.cancel();
                    }
                });


                // create the actual dialog
                AlertDialog d = alertDialog.create();

                //show the dialog
                d.show();


            }
        });

    }
}
