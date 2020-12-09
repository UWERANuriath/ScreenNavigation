package com.example.screennavigation;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;

public class Register extends AppCompatActivity {
    private ProgressDialog progressDialog;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void WhenRegisterIsClicked(View view) {
        if (!isConnected(Register.this)) {
            showCustomDialog();
        }

//        Intent schoolsList= new Intent(Register.this, SchoolsList.class);
//        startActivity(schoolsList);
    }
    private boolean isConnected(Register register) {
        ConnectivityManager connectivityManager= (ConnectivityManager) register.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo wifiConnectivity = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        NetworkInfo dataConnectivity = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

        if ((wifiConnectivity != null && wifiConnectivity.isConnected()) || (dataConnectivity != null && dataConnectivity.isConnected())){

            progressDialog = new ProgressDialog(Register.this);
            progressDialog.setMessage("Connecting to devices...");
            progressDialog.setCancelable(false);
            progressDialog.show();
            progressDialog.setMax(100);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent schoolsList= new Intent(Register.this, SchoolList.class);
                    startActivity(schoolsList);
                }
            },5000);

            new Thread(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(5000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    progressDialog.dismiss();
                }
            }).start();


            return true;
        } else{
            return false;
        }
    }
    private void showCustomDialog() {
        AlertDialog.Builder builder= new AlertDialog.Builder(Register.this);

        builder.setMessage("Please connect to the internet to proceed further")
                .setCancelable(false)
                .setPositiveButton("Connect", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));
                    }
                })

                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        finish();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }
}