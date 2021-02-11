package com.example.varios_controles;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Pago extends AppCompatActivity {
    private TextView pagoResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pago);
        impresionPantalla();
    }
    private void impresionPantalla() {
        Bundle recogeDatos = getIntent().getExtras();
        double pago = recogeDatos.getDouble("pago");
        pagoResultado = (TextView) findViewById(R.id.tvPago);
        pagoResultado.setText(pago +"");
    }
    public void regresar(View view) {
        Intent main = new Intent (this, MainActivity.class);
        startActivity(main);
    }
}