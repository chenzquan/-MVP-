package com.example.testmvp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.testmvp.history.ui.HistoryAcitvity;
import com.example.testmvp.news.ui.NewsActvity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

//    Button btnHistory;
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

//        btnHistory = findViewById(R.id.btn_history);
//        btnHistory.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,HistoryAcitvity.class);
//                startActivity(intent);
//            }
//        });


    }


    @OnClick({R.id.btn_history,R.id.btn_joke,R.id.btn_news})
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_history:
                Intent intent = new Intent(MainActivity.this, HistoryAcitvity.class);
                startActivity(intent);
                break;
            case R.id.btn_joke:

                break;
            case R.id.btn_news:
                Intent intent1 = new Intent(MainActivity.this, NewsActvity.class);
                startActivity(intent1);
                break;

                default:
                    break;
        }
    }




}
