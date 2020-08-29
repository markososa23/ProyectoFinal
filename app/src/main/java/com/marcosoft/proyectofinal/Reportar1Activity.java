package com.marcosoft.proyectofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reportar1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportar1);

        Button mReportarButton = (Button) findViewById(R.id.btnSiguiente);
        mReportarButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick (View v){
                Intent ListSong = new Intent(getApplicationContext(), Reportar2Activity.class);
                startActivity(ListSong);
            }
        });
    }
}
