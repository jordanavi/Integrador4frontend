package com.example.jorda.igrejasonline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CadEnderecoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_endereco);
    }

    public void voltarInicio(View view) {
        //voltar a tela principal
        setContentView(R.layout.activity_main);
    }

    public void concluir(View view) {
        //salvar no banco de dados e voltar para a tela inicial
    }
}
