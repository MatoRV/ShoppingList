package com.politecnicomalaga.shopping_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    public static final String ARTICULO_EXTRA = "com.example.android.shopping_list.extra.ARTICULO";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    public void addArt1(View view) {
        String articulo = getResources().getString(R.string.tvArt1);

        Intent resultIntent = new Intent();
        resultIntent.putExtra(ARTICULO_EXTRA, articulo);

        setResult(RESULT_OK, resultIntent);
        finish();
    }

    public void addArt2(View view) {
        String articulo = getResources().getString(R.string.tvArt2);

        Intent resultIntent = new Intent();
        resultIntent.putExtra(ARTICULO_EXTRA, articulo);

        setResult(RESULT_OK, resultIntent);
        finish();
    }

    public void addArt3(View view) {
        String articulo = getResources().getString(R.string.tvArt3);

        Intent resultIntent = new Intent();
        resultIntent.putExtra(ARTICULO_EXTRA, articulo);

        setResult(RESULT_OK, resultIntent);
        finish();
    }

    public void addArt4(View view) {
        String articulo = getResources().getString(R.string.tvArt4);

        Intent resultIntent = new Intent();
        resultIntent.putExtra(ARTICULO_EXTRA, articulo);

        setResult(RESULT_OK, resultIntent);
        finish();
    }

    public void addArt5(View view) {
        String articulo = getResources().getString(R.string.tvArt5);

        Intent resultIntent = new Intent();
        resultIntent.putExtra(ARTICULO_EXTRA, articulo);

        setResult(RESULT_OK, resultIntent);
        finish();
    }

    public void addArt6(View view) {
        String articulo = getResources().getString(R.string.tvArt6);

        Intent resultIntent = new Intent();
        resultIntent.putExtra(ARTICULO_EXTRA, articulo);

        setResult(RESULT_OK, resultIntent);
        finish();
    }

    public void addArt7(View view) {
        String articulo = getResources().getString(R.string.tvArt7);

        Intent resultIntent = new Intent();
        resultIntent.putExtra(ARTICULO_EXTRA, articulo);

        setResult(RESULT_OK, resultIntent);
        finish();
    }

    public void addArt8(View view) {
        String articulo = getResources().getString(R.string.tvArt8);

        Intent resultIntent = new Intent();
        resultIntent.putExtra(ARTICULO_EXTRA, articulo);

        setResult(RESULT_OK, resultIntent);
        finish();
    }

    public void addArt9(View view) {
        String articulo = getResources().getString(R.string.tvArt9);

        Intent resultIntent = new Intent();
        resultIntent.putExtra(ARTICULO_EXTRA, articulo);

        setResult(RESULT_OK, resultIntent);
        finish();
    }

    public void addArt10(View view) {
        String articulo = getResources().getString(R.string.tvArt10);

        Intent resultIntent = new Intent();
        resultIntent.putExtra(ARTICULO_EXTRA, articulo);

        setResult(RESULT_OK, resultIntent);
        finish();
    }
}