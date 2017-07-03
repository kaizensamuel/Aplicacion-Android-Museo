package com.example.tati.appmuseo;

import java.util.Timer;
import java.util.TimerTask;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;

public class Splash extends Activity {

    // Definimos la duración que queremos que tenga
    private static final long SPLASH_SCREEN_DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Establecemos la orientación fija a portrait
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        // Y ocultamos cualquier barra superior que podamos tener
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        // Cargamos la vista de nuestro Splash Screen
        setContentView(R.layout.splash);

        // Con TimerTask definimos la tarea que vamos a ejecutar
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                // Iniciamos la siguiente activity, Principal
                Intent mainIntent = new Intent().setClass(
                        Splash.this, Principal.class);
                startActivity(mainIntent);

                // Cerramos el activity de Screen Splash para que
                // el usuario no pueda regresar a ella tras retroceder
                // en la aplicación
                finish();
            }
        };

        // Por último, simulamos la carga de datos esperando el tiempo
        // definido inicialmente. Con Timer y su método schedule le decimos
        // a la tarea definida con TimerTask, cuánto tiempo tiene que esperar
        // para iniciarse.
        Timer timer = new Timer();
        timer.schedule(task, SPLASH_SCREEN_DELAY);
    }

}
