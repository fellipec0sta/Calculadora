package com.example.xaidcosta.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        Intent i = getIntent();
        if(i != null){
            Bundle params = i.getExtras();
            if(params != null){
                //if
                String a = params.getString("A = ");
                //String b = params.getString("B = ");
               // String c = params.getString("C = ");

                TextView abcview = (TextView) findViewById(R.id.vazio);

                abcview.setText(a);
            }

        }
    }

    public void enviarOk(View v){
        Intent ir = new Intent();
        Bundle b = new Bundle();

        TextView abcview = (TextView) findViewById(R.id.vazio);

        b.putString("A = ", abcview.getText().toString());


        ir.putExtras(b);
        setResult(50, ir);

        finish();

    }

    public void cancelar(View v){
        Intent ir = new Intent();
        setResult(30, ir);
        finish();
    }
}
