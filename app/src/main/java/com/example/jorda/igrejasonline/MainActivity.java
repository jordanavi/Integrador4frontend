package com.example.jorda.igrejasonline;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dl = (DrawerLayout) findViewById(R.id.activity_main);
        t = new ActionBarDrawerToggle(this, dl, R.string.abrir, R.string.fechar);

        dl.addDrawerListener(t);
        t.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nv = (NavigationView) findViewById(R.id.nv);
        nv.setNavigationItemSelectedListener(this);
/*
        //CÓDIGO DO BOTÃO FLUTUANTE DA TELA PRINCIPAL (LUPA)
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
*/

    }

    // Responde a eventos do hamburger
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (t.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }

    // Responde a eventos do menu da gaveta de navegação
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();
        switch (id) {
            case R.id.configConta:
                Toast.makeText(MainActivity.this, "Minha conta", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,CadIgrejaActivity.class));
                break;
            case R.id.configIgreja:
                Toast.makeText(MainActivity.this, "Minha conta", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,CadIgrejaActivity.class));
                break;
            case R.id.configCalendario:
                Toast.makeText(MainActivity.this, "Celendário", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,CadEventoActivity.class));
                break;
            case R.id.configEvento:
                Toast.makeText(MainActivity.this, "Eventos", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,CadEventoActivity.class));
                break;
            case R.id.configEntidade:
                Toast.makeText(MainActivity.this, "Entidades", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,CadEntidadeActivity.class));
                break;
            case R.id.configEdereco:
                Toast.makeText(MainActivity.this, "Cadastro de Endereço", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,CadEnderecoActivity.class));
                break;
            default:
                return true;
        }
        return false;
    }
}

