package com.example.jorda.igrejasonline;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.jorda.igrejasonline.model.ModeloEstado;
import com.example.jorda.igrejasonline.service.RetrofitService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CadEnderecoActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        consultaEstados();
    }

    private void consultaEstados() {
        Call<List<ModeloEstado>> call = RetrofitService.getServico().consulta();
        call.enqueue(new Callback<List<ModeloEstado>>() {
            @Override
            public void onResponse(Call<List<ModeloEstado>> call, Response<List<ModeloEstado>> response) {
                List<ModeloEstado> listaEstados = response.body();
                List<String> listaUf = new ArrayList<String>();
                for (ModeloEstado e : listaEstados) {
                    listaUf.add(e.getUf());
                }
                setContentView(R.layout.activity_cad_endereco);
                Button btnCep = (Button) findViewById(R.id.btnCep);
                btnCep.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), BuscaCep.class);
                        startActivity(intent);
                    }
                });
                Spinner spinner = findViewById(R.id.estado);
                spinner.setOnItemSelectedListener(CadEnderecoActivity.this);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(CadEnderecoActivity.this, R.layout.spinner_item, listaUf);
                /*adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);*/

                spinner.setAdapter(adapter);
                //spinner.setOnItemSelectedListener();
            }

            @Override
            public void onFailure(Call<List<ModeloEstado>> call, Throwable t) {

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

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
