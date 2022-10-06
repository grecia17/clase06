package com.example.clase06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txtCliente, xtxtdni;
    private RadioButton rbtDuo, rbtTrio;
    private Button btnCalcular, btnImprimir;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCliente = findViewById(R.id.edtCliente);
        xtxtdni = findViewById(R.id.edtDni);

        rbtDuo = findViewById(R.id.rbtnDuo);
        rbtTrio = findViewById(R.id.rbtnTrio);

        radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton = findViewById(i);
                if (rbtDuo.getId()==radioButton.getId()){

                }
                Toast.makeText(getApplication(),""+radioButton.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });

        btnCalcular = findViewById(R.id.btnCalcular);
        btnImprimir = findViewById(R.id.btnImprimir);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnImprimir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(),MainActivity2.class);
                intent.putExtra("Cliente",txtCliente.getText().toString());
                startActivity(intent);
            }
        });
    }
}