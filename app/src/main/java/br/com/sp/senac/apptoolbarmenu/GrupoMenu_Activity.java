package br.com.sp.senac.apptoolbarmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class GrupoMenu_Activity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grupo_menu_layout);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.grupomenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mSubSalvar:
                Toast.makeText(getApplicationContext(), "cliquei no salvar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSubSalvarComo:
                Toast.makeText(getApplicationContext(), "cliquei no salvar como", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSubfechar:
                Toast.makeText(getApplicationContext(), "cliquei no fechar", Toast.LENGTH_SHORT).show();
                finish();
                break;

        }
        return true;
    }
}