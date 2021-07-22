package com.danielrodrigues.trabalhoavaliativo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
//observação criei a tela2 promeiro porque achei a parte mais dificil
public class Tela2 extends AppCompatActivity {

    private EditText etNome, etIdade, etDataNasc, etHora, etDia;
    private RadioGroup rgEspecialidade;
    private RadioButton rbClinicoGeral, rbPediatra, rbGeriatra;
    private Button btCadastrar, btNovoCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        buscarReferencias();
        mostrarDadosDoCliente();
        limparDados();
    }

    public void buscarReferencias(){
        etNome = (EditText) findViewById(R.id.etNome);
        etIdade = (EditText) findViewById(R.id.etIdade);
        etDataNasc = (EditText) findViewById(R.id.etDataNasc);
        etHora = (EditText) findViewById(R.id.etHora);
        etDia = (EditText) findViewById(R.id.etDia);

        rgEspecialidade = (RadioGroup) findViewById(R.id.rgEspecialidade);
        rbClinicoGeral = (RadioButton) findViewById(R.id.rbClinicoGeral);
        rbGeriatra = (RadioButton) findViewById(R.id.rbGeriatra);
        rbPediatra = (RadioButton) findViewById(R.id.rbPediatra);

        btCadastrar = (Button) findViewById(R.id.btCadastrar);
        btNovoCadastro = (Button) findViewById(R.id.btNovoCadastro);
    }

    public void mostrarDadosDoCliente(){
        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Client cliente = new Client();

                cliente.setName(etNome.getText().toString());
                cliente.setAge(Byte.parseByte(etIdade.getText().toString()));
                cliente.setBirthDate(etDataNasc.getText().toString());
                cliente.setHour(etHora.getText().toString());

                if (rgEspecialidade.getCheckedRadioButtonId()== R.id.rbClinicoGeral){
                    cliente.setSpecialty(rbClinicoGeral.getText().toString());
                }else if(rgEspecialidade.getCheckedRadioButtonId() ==R.id.rbGeriatra){
                    cliente.setSpecialty(rbGeriatra.getText().toString());
                } else{
                    cliente.setSpecialty(rbPediatra.getText().toString());
                }

                cliente.setDay(Byte.parseByte(etDia.getText().toString()));

                AlertDialog.Builder msg = new AlertDialog.Builder(Tela2.this);
                msg.setTitle("Cadastro Concluido");
                msg.setMessage(""+cliente);
                msg.setNeutralButton("ok", null);
                msg.show();

                /*getSupportActionBar().hide();
                getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                        WindowManager.LayoutParams.FLAG_FULLSCREEN);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(getBaseContext(),Tela4.class));
                        finish();
                    }
                }, 1000);*/

            }
        });

    }

    public void limparDados(){
        btNovoCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNome.setText("");
                etDataNasc.setText("");
                etDia.setText("");
                etHora.setText("");
                etIdade.setText("");
                rbClinicoGeral.setChecked(true);
            }
        });
    }



}