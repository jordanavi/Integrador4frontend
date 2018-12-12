package com.example.jorda.igrejasonline;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class CadEntidadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entidade_cad);

    }

    public void voltarInicio(View view) {
        //voltar a tela inicial
        setContentView(R.layout.activity_main);
    }

    public void telaCadastroEndereco(View view) {
        //salvar os dados que ja existe e prosseguir para a tela de cadastro de endereco
        setContentView(R.layout.activity_cad_endereco);
    }
}
