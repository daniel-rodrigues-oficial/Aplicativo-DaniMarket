package com.danielrodrigues.trabalhoavaliativo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Tela4 extends AppCompatActivity {

    private TextView tvMostrarDados;
    private Button btDiscar, btWeb, btCamera;
    private EditText etTelefone, etWeb;

    private Dados d1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);
         buscarReferencias();
         discar();
         pesquisar();
         camera();
        }

    public void buscarReferencias(){

        btDiscar = findViewById(R.id.btDiscar);
        btWeb = findViewById(R.id.btWeb);
        btCamera = findViewById(R.id.btCamera);

        etTelefone = findViewById(R.id.etTelefone);
        etWeb = findViewById(R.id.etWeb);

    }

    public void discar(){
        btDiscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1 = new Dados();
                d1.setTelefone(etTelefone.getText().toString());
                Intent it = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+d1.getTelefone()));
                startActivity(it);
            }
        });
    }

    public void pesquisar(){
        btWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1 = new Dados();
                d1.setUrl(etWeb.getText().toString());
                Intent it2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://"+d1.getUrl()));
                startActivity(it2);

            }
        });
    }

    public void camera(){
        btCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1 = new Dados();

                Intent it3 = new Intent(Intent.ACTION_SCREEN_ON);
                startActivity(it3);
            }
        });
    }

}
