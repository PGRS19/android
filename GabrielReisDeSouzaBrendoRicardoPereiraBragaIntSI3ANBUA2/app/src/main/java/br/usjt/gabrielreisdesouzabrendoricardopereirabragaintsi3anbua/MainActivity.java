package br.usjt.gabrielreisdesouzabrendoricardopereirabragaintsi3anbua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira_tela);

        public EditText nome;
        public EditText conteudo;

        nomeText = (EditText) findViewById(R.id.nome);
        assuntoText = (EditText) findViewById(R.id.conteudo);
    }

    public void sendMessage(View view) {
        String nomeSalvo = nome.getText().toString();
        String conteudoSalvo = conteudo.getText().toString();

        Intent intent = new Intent(getApplicationContext(), DisplayMessageActivity.class);
        Bundle parametros = new Bundle();
        parametros.putString("nome", nomeSalvo);
        parametros.putString("conteudo", conteudoSalvo);
        intentEnviar.putExtras(parametros);
        startActivity(intentEnviar);
    }
}
