package com.example.mattcreaven.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button mBtn1;
    TextView mTv1;
    EditText mEt1;
    EditText mEt2;
    EditText mEt3;
    EditText mEt4;
    EditText mEt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myapplication);

        mTv1=(TextView)findViewById(R.id.tv1);
        mEt1=(EditText)findViewById(R.id.input_field1);
        mEt2=(EditText)findViewById(R.id.input_field2);
        mEt3=(EditText)findViewById(R.id.input_field3);
        mEt4=(EditText)findViewById(R.id.input_field4);
        mEt5=(EditText)findViewById(R.id.input_field5);
    }


    public void submit_method(View view) {
        int str = ((Integer.parseInt(mEt1.getText().toString())+
                Integer.parseInt(mEt2.getText().toString())+
                Integer.parseInt(mEt3.getText().toString())+
                Integer.parseInt(mEt4.getText().toString())+
                Integer.parseInt(mEt5.getText().toString()))/5);
        mTv1.setText(""+str);
        //mTv1.setBackgroundColor(0xFFFF0000);
        if (str <= 60)
            mTv1.setBackgroundColor(0xFFFF0000);
        else if (str >= 61 && str <= 79)
            mTv1.setBackgroundColor(0xFFFFE83D);
        else if (str >= 80 && str <= 100)
            mTv1.setBackgroundColor(0xFF2ACC42);
        mTv1.callOnClick();

    }
}
