package com.example.formulario21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String prueba;
    String prueba2;
    String hola;
    EditText p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21;
    Button aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p1 = (EditText)findViewById(R.id.editp1);
        p2 = (EditText)findViewById(R.id.editp2);
        p3 = (EditText)findViewById(R.id.editp3);
        p4 = (EditText)findViewById(R.id.editp4);
        p5 = (EditText)findViewById(R.id.editp5);
        p6 = (EditText)findViewById(R.id.editp6);
        p7 = (EditText)findViewById(R.id.editp7);
        p8 = (EditText)findViewById(R.id.editp8);
        p9 = (EditText)findViewById(R.id.editp9);
        p10 = (EditText)findViewById(R.id.editp10);
        p11 = (EditText)findViewById(R.id.editp11);
        p12 = (EditText)findViewById(R.id.editp12);
        p13 = (EditText)findViewById(R.id.editp13);
        p14 = (EditText)findViewById(R.id.editp14);
        p15 = (EditText)findViewById(R.id.editp15);
        p16 = (EditText)findViewById(R.id.editp16);
        p17 = (EditText)findViewById(R.id.editp17);
        p18 = (EditText)findViewById(R.id.editp18);
        p19 = (EditText)findViewById(R.id.editp19);
        p20 = (EditText)findViewById(R.id.editp20);
        p21 = (EditText)findViewById(R.id.editp21);
        aceptar = (Button) findViewById(R.id.btnaceptar);

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pl1 = p1.getText().toString();
                String pl2 = p2.getText().toString();
                String pl3 = p3.getText().toString();
                String pl4 = p4.getText().toString();
                String pl5 = p5.getText().toString();
                String pl6 = p6.getText().toString();
                String pl7 = p7.getText().toString();
                String pl8 = p8.getText().toString();
                String pl9 = p9.getText().toString();
                String pl10 = p10.getText().toString();
                String pl11 = p11.getText().toString();
                String pl12 = p12.getText().toString();
                String pl13 = p13.getText().toString();
                String pl14 = p14.getText().toString();
                String pl15 = p15.getText().toString();
                String pl16 = p16.getText().toString();
                String pl17 = p17.getText().toString();
                String pl18 = p18.getText().toString();
                String pl19 = p19.getText().toString();
                String pl20 = p20.getText().toString();
                String pl21 = p21.getText().toString();
                Intent i = new Intent(MainActivity.this, MostrarDatos.class);

                i.putExtra("1", pl1);
                i.putExtra("2", pl2);
                i.putExtra("3", pl3);
                i.putExtra("4", pl4);
                i.putExtra("5", pl5);
                i.putExtra("6", pl6);
                i.putExtra("7", pl7);
                i.putExtra("8", pl8);
                i.putExtra("9", pl9);
                i.putExtra("10", pl10);
                i.putExtra("11", pl11);
                i.putExtra("12", pl12);
                i.putExtra("13", pl13);
                i.putExtra("14", pl14);
                i.putExtra("15", pl15);
                i.putExtra("16", pl16);
                i.putExtra("17", pl17);
                i.putExtra("18", pl18);
                i.putExtra("19", pl19);
                i.putExtra("20", pl20);
                i.putExtra("21", pl21);


                startActivity(i);

            }
        });

    }
}