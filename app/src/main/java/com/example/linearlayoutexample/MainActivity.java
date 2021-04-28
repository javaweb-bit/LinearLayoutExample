package com.example.linearlayoutexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //  폼을 터치하면 기본 레이아웃으로 바꾸자
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        setContentView(R.layout.activity_main);
        return true;
    }

    //  일반적인 경우: normal.xml
    public void onButton1Clicked(View v) {
        setContentView(R.layout.normal);
    }

    //  Baseline : baseline.xml
    public void onButton5Clicked(View v) {
        setContentView(R.layout.baseline);
    }
    //  Gravity 사용 : gravity.xml
    public void onButton3Clicked(View v) {
        setContentView(R.layout.gravity);
    }
    //  Gravity Left|top : gravitytext01.xml
    public void onButton6Clicked(View v) {
        setContentView(R.layout.gravitytext01);
    }
    //  Gravity Center : gravitytext02.xml
    public void onButton7Clicked(View v) {
        setContentView(R.layout.gravitytext02);
    }
    //  Gravity right|bottom : gravitytext03.xml
    public void onButton8Clicked(View v) {
        setContentView(R.layout.gravitytext03);
    }
    //  공간 사용하기(margin, padding): padding.xml
    public void onButton2Clicked(View v) {
        setContentView(R.layout.padding);
    }
    //  Weight : weight.xml
    public void onButton4Clicked(View v) {
        setContentView(R.layout.weight);
    }
    //  자바 코드로 만들기
    public void onButton9Clicked(View v) { }

}