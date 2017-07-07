package br.com.jordan.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btJogar;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Pegando a instância do botão
        btJogar = (Button) findViewById(R.id.btJogar);
        //Pegando a instância do TextView
        tvResultado = (TextView) findViewById(R.id.tvResultado);

        //Instanciando uma Ação no botão
        btJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Instanciando o objeto Random
                Random random = new Random();

                int aleatorio = random.nextInt(11);

                tvResultado.setText("Número escolhido " + aleatorio);
            }
        });


    }
}
