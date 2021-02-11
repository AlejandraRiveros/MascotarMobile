package com.example.varios_controles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class NombreMascota extends AppCompatActivity {
    private EditText etNombreM;
    private RadioButton rbPerro, rbGato;
    private Button registro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nombre_mascota);
        casteo();
    }
    public void casteo() {
        etNombreM = (EditText) findViewById(R.id.etNombreM);
        rbPerro = (RadioButton) findViewById(R.id.rbPerro);
        rbGato = (RadioButton) findViewById(R.id.rbGato);
    }
    public void totalPago(View view) {
        String nombre = etNombreM.getText().toString();
        String tipoM;
        if (rbPerro.isChecked() == true) {
            tipoM = "perro";
        }
        else
            tipoM = "gato";

        Mascota m1 = new Mascota(nombre,tipoM);
        double pago =m1.pago();
        Intent resultadoPago = new Intent(this, Pago.class);
        resultadoPago.putExtra("pago",pago);
        startActivity(resultadoPago);
    }
}