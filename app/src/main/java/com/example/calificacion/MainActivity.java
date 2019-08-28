package com.example.calificacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Main.Vista{
    private Main.Presentador presentador;
    private EditText calificacion1,calificacion2,calificacion3;
    private Boolean dato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presentador = new CalificacionPresentador( this);
        calificacion1 = (EditText) findViewById(R.id.calificacion1);
        calificacion2 = (EditText) findViewById(R.id.calificacion2);
        calificacion3 = (EditText) findViewById(R.id.calificacion3);
    }
    public void calcular(View view) {
        Integer nota1i,nota2i,nota3i;
        dato = true;
        if (calificacion1.getText().toString().equals("")){
            dato = false;
            Toast.makeText(getApplicationContext(),"Ingresar calificacion número 1",Toast.LENGTH_SHORT).show();
        }
        if (calificacion2.getText().toString().equals("")){
            dato = false;
            Toast.makeText(getApplicationContext(),"Ingresar calificacion número 2",Toast.LENGTH_SHORT).show();
        }
        if (calificacion3.getText().toString().equals("")){
            dato = false;
            Toast.makeText(getApplicationContext(),"Ingresar calificacion número 3",Toast.LENGTH_SHORT).show();
        }

        if (dato){
            nota1i = Integer.parseInt(calificacion1.getText().toString());
            nota2i = Integer.parseInt(calificacion2.getText().toString());
            nota3i = Integer.parseInt(calificacion3.getText().toString());

            presentador.calcular(nota1i,nota2i,nota3i);
        }

    }

    @Override
    public void mostrarCalificacion(String r) {
        Toast.makeText(getApplicationContext(), "El promedio final es: "+r, Toast.LENGTH_LONG).show();
    }
}

