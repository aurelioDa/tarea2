package com.example.salto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;

public class paginaweb extends AppCompatActivity {
WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paginaweb);

        webview = (WebView) findViewById(R.id.webview);

        Bundle bundle = getIntent().getExtras();
        String usando = bundle.getString("URLpagina");
        webview.loadUrl("https://"+usando);
    }
}