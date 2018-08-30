package br.senac.sp.l13.applogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout btnCadastrar, btnAlterar, btnExcluir, btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCadastrar = (LinearLayout) findViewById(R.id.btnCadastrar);
        btnAlterar = (LinearLayout) findViewById(R.id.btnAlterar);
        btnExcluir = (LinearLayout) findViewById(R.id.btnExcluir);
        btnSair = (LinearLayout) findViewById(R.id.btnSair);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cadastrar = new
                        Intent(MainActivity.this,
                        CadastrarActivity.class);
                startActivity(cadastrar);
                finish();

            }
        });
        btnAlterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cadastrar = new
                        Intent(MainActivity.this,
                        AlterarActivity.class);
                startActivity(cadastrar);
                finish();

            }
        });
        btnExcluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cadastrar = new
                        Intent(MainActivity.this,
                        ExcluirActivity.class);
                startActivity(cadastrar);
                finish();

            }
        });
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.menu_principal, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.cadastrar:
                Intent cadastrar = new
                        Intent(MainActivity.this,
                        CadastrarActivity.class);
                startActivity(cadastrar);
                finish();

                return true;
            case R.id.alterar:
                Intent alterar = new
                        Intent(MainActivity.this,
                        AlterarActivity.class);
                startActivity(alterar);
                finish();
                return true;
            case R.id.excluir:
                Intent excluir = new
                        Intent(MainActivity.this,
                        ExcluirActivity.class);
                startActivity(excluir);
                finish();
                return true;
            case R.id.sair:
                finish();
                return true;

        }

        return super.onOptionsItemSelected(item);
    }
}










