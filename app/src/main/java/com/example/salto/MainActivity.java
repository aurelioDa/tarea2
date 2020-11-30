package com.example.salto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Identificador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Identificador = (EditText) findViewById(R.id.Identificador);

    }
    public void envio(View view){
        String cadena_usando = Identificador.getText().toString();
        Intent i=new Intent(this,paginaweb.class);
        i.putExtra("URLpagina", cadena_usando);
        startActivity(i);

    }
}