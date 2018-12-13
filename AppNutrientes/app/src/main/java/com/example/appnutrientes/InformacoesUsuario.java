package com.example.appnutrientes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InformacoesUsuario extends AppCompatActivity {
    private Button botao_pedir_dados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacoes_usuario);

        botao_pedir_dados = findViewById(R.id.informar_dados);



    }

    public void ir_para_pedir_dados(View view) {
    }
}
