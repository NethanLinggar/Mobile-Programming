package com.example.hitungluas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.fathzer.soft.javaluator.DoubleEvaluator;

public class MainActivity extends AppCompatActivity {
    //  Hitung Luas
    private EditText edtPanjang, edtLebar;
    private Button btnHitungLuas;
    private TextView txtLuas;

    //  String Calculator
    private EditText txtInput;
    private Button btnStringCalculator;
    private TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  Hitung Luas
        edtPanjang = findViewById(R.id.edt_panjang);
        edtLebar = findViewById(R.id.edt_lebar);
        btnHitungLuas = findViewById(R.id.btn_hitung);
        txtLuas = findViewById(R.id.txtLuas);

        btnHitungLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = edtPanjang.getText().toString().trim();
                String lebar = edtLebar.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);

                double luas = p * l;

                txtLuas.setText("Luas : "+luas);
            }
        });

        //  Hitung Luas
        txtInput = findViewById(R.id.txtInput);
        btnStringCalculator = findViewById(R.id.btnStringCalculator);
        txtHasil = findViewById(R.id.txtHasil);

        btnStringCalculator.setOnClickListener(view -> {
            String txtInputed = txtInput.getText().toString().trim();

            DoubleEvaluator eval = new DoubleEvaluator();
            Double result = eval.evaluate(txtInputed);

            txtHasil.setText("Hasil : "+result);
        });
    }

}