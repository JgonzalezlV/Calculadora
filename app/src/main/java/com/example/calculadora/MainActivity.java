package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity<Rounded> extends AppCompatActivity {

    private TextView textoResultado;
    private EditText numeroUno;
    private EditText numeroDos;
    private float resultado;
    private double num1;
    private double num2;
    private Spinner spinner;
    private String[] operaciones = {"","Suma","Resta","Multiplicacion","Division"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numeroUno = findViewById(R.id.operando1);//Variable que guarda el numero 1
        numeroDos = findViewById(R.id.operando2);//Variable que guarda el numero 2
        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,operaciones);
        spinner.setAdapter(adapter);

    } // Fin onCreate


    public void operaciones(View v){

        cargarNumeros();
        comprobarOperaciones();


    }

    private void comprobarOperaciones() {

        String operacion = spinner.getSelectedItem().toString();
        if (operacion.equals("Suma")){
            resultado = (float) (num1+num2);
            mostrar();
        }else if (operacion.equals("Resta")){
            resultado = (float) (num1-num2);
            mostrar();
        }else if (operacion.equals("Multiplicacion")){
            resultado = (float) (num1*num2);
            mostrar();
        }else if (operacion.equals("Division")) {
            if (num2 != 0) {
                resultado = (float) (num1 / num2);
                mostrar();
            } else { //Si el segundo número es 0 da un error, porque no se puede dividir entre cero
                textoResultado.setText("ERROR");
            }
        }
    }

    /*public void suma (View v){

        cargarNumeros();
        String operacion = spinner.getSelectedItem().toString();
        if (!operacion.equals("") && !operacion.equals("Resta") && !operacion.equals("Multiplicacion") && !operacion.equals("Division")){
            resultado = num1+num2;
            mostrar();
        }else {
            resultado = 0;
        }

    } //Fin suma*/


    private void mostrar() {

        textoResultado = findViewById(R.id.resultado);
        textoResultado.setText(""+resultado);

    } //Fin mostrar


    /*public void resta (View v){

        cargarNumeros();
        resultado = num1-num2;
        mostrar();
    } //Fin restar


    public void multiplicacion (View v){

        cargarNumeros();
        resultado = num1*num2;
        mostrar();
    }//Fin multiplicación


    public void division (View v){

        cargarNumeros();
        if (num2!=0){
            resultado = Double.valueOf(num1/num2);
            mostrar();
        }
        else { //Si el segundo número es 0 da un error, porque no se puede dividir entre cero
            textoResultado.setText("ERROR");
        }

    }// Fin división*/


    public void cargarNumeros(){
        num1 = Integer.parseInt(numeroUno.getText().toString());
        num2 = Integer.parseInt(numeroDos.getText().toString());
    }//Fin cargarNumeros

}//Fin MainActivity
