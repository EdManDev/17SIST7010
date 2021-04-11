package com.example.a17_sist_7_010;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void Selection(View view) {
    switch (view.getId()) {
      case R.id.fresas:
        Toast.makeText(this, "Estas son Fresas", Toast.LENGTH_SHORT).show();
        break;
      case R.id.manzana:
        Toast.makeText(this, "Estas son manzanas", Toast.LENGTH_SHORT).show();;
        break;
      case R.id.pina:
        Toast.makeText(this, "Estas son Pinas", Toast.LENGTH_SHORT).show();
        break;
      case R.id.frambuesas:
        Toast.makeText(this, "Estas son frambuesas", Toast.LENGTH_SHORT).show();
        break;
      case R.id.kiwis:
        Toast.makeText(this, "Estas son kiwis", Toast.LENGTH_SHORT).show();
        break;
      case R.id.mangos:
        Toast.makeText(this, "Estas son mangos", Toast.LENGTH_SHORT).show();
        break;
      case R.id.naranjas:
        Toast.makeText(this, "Estas son naranjas", Toast.LENGTH_SHORT).show();
        break;
      case R.id.sandia:
        Toast.makeText(this, "Estas son sandia", Toast.LENGTH_SHORT).show();
        break;
      case R.id.uvas:
        Toast.makeText(this, "Estas son uvas", Toast.LENGTH_SHORT).show();
        break;
      case R.id.zarzamora:
        Toast.makeText(this, "Estas son zarzamora", Toast.LENGTH_SHORT).show();
        break;
      case R.id.bananas:
        Toast.makeText(this, "Estas son bananas", Toast.LENGTH_SHORT).show();
        break;
      case R.id.pera:
        Toast.makeText(this, "Estas son pera", Toast.LENGTH_SHORT).show();
        break;
      case R.id.melon:
        Toast.makeText(this, "Estas son melon", Toast.LENGTH_SHORT).show();
        break;
    }
  }
}
