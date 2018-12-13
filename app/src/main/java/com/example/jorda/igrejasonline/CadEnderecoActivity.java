package com.example.jorda.igrejasonline;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CadEnderecoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_endereco);

        Button btnCep = (Button) findViewById(R.id.btnCep);

        btnCep.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), BuscaCep.class);
                startActivity(intent);
            }
        });

    }

    public void voltarInicio(View view) {
        //voltar a tela principal
        setContentView(R.layout.activity_main);
    }

    public void concluir(View view) {
        //salvar no banco de dados e voltar para a tela inicial
    }

    public void buscacep(View view) {
    }
}
