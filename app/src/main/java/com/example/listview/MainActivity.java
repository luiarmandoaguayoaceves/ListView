package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;

    private String nombre [] = {"Samuel", "Valentina", "Santiago", "Alejandro", "Valeria", "Benjamin",
    "Gerardo", "carlos", "David", "Sofia"};
    private String edades [] = {"18", "25", "32", "17", "24", "20", "27", "15", "19", "23"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        lv1 = (ListView) findViewById(R.id.lv1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_items, nombre);
        lv1.setAdapter(adapter);

                                //Solicita clase anonima lo que esta dentro del parentesis
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //metodo que asigna un orden al array y lo muetra mediante el entero i
                tv1.setText("La edad de " + lv1.getItemAtPosition(i) + " es " + edades[i] + " años");
            }
        });
    }
}