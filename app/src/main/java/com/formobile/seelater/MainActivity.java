package com.formobile.seelater;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.RelativeLayout;

class seriesObjeto {
    String nome_serie;
    String nome_produtora;
    int classificacao1;
}

public class MainActivity extends AppCompatActivity {
    private static final String CATEGORIA = "Script";
    Button b1;

    //CICLO DE VIDA
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.activity_main);

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, InicialActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Log.i(CATEGORIA, getClassName() + ".onCreate();");
    }

    public void onStart() {
        super.onStart();
        Log.i(CATEGORIA, getClassName() + ".onStart();");
    }

    public void onRestart() {
        super.onStart();
        Log.i(CATEGORIA, getClassName() + ".onRestart();");
    }

    public void onResume() {
        super.onStart();
        Log.i(CATEGORIA, getClassName() + ".onResume();");
    }

    public void onPause() {
        super.onStart();
        Log.i(CATEGORIA, getClassName() + ".onPause();");
    }

    public void onStop() {
        super.onStart();
        Log.i(CATEGORIA, getClassName() + ".onStop();");
    }

    public void onDestroy() {
        super.onStart();
        Log.i(CATEGORIA, getClassName() + ".onDestroy();");
    }
    //CICLO DE VIDA

    private String getClassName() {
        String aux = getClass().getName();
        return (aux.substring(aux.lastIndexOf(".") + 1));
    }

    public void startInicialActivity(View v) {
        Intent intent = new Intent(this, InicialActivity.class);
        startActivity(intent);
    }

    public void startSecondActivity(View view) {
        Intent secondActivity = new Intent(this, InicialActivity.class);
        startActivity(secondActivity);
    }
}