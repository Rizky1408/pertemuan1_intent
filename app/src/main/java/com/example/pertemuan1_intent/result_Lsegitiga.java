package com.example.pertemuan1_intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class result_Lsegitiga extends AppCompatActivity {
    EditText alas,tinggi;
    Button btnButton;
    TextView thasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_lsegitiga);

        alas=(EditText)findViewById(R.id.input_alas);
        tinggi=(EditText)findViewById(R.id.input_tinggi);
        btnButton=(Button)findViewById(R.id.button3);
        thasil=(TextView)findViewById(R.id.output_hasil);
        
        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                double bil1,bil2,hasil;
                bil1 = Double.valueOf(alas.getText().toString().trim());
                bil2 = Double.valueOf(tinggi.getText().toString().trim());

                hasil =(bil1 / 2) * bil2;
                String Hasil = String.valueOf(hasil);
                thasil.setText(Hasil);
            }
        });
    }
}