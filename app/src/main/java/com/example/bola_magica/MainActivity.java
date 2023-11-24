package com.example.bola_magica;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.util.Log;

import java.util.Random;
public class MainActivity extends AppCompatActivity {
    private TextView messageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageTextView = findViewById(R.id.messageTextView);
        Button btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] x = {"si", "no", "puede ser", "Quizas", "No estoy seguro", "Prefiero no contestar", "Intenta luego","Eso nadie lo sabe","quien sabe", "me parece que si","Nada que ver","definitivamente","no tengo señal","no, no y no", "si y no", "pensa más fuerte", "habla", "no te escucho", "todo puede ser", "para que", "nadie lo sabe", "si te digo te miento", "Nop","Si", "mentira", "es cierto", "quien lo dice", "NO LO SE", "QUEEE", "Desde ya que si", "no cuentes con eso", "Hazlo", "TE AVERIGUO","ni idea", "mejor no te contesto", "ni idea"};
                Random rand = new Random();

                int n = rand.nextInt(35);
                String z = x [n];

                Log.d("Hola",x[n]);

                messageTextView.setText(z);
            }
        });
    }
}