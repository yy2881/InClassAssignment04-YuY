package com.example.android.inclassassignment04_yuy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView input;
    Button copy,double_,up,down;
    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.input_text_view);
        copy = findViewById(R.id.copy);
        double_ = findViewById(R.id.double_);
        up = findViewById(R.id.up);
        down = findViewById(R.id.down);
        message = findViewById(R.id.message);

    }

    public void display(View view){
        message.setText(input.getText());
    }

    public void doubleMessage(View view){
        String t = message.getText().toString();
        message.setText(t+t);

    }

    public void sizeUp(View view){
        float size =  message.getTextSize();
        message.setTextSize(size/3);
    }

    public void sizeDown(View view){
        float size =  message.getTextSize();
        message.setTextSize(size/4);
    }

    public void onResume(){
        super.onResume();
        Toast.makeText(this,"Welcome!",Toast.LENGTH_SHORT).show();
    }
}
