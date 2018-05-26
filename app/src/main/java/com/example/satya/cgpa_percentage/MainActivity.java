package com.example.satya.cgpa_percentage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView Percentage,Cgpa;
    EditText NUM1,NUM2;
    Button button3,button2;

    double NU1,NU2,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Percentage=(TextView)findViewById(R.id.percentage);
        Cgpa=(TextView)findViewById(R.id.cgpa);

        NUM1=(EditText)findViewById(R.id.NUM1);
        NUM2=(EditText)findViewById(R.id.NUM2);

        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);



        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NU1 =Double.parseDouble(NUM1.getText().toString());
                res = (NU1-0.75)*10;
                Percentage.setText(String.valueOf(res));
            }

        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NU2 =Double.parseDouble(NUM2.getText().toString());
                res = (NU2/10)+0.75;
                Cgpa.setText(String.valueOf(res));

            }

        });
    }

}
