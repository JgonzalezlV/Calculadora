package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textoResultado;
    private EditText numeroUno;
    private EditText numeroDos;
    private float resultado;
    private double num1;
    private double num2;
    private Spinner spinner;
    //private String[] operaciones = {"","Suma","Resta","Multiplicacion","Division"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numeroUno = findViewById(R.id.operando1);//Variable que guarda el numero 1
        numeroDos = findViewById(R.id.operando2);//Variable que guarda el numero 2
        spinner = (Spinner) findViewById(R.id.spinner);


        //@SuppressLint("ResourceType") ArrayAdapter<CharSequence> adapter2 = new ArrayAdapter<>(this,R.array.operacion);
        //ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, operaciones);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.operacion,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter2);
        //spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String operacion = spinner.getSelectedItem().toString();
                switch (operacion) {
                    case "Suma":
                        resultado = (float) (num1 + num2);
                        mostrar();
                        break;
                    case "Resta":
                        resultado = (float) (num1 - num2);
                        mostrar();
                        break;
                    case "Multiplicacion":
                        resultado = (float) (num1 * num2);
                        mostrar();
                        break;
                    case "Division":
                        if (num2 != 0) {
                            resultado = (float) (num1 / num2);
                            mostrar();
                        } else { //Si el segundo número es 0 da un error, porque no se puede dividir entre cero
                            textoResultado.setText("ERROR");
                        }
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    } // Fin onCreate


    public void operaciones(View v){

        cargarNumeros();
        comprobarOperaciones();


    }

    private void comprobarOperaciones() {

        String operacion = spinner.getSelectedItem().toString();
        switch (operacion) {
            case "Suma":
                resultado = (float) (num1 + num2);
                mostrar();
                break;
            case "Resta":
                resultado = (float) (num1 - num2);
                mostrar();
                break;
            case "Multiplicacion":
                resultado = (float) (num1 * num2);
                mostrar();
                break;
            case "Division":
                if (num2 != 0) {
                    resultado = (float) (num1 / num2);
                    mostrar();
                } else { //Si el segundo número es 0 da un error, porque no se puede dividir entre cero
                    textoResultado.setText("ERROR");
                }
                break;
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
        num1 = Double.parseDouble(numeroUno.getText().toString());
        num2 = Double.parseDouble(numeroDos.getText().toString());
    }//Fin cargarNumeros

}//Fin MainActivity
