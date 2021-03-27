package com.example.a17_sist_7_010;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

  private EditText et1;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    et1 = (EditText)findViewById(R.id.txt_web);
  }

  // Methodo boton ir
  public void Navegar (View view) {
    Intent i = new Intent(this, MainActivity2.class);
    i.putExtra("sitioWeb", et1.getText().toString());
    startActivity(i);
  }
}