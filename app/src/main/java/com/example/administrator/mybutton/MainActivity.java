package com.example.administrator.mybutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.button);
//        mButton.setOnClickListener(this);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"方法3-----------点击了按键",Toast.LENGTH_SHORT).show();
            }
        });
    }

//    @Override
//    public void onClick(View v) {
//        Toast.makeText(getApplicationContext(),"方法2-----------点击了按键",Toast.LENGTH_SHORT).show();
//    }



//    public void onClick(View v){
//        Toast.makeText(getApplicationContext(),"点击了按键",Toast.LENGTH_SHORT).show();
//    }
}
