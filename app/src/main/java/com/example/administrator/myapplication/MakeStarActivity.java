package com.example.administrator.myapplication;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MakeStarActivity extends BaseActivity {

    private android.widget.Button leftBottomStart;
    private android.widget.Button leftTobBottomStart;
    private android.widget.Button RightBottomStart;
    private android.widget.Button RightTobBottomStart;
    private android.widget.TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_star);


        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {
        leftTobBottomStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                printNormalStar();
            }
        });
        leftBottomStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printReverseStar();
            }
        });
        RightBottomStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printRightBottomStart();
            }
        });
        RightTobBottomStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printRightTobBottomStart();
            }
        });
    }

    private void printRightTobBottomStart() {
        String starStr = "";

        for (int i = 5 ; i > 0 ; i--){
            for(int j = 0; j<i; j++){
                starStr =  starStr+"*";
            }
            starStr = starStr+"\n";
        }
        resultTxt.setText(starStr);
        resultTxt.setGravity(Gravity.RIGHT);
    }

    private void printRightBottomStart() {
        String starStr = "";

        for (int i = 0 ; i < 5 ; i++){
            for(int j = 0; j<=i; j++){
                starStr =  starStr+"*";
            }
            starStr = starStr+"\n";
        }
        resultTxt.setText(starStr);
        resultTxt.setGravity(Gravity.RIGHT);

    }

    private void printReverseStar() {
        String starStr = "";

        for (int i = 5 ; i > 0 ; i--){
            for(int j = 0; j<i; j++){
                starStr =  starStr+"*";
            }
            starStr = starStr+"\n";
        }
        resultTxt.setText(starStr);
        resultTxt.setGravity(Gravity.LEFT);

    }

    private void printNormalStar() {
        // 기본형 별찍기
        String starStr = "";

        for (int i = 0 ; i < 5 ; i++){
            for(int j = 0; j<=i; j++){
                starStr =  starStr+"*";
            }
            starStr = starStr+"\n";
        }
        resultTxt.setText(starStr);
        resultTxt.setGravity(Gravity.LEFT);

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {
        this.resultTxt = (TextView) findViewById(R.id.resultTxt);
        this.RightTobBottomStart = (Button) findViewById(R.id.RightTobBottomStart);
        this.RightBottomStart = (Button) findViewById(R.id.RightBottomStart);
        this.leftTobBottomStart = (Button) findViewById(R.id.leftTobBottomStart);
        this.leftBottomStart = (Button) findViewById(R.id.leftBottomStart);
    }
}
