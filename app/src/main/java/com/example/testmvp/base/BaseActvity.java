package com.example.testmvp.base;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActvity extends AppCompatActivity{
    protected void startActivity(Class<? extends Object> clz){
        Intent intent = new Intent(this,clz);
        startActivity(intent);
    }
}
