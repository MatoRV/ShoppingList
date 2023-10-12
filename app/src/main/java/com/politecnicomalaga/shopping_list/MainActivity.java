package com.politecnicomalaga.shopping_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 1; //Código de solicitud para la segunda actividad

    private static final String LOG_TAG = MainActivity.class.getSimpleName();


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

        Log.d(LOG_TAG, "--------");
        Log.d(LOG_TAG, "onCreate");



        if (savedInstanceState != null) {
            for (int j = 0; j < artList.length; j++) {
                boolean isEmpty = savedInstanceState.getBoolean("tv_notEmpty" + (j + 1));
                if (isEmpty) {
                    artList[j].setText(savedInstanceState.getString("tv_text" + (j + 1)));
                }
            }
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

    // Este método revisa si están vacíos los TextView para que no se borren al girar la pantalla
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        for (int i = 0; i < artList.length; i++) {
            if (!artList[i].getText().toString().isEmpty()) {
                outState.putBoolean("tv_notEmpty" + (i + 1), true);
                outState.putString("tv_text"+ (i + 1), artList[i].getText().toString());
            }
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

}