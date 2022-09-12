package com.example.widgets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    RadioButton r1,r2,r3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1= (RadioButton) findViewById(R.id.idRadio1);
        r2= (RadioButton) findViewById(R.id.idRadio2);
        r3= (RadioButton) findViewById(R.id.idRadio3);

        Button btnInsertar = findViewById(R.id.buttonSgte2);
        btnInsertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void onclick (View view){
        if (view.getId()==R.id.btn2) {
            validar();
        }

    }
    private void validar () {
        String cad="Seleccionado: \n";

        if (r1.isChecked()==true){
            cad+="Años 70";
        }
        if (r2.isChecked()) {
            cad += "Años 80";
        }
        if (r3.isChecked()) {
            cad += "Años 90";
        }

        Toast.makeText(getApplicationContext(), cad,Toast.LENGTH_SHORT).show();

    }
}