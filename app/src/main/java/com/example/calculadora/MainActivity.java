package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*private Button suma;
    private Button division;
    private Button resta;
    private Button multiplicacion;*/
    private TextView textoResultado;
    private EditText numeroUno;
    private EditText numeroDos;
    private int resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        numeroUno = findViewById(R.id.operando1);//Variable que guarda el numero 1
        numeroDos = findViewById(R.id.operando2);//Variable que guarda el numero 2

    }


    public void suma (View v){
        int num1 = Integer.parseInt(numeroUno.getText().toString());
        int num2 = Integer.parseInt(numeroDos.getText().toString());
        resultado = num1+num2;
        mostrar();
    }

    private void mostrar() {

        textoResultado = findViewById(R.id.resultado);
        textoResultado.setText(""+resultado);

    }

    public void resta (View v){
        int num1 = Integer.parseInt(numeroUno.getText().toString());
        int num2 = Integer.parseInt(numeroDos.getText().toString());
        resultado = num1-num2;
        mostrar();
    }

    public void multiplicacion (View v){
        int num1 = Integer.parseInt(numeroUno.getText().toString());
        int num2 = Integer.parseInt(numeroDos.getText().toString());
        resultado = num1*num2;
        mostrar();
    }

    public void division (View v){
        int num1 = Integer.parseInt(numeroUno.getText().toString());
        int num2 = Integer.parseInt(numeroDos.getText().toString());
        if (num2!=0){
            resultado = num1/num2;
        }
        resultado = num1/num2;
        mostrar();
    }
}
