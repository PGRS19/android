package br.usjt.gabrielreisdesouzabrendoricardopereirabragaintsi3anbua;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_segunda_tela);

        Intent intent = getIntent();

        Bundle conteudo = intent.getExtras();

        if (conteudo != null) {

            if(conteudo.get("chave_assunto").toString("tecnico")) {
                ListView lista = (ListView) findViewById(R.id.listaLivros);
                String [] livrosPrograma = new String[] {"The c++ Programming Language", "Concreates Mathematics"};
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, livrosPrograma);
                lista.setAdapter(adapter);

            } else {
                ListView lista = (ListView) findViewById(R.id.listaLivros);
                String [] livrosGramatica = new String[] {"Capitães da areia", "A culpa é das estrelas", "Orgulho e preconceito"};
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, livrosGramatica);
                lista.setAdapter(adapter);
            }
        }
    }

}
