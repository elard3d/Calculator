package com.example.appmoviles2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_sumar;
    private Button btn_restar;
    private Button btn_multiplicar;
    private Button btn_dividir;
    private Button btn_resultado;

    private TextView txt_respuesta;
    private TextView txt_Accion;

    private EditText txtValor1;
    private EditText txtValor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        txt_respuesta = findViewById(R.id.txtResultado);

        txtValor1 = findViewById(R.id.txtValorA);
        txtValor2 = findViewById(R.id.txtValorB);

        txt_Accion = findViewById(R.id.txtAccion);

        btn_sumar = findViewById(R.id.btnSumar);
        btn_sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt_Accion.setText("Sumando");
                txt_respuesta.setText(Sumar(Integer.parseInt(txtValor1.getText().toString()), Integer.parseInt(txtValor2.getText().toString()))+"");


            }
        });

        btn_restar = findViewById(R.id.btnRestar);
        btn_restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_Accion.setText("Restando");
                txt_respuesta.setText(Restar(Integer.parseInt(txtValor1.getText().toString()), Integer.parseInt(txtValor2.getText().toString()))+"");


            }
        });

        btn_multiplicar = findViewById(R.id.btnMultiplicar);
        btn_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_Accion.setText("Multiplicando");
                txt_respuesta.setText(Multiplicar(Integer.parseInt(txtValor1.getText().toString()), Integer.parseInt(txtValor2.getText().toString()))+"");


            }
        });

        btn_dividir = findViewById(R.id.btnDividir);
        btn_dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_Accion.setText("Dividiendo");
                txt_respuesta.setText(Dividir(Integer.parseInt(txtValor1.getText().toString()), Integer.parseInt(txtValor2.getText().toString()))+"");


            }
        });


    }

    public int Sumar (int a, int b){
        return a+b ;
    }

    public int Restar (int a, int b){
        return a-b ;
    }

    public int Multiplicar (int a, int b){
        return a*b ;
    }

    public int Dividir (int a, int b){
        return a/b ;
    }
}