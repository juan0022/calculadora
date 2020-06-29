package com.example.calculadora;


import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText numero1;
    EditText numero2;
    TextView Res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1=(EditText) findViewById(R.id.N1);
        numero2=(EditText) findViewById(R.id.N2);
        Res=(TextView) findViewById(R.id.Respuesta);

    }
    public void Suma (View view) {
        double valor1=Double.parseDouble(numero1.getText().toString());
        double valor2=Double.parseDouble(numero2.getText().toString());
        double sumatotal= valor1 + valor2;
        Res.setText(Double.toString(sumatotal));
    }
    public void Dividir (View view) {
        double valor1=Double.parseDouble(numero1.getText().toString());
        double valor2=Double.parseDouble(numero2.getText().toString());
        double divitotal= valor1 / valor2;
        Res.setText(Double.toString(divitotal));

    }

    public void Multiplicar (View view) {
        double valor1=Double.parseDouble(numero1.getText().toString());
        double valor2=Double.parseDouble(numero2.getText().toString());
        double multitotal= valor1 * valor2;
        Res.setText(Double.toString(multitotal));

    }

    public void Resta (View view) {
        double valor1=Double.parseDouble(numero1.getText().toString());
        double valor2=Double.parseDouble(numero2.getText().toString());
        double resttotal= valor1 - valor2;
        Res.setText(Double.toString(resttotal));

    }



}