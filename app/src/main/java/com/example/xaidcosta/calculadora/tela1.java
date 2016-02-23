package com.example.xaidcosta.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class tela1 extends AppCompatActivity {
    String a, b, c;

    public static int CODE = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        TextView a1 = (TextView) findViewById(R.id.a);
        TextView b1 = (TextView) findViewById(R.id.b);
        TextView c1 = (TextView) findViewById(R.id.c);

        a = a1.getText().toString();
        b = b1.getText().toString();
        c = c1.getText().toString();
    }

    public void abrirTela(View v){
        Bundle parametros = new Bundle();
        parametros.putString("A = ", a);
        parametros.putString("B = ", b);
        parametros.putString("C = ", c);

        Intent i = new Intent(this,tela2.class);
        i.putExtras(parametros);
        startActivityForResult(i, CODE);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == CODE){
            if(resultCode == 50){
                Bundle br = data.getExtras();
                if(br!=null){
                    TextView a1 = (TextView) findViewById(R.id.a);
                    //TextView emailt = (TextView) findViewById(R.id.email);
                    a1.setText(br.getString("A ="));
                   // emailt.setText(br.getString("email"));

                    a = br.getString("A =");
                   // email = br.getString("email");
                }
            }
        }else if(requestCode == CODE){
            //TO DO
        }

    }
}
