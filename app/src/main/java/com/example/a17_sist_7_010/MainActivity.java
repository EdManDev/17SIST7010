package com.example.a17_sist_7_010;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  ImageButton play_pause, btn_repetir;
  MediaPlayer mp;
  ImageView iv;
  int repetir = 2, posicion = 0;

  MediaPlayer vectormp[] = new MediaPlayer[3];

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    play_pause = (ImageButton) findViewById(R.id.btn_play);
    btn_repetir = (ImageButton) findViewById(R.id.btn_repetir);
    iv = (ImageView) findViewById(R.id.imageView);

    vectormp[0] = MediaPlayer.create(this, R.raw.sound_long);
    vectormp[1] = MediaPlayer.create(this, R.raw.nightcore_rasputin);
    vectormp[2] = MediaPlayer.create(this, R.raw.fabrice_rouzier_g_);
  }

  // Methode for  Button Pause
  public void PlayPause(View view) {
    if (vectormp[posicion].isPlaying()) {
      vectormp[posicion].pause();
      play_pause.setBackgroundResource(R.drawable.reproducir);
      Toast.makeText(this, "Pausa", Toast.LENGTH_SHORT).show();
    } else {
      vectormp[posicion].start();
      play_pause.setBackgroundResource(R.drawable.pausa);
      Toast.makeText(this, "Play", Toast.LENGTH_SHORT).show();
    }
  }

  // Methode for Stop Button
  public void Stop(View view) {
    if (vectormp[posicion] != null) {
      vectormp[posicion].stop();

      vectormp[0] = MediaPlayer.create(this, R.raw.sound_long);
      vectormp[1] = MediaPlayer.create(this, R.raw.nightcore_rasputin);
      vectormp[2] = MediaPlayer.create(this, R.raw.fabrice_rouzier_g_);
      posicion = 0;

      play_pause.setBackgroundResource(R.drawable.reproducir);
      iv.setImageResource(R.drawable.portada1);
      Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();
    }
  }

  // Methode for Reapeat Muisic
  public void Repetir(View view){
    if(repetir == 1){
      btn_repetir.setBackgroundResource(R.drawable.no_repetir);
      Toast.makeText(this, "No repetir", Toast.LENGTH_SHORT).show();
      vectormp[posicion].setLooping(false);
      repetir = 2;
    } else {
      btn_repetir.setBackgroundResource(R.drawable.repetir);
      Toast.makeText(this, "Repetir", Toast.LENGTH_SHORT).show();
      vectormp[posicion].setLooping(true);
      repetir = 1;
    }
  }

  // Methode For the next Music
  public void Siguiente(View view){
    if(posicion < vectormp.length -1){

      if(vectormp[posicion].isPlaying()){
        vectormp[posicion].stop();
        posicion++;
        vectormp[posicion].start();

        if(posicion == 0){
          iv.setImageResource(R.drawable.portada1);
        } else if(posicion == 1){
          iv.setImageResource(R.drawable.portada2);
        }else if(posicion == 2){
          iv.setImageResource(R.drawable.portada3);
        }

      } else {
        posicion++;

        if(posicion == 0){
          iv.setImageResource(R.drawable.portada1);
        } else if(posicion == 1){
          iv.setImageResource(R.drawable.portada2);
        }else if(posicion == 2){
          iv.setImageResource(R.drawable.portada3);
        }
      }

    } else {
      Toast.makeText(this, "No hay más canciones", Toast.LENGTH_SHORT).show();
    }
  }

  // Methode to step back Music
  public void Anterior(View view){
    if(posicion >= 1){

      if(vectormp[posicion].isPlaying()){
        vectormp[posicion].stop();
        vectormp[0] = MediaPlayer.create(this, R.raw.sound_long);
        vectormp[1] = MediaPlayer.create(this, R.raw.nightcore_rasputin);
        vectormp[2] = MediaPlayer.create(this, R.raw.fabrice_rouzier_g_);
        posicion--;

        if(posicion == 0){
          iv.setImageResource(R.drawable.portada1);
        } else if(posicion == 1){
          iv.setImageResource(R.drawable.portada2);
        }else if(posicion == 2){
          iv.setImageResource(R.drawable.portada3);
        }

        vectormp[posicion].start();

      } else {
        posicion--;

        if(posicion == 0){
          iv.setImageResource(R.drawable.portada1);
        } else if(posicion == 1){
          iv.setImageResource(R.drawable.portada2);
        }else if(posicion == 2){
          iv.setImageResource(R.drawable.portada3);
        }
      }

    } else {
      Toast.makeText(this, "No hay más canciones", Toast.LENGTH_SHORT).show();
    }
  }

}