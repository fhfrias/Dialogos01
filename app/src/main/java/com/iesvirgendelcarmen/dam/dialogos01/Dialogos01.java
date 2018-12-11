package com.iesvirgendelcarmen.dam.dialogos01;

import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dialogos01 extends AppCompatActivity {

    Button boton1, boton2, boton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogos01);
        boton1 = findViewById(R.id.boton1);
        boton2 = findViewById(R.id.boton2);
        boton3 = findViewById(R.id.boton3);

        escucharBotnones();

    }

    @Override
    protected Dialog onCreateDialog(int id) {
        Dialog dialogo = null;
        switch (id){
            case 0:
                AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
                builder1.setIcon(R.mipmap.ic_launcher);
                builder1.setTitle("DIALOGO 1");
                dialogo = builder1.create();
                return dialogo;
            case 1:
                AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
                builder2.setIcon(R.mipmap.ic_launcher);
                builder2.setTitle("DIALOGO 2");
                dialogo = builder2.create();
                return dialogo;
            case 2:
                AlertDialog.Builder builder3 = new AlertDialog.Builder(this);
                builder3.setIcon(R.mipmap.ic_launcher);
                builder3.setTitle("DIALOGO 3");
                dialogo = builder3.create();
                return dialogo;
        }
        return super.onCreateDialog(id);
    }

    public void escucharBotnones(){
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(0);
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(1);
            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(2);
            }
        });
    }
}
