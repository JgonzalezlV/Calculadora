package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button suma;
    private Button division;
    private Button resta;
    private Button multiplicacion;
    private TextView text_respuesta;
    private int edit_numero_uno;
    private int edit_numero_dos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_respuesta = findViewById(R.id.resultado);//Variable que guarda los resultados
        edit_numero_uno = findViewById(R.id.numero1);//Variable que guarda el numero 1 PONERLO
        edit_numero_dos = findViewById(R.id.numero2);//Variable que guarda el numero 2  PONERLO



        suma = findViewById(R.id.);//Poner el ID DE LA SUMA
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( suma( Integer.parseInt(String.valueOf(edit_numero_uno)),Integer.parseInt(String.valueOf(edit_numero_dos)) )+"");
            }
        });


        division = findViewById(R.id.);//ID DE DIVISION
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( division( Integer.parseInt(String.valueOf(edit_numero_uno)),Integer.parseInt(String.valueOf(edit_numero_dos)) )+"");

            }
        });

        multiplicacion = findViewById(R.id.multiplicacion);
        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( multiplicacion(Integer.parseInt(String.valueOf(edit_numero_uno)),Integer.parseInt(String.valueOf(edit_numero_dos)) )+"");

            }
        });

        resta = findViewById(R.id.resta);
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( resta( Integer.parseInt(String.valueOf(edit_numero_uno)),Integer.parseInt(String.valueOf(edit_numero_dos)) )+"");

            }
        });

    }

    public double suma (int a, int b){
        return a+b;
    }

    public double resta (int a, int b){
        return a-b;
    }

    public double multiplicacion (int a, int b){
        return a*b;
    }

    public double division (int a, int b){
        int respuesta = 0;

        if (b!=0){
            respuesta=a/b;
        }

        return respuesta;
    }
}
