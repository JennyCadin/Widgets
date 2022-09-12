package com.example.widgets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    CheckBox c1,c2,c3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1= (CheckBox) findViewById(R.id.idChec1);
        c2= (CheckBox) findViewById(R.id.idChec2);
        c3= (CheckBox) findViewById(R.id.idChec3);

        Button btnInsertar = findViewById(R.id.buttonSgte);
        btnInsertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        }

        public void onclick (View view){
            if (view.getId()==R.id.btn1) {
                validar();
            }

        }
        private void validar () {
            String cad="Seleccionado: \n";

            if (c1.isChecked()==true){
                cad+="Años 70";
            }
            if (c2.isChecked()) {
                cad += "Años 80";
            }
            if (c3.isChecked()) {
                cad += "Años 90";
            }

            Toast.makeText(getApplicationContext(), cad,Toast.LENGTH_SHORT).show();

        }
    }