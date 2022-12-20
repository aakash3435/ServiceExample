package com.akguptaboy.serviceexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button start,stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         start=(Button) findViewById(R.id.start);
         stop = findViewById(R.id.stop);

         start.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                     startForegroundService(new Intent(MainActivity.this,MyService.class));
                 }
             }
         });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(MainActivity.this,MyService.class));
            }
        });
        /*//fdsdfsdfsdfsdf
        /sdfjdsljflsdfdsf4sfd
                /fgfgfg*/

        /*//fdsdfsdfsdfsdf
        /sdfjdsljflsdfdsf4sfd
                /fgfgfg*//*//fdsdfsdfsdfsdf
        /sdfjdsljflsdfdsf4sfd
                /fgfgfg*//*//fdsdfsdfsdfsdf
        /sdfjdsljflsdfdsf4sfd
                /fgfgfg*//*//fdsdfsdfsdfsdf
        /sdfjdsljflsdfdsf4sfd
                /fgfgfg*//*//fdsdfsdfsdfsdf
        /sdfjdsljflsdfdsf4sfd
                /fgfgfg*/

    }
}