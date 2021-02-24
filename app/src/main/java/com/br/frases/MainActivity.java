package com.br.frases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.BreakIterator;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Função responsavel por gerar a frase
    // Gera uma frase quando o usuário clicar no GERAR FRASE
    public void gerarNovaFrase(View view){

        //armazenando as frases que podem ser geradas
        String[] frases = {
                "Vida longa e próspera(Sr.Spock - StarTrek)",//0
                "Eu tenho a força!(He-man)",//1
                "Que a força esteja com você!(StarWars)",//2
                "Você não passará!(Gandalf)",//3
                "Ao infinito, e além!(BuzzLightyear)",//4
                "Com grandes poderes!(Tio Ben - Spiderman)",//5
                "Meu Precioso(Smeagel)",//6
                "Bazinga!(Shedon Cooper)",//7
                "Que é que há, velinho?(Pernalonga)",//8
        };

        //VAR responsavel por gerar os valores aleatorios
        // que serão utilizado para indicar a posição no vetor frases (acima)
        int numero = new Random().nextInt(9 ); //Quatro frases acima

        //Mostrando a frase com base na posição sorteada
        TextView frase = findViewById(R.id.txtFraseGerada);
        frase.setText(frases[numero]);

    }//Fechamento da função GerarNovaFrase


}