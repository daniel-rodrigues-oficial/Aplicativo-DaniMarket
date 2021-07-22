package com.danielrodrigues.trabalhoavaliativo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class Tela3 extends AppCompatActivity {

    private Button btNovaConsulta, btMeusAgendamentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        buscarReferencias();
        realizarNovaConsulta();
        consultarMeusAgendamentos();
    }

    public void buscarReferencias(){
        btNovaConsulta = (Button) findViewById(R.id.btNovaConsulta);
        btMeusAgendamentos = (Button) findViewById(R.id.btMeusAgendamentos);
    }

    public void realizarNovaConsulta(){
        btNovaConsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportActionBar().hide();
                getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                        WindowManager.LayoutParams.FLAG_FULLSCREEN);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(getBaseContext(),Tela2.class));
                        finish();
                    }
                },1000);//segundos


            }//fim do onclick
        });//fim do on click listener
    }//fim da funcal

    public void consultarMeusAgendamentos(){
        btMeusAgendamentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportActionBar().hide();
                getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                        WindowManager.LayoutParams.FLAG_FULLSCREEN);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(getBaseContext(),Tela4.class));
                        finish();
                    }
                }, 1000);

            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();

        switch (id){
            case R.id.menu_home:
                Toast.makeText(getBaseContext(), "Home", Toast.LENGTH_LONG).show();
                break;
            case R.id.menuDiscador:
                Toast.makeText(getBaseContext(), "Discador", Toast.LENGTH_LONG).show();
                break;
            case  R.id.menuWeb:
                Toast.makeText(getBaseContext(), "Web", Toast.LENGTH_LONG).show();
                break;
            case R.id.menuCamera:
                Toast.makeText(getBaseContext(), "Camera", Toast.LENGTH_LONG).show();
                break;
        }//fecha  o switch

        return super.onOptionsItemSelected(item);

    }

}