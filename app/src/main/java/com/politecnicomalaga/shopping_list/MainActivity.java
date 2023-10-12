package com.politecnicomalaga.shopping_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 1; //Código de solicitud para la segunda actividad


    private TextView[] artList = new TextView[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Inicializa los Textview
        for (int i = 0 ; i < artList.length; i++) {
            // Para obtener la Id de cada TextView
            int textViewId = getResources().getIdentifier("tvList" + (i + 1), "id", getPackageName());
            artList[i] = findViewById(textViewId);
        }
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        startActivityForResult(intent, REQUEST_CODE);
    }

    // Método para recibir el resultado de la segunda actividad
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                String artSelect = data.getStringExtra(SecondActivity.ARTICULO_EXTRA);
                if (artSelect != null) {
                    // Busca un TextView vacío y agrega el artículo seleccionado
                    for (TextView textView : artList) {
                        if (textView.getText().toString().isEmpty()) {
                            textView.setText(artSelect);
                            break;
                        }
                    }
                }
            }
        }
    }
}