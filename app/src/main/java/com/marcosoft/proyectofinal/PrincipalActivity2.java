package com.marcosoft.proyectofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrincipalActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Button mReportarButton = (Button) findViewById(R.id.btnDenunciaLuminotecnia);
        mReportarButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick (View v){
                Intent ListSong = new Intent(getApplicationContext(), Reportar2Activity.class);
                startActivity(ListSong);
            }
        });
    }
}
