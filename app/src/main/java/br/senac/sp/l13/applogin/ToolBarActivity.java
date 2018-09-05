package br.senac.sp.l13.applogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ToolBarActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_bar);

        toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_buscar: {
                Toast.makeText(getApplicationContext(), "Clique em buscar", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.menu_carrinho: {
                Toast.makeText(getApplicationContext(), "Clique em carrinho", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.menu_configuracoes: {
                Toast.makeText(getApplicationContext(), "Clique em configurações", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.menu_sobre: {
                Toast.makeText(getApplicationContext(), "Clique em sobre", Toast.LENGTH_SHORT).show();
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
