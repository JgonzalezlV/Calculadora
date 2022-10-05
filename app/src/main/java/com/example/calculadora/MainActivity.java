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
    private int num1;
    private int num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numeroUno = findViewById(R.id.operando1);//Variable que guarda el numero 1
        numeroDos = findViewById(R.id.operando2);//Variable que guarda el numero 2

    } // Fin onCreate


    public void suma (View v){
     //   int num1 = Integer.parseInt(numeroUno.getText().toString());
     //   int num2 = Integer.parseInt(numeroDos.getText().toString());
        cargarNumeros();
        resultado = num1+num2;
        mostrar();
    } //Fin suma


    private void mostrar() {

        textoResultado = findViewById(R.id.resultado);
        textoResultado.setText(""+resultado);

    } //Fin mostrar


    public void resta (View v){
      //  int num1 = Integer.parseInt(numeroUno.getText().toString());
     //   int num2 = Integer.parseInt(numeroDos.getText().toString());
        cargarNumeros();
        resultado = num1-num2;
        mostrar();
    } //Fin restar


    public void multiplicacion (View v){
      //  int num1 = Integer.parseInt(numeroUno.getText().toString());
      //  int num2 = Integer.parseInt(numeroDos.getText().toString());
        cargarNumeros();
        resultado = num1*num2;
        mostrar();
    }//Fin multiplicación


    public void division (View v){
       // int num1 = Integer.parseInt(numeroUno.getText().toString());
      //  int num2 = Integer.parseInt(numeroDos.getText().toString());
        cargarNumeros();
        if (num2!=0){
            resultado = num1/num2;
            mostrar();
        }
        else { //Si el segundo número es 0 da un error, porque no se puede dividir entre cero
            textoResultado.setText("ERROR");
        }
       // resultado = num1/num2;
    }// Fin división


    public void cargarNumeros(){
        num1 = Integer.parseInt(numeroUno.getText().toString());
        num2 = Integer.parseInt(numeroDos.getText().toString());
    }//Fin cargarNumeros

}//Fin MainActivity
