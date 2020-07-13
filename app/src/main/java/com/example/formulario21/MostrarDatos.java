package com.example.formulario21;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MostrarDatos extends AppCompatActivity {


    int contador;
    TextView tvp4;
    Button btnok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);


        tvp4 = (TextView)findViewById(R.id.tvp4);


        btnok = (Button)findViewById(R.id.btnok);
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (MostrarDatos.this, MainActivity.class);
                startActivity(intent);
            }
        });
        mostrarDato();

    }

    private void mostrarDato() {
        Integer contador = 0;
        Bundle datos = this.getIntent().getExtras();
        String r1 = datos.getString("1");
        String r2 = datos.getString("2");
        String r3 = datos.getString("3");
        String r4 = datos.getString("4");
        String r5 = datos.getString("5");
        String r6 = datos.getString("6");
        String r7 = datos.getString("7");
        String r8 = datos.getString("8");
        String r9 = datos.getString("9");
        String r10 = datos.getString("10");
        String r11 = datos.getString("11");
        String r12 = datos.getString("12");
        String r13 = datos.getString("13");
        String r14 = datos.getString("14");
        String r15 = datos.getString("15");
        String r16 = datos.getString("16");
        String r17 = datos.getString("17");
        String r18 = datos.getString("18");
        String r19 = datos.getString("19");
        String r20 = datos.getString("20");
        String r21 = datos.getString("21");


        contador = contador + Integer.parseInt(r1);
        contador = contador + Integer.parseInt(r2);
        contador = contador + Integer.parseInt(r3);
        contador = contador + Integer.parseInt(r4);
        contador = contador + Integer.parseInt(r5);
        contador = contador + Integer.parseInt(r6);
        contador = contador + Integer.parseInt(r7);
        contador = contador + Integer.parseInt(r8);
        contador = contador + Integer.parseInt(r9);
        contador = contador + Integer.parseInt(r10);
        contador = contador + Integer.parseInt(r11);
        contador = contador + Integer.parseInt(r12);
        contador = contador + Integer.parseInt(r13);
        contador = contador + Integer.parseInt(r14);
        contador = contador + Integer.parseInt(r15);
        contador = contador + Integer.parseInt(r16);
        contador = contador + Integer.parseInt(r17);
        contador = contador + Integer.parseInt(r18);
        contador = contador + Integer.parseInt(r19);
        contador = contador + Integer.parseInt(r20);
        contador = contador + Integer.parseInt(r21);
        String total = "";
        if (contador>15){

          total = "Hola tengo 21";
        }



        tvp4.setText(total);

}
}