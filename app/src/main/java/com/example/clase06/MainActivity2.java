package com.example.clase06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView tvcliente, tvdni, tvser, tvcs, tvci, tvdes, tvtp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvcliente =findViewById(R.id.tvCliente);
        tvdni = findViewById(R.id.tvDni);
        tvser = findViewById(R.id.tvServicio);
        tvcs = findViewById(R.id.tvCostoServicio);
        tvci = findViewById(R.id.tvCostoInstalacion);
        tvdes = findViewById(R.id.tvDescuento);
        tvtp = findViewById(R.id.tvTotalPagar);

        Bundle datos = this.getIntent().getExtras();
        tvcliente.setText("Cliente: "+datos.getString("cliente"));
    }
}