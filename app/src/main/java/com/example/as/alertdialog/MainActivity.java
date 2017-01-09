package com.example.as.alertdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void b1(View v){
        Toast t=Toast.makeText(this,"哈哈，早就会了",Toast.LENGTH_LONG);
        t.show();
    }

    public void b2(View v){
        LayoutInflater lf=getLayoutInflater();
        View vroot=lf.inflate(R.layout.toastinfo,null);
        lf.inflate(R.layout.toastinfo,null);
        Toast toast=new Toast(this);
        toast.setView(vroot);
        toast.show();
    }

    public void b3(View v){
        Toast toast=Toast.makeText(this,"我是小黄人显示",Toast.LENGTH_LONG);
        LinearLayout ll=new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ImageView mImage=new ImageView(this);
        mImage.setImageResource(R.drawable.yellowman);
        View toastView=toast.getView();
        ll.addView(mImage);
        ll.addView(toastView);
        toast.setView(ll);
        toast.show();
    }
}
