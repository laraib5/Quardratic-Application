package com.example.quardraticequation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
EditText e1,e2,e3;
Button btn;
TextView t;
double a,b,c,d,x1,x2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.e1);
        e2=(EditText) findViewById(R.id.e2);
        e3=(EditText) findViewById(R.id.e3);
        btn=(Button) findViewById(R.id.btn);
        t=(TextView) findViewById(R.id.t);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("") || e2.getText().toString().equals("")
                        || e3.getText().toString().equals("")){
                    //Toast toast = Toast.makeText(getApplicationContext(), "PLEASE ENTER ALL NUMBERS FIRST!", Toast.LENGTH_LONG);
                   // toast.setMargin(50, 50);
                   // toast.show();
                    Toast.makeText(MainActivity.this,"PLEASE ENTER ALL NUMBERS FIRST!", Toast.LENGTH_LONG).show();
                }
                else{
                    a=Double.parseDouble(e1.getText().toString());
                    b=Double.parseDouble(e2.getText().toString());
                    c=Double.parseDouble(e3.getText().toString());

                    d=Math.pow(b, 2) - 4*a*c;
                    if(d==0){
                        x1=-b/(2*a);
                        t.setText("d="+d+"\nx="+x1);
                    }else if(d<0){
                        t.setText("Imaginary Roots!");
                    }else if(d>0){
                        x1=(-b + Math.sqrt(d))/(2*a);
                        x2=(-b - Math.sqrt(d))/(2*a);
                        t.setText("d="+d+"\nx1= "+x1+"\nx2= "+x2);}
                    }
                }
        });
    }
}