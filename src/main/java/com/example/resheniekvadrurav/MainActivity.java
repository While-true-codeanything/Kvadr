package com.example.resheniekvadrurav;
import android.widget.TextView;
import android.widget.Button;
import android.widget.TextView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView a=findViewById(R.id.editText);
        TextView b=findViewById(R.id.editText2);
        TextView c=findViewById(R.id.editText3);
        Button but=findViewById(R.id.Button);
        TextView x1=findViewById(R.id.label1);
        TextView x2=findViewById(R.id.label2);
        ButtonListner listner= new ButtonListner(a,b,c,x1,x2);
        but.setOnClickListener(listner);
    }
}
