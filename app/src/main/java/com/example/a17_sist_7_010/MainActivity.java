package com.example.a17_sist_7_010;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

  private EditText et1;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    et1 = (EditText)findViewById(R.id.txt_mail);

    SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
    et1.setText(preferences.getString("mail", ""));
  }

  //  Methodo para el Button Guardar
  public void Guardar(View view){
    SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
    SharedPreferences.Editor Obj_editor = preferences.edit();
    Obj_editor.putString("mail", et1.getText().toString());
    Obj_editor.commit();
    finish();
  }
}
