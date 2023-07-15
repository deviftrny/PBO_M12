package TugasKelompokPPT15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;

public class CheckboxActivity extends AppCompatActivity {
    CheckBox brownies, bolu, coco, german, key, tiramisu, kaas, sagu, cupcakes, straw;
    Button pilih;
    TextView tampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        brownies = (CheckBox) findViewById(R.id.cbcake);
        bolu = (CheckBox) findViewById(R.id.cbcake2);
        coco = (CheckBox) findViewById(R.id.cbcake3);
        german = (CheckBox) findViewById(R.id.cbcake4);
        key = (CheckBox) findViewById(R.id.cbcake5);
        tiramisu = (CheckBox) findViewById(R.id.cbcake6);
        kaas = (CheckBox) findViewById(R.id.cbcake7);
        sagu = (CheckBox) findViewById(R.id.cbcake8);
        cupcakes = (CheckBox) findViewById(R.id.cbcake9);
        straw = (CheckBox) findViewById(R.id.cbcake10);
        pilih = (Button) findViewById(R.id.btncake);
        tampil = (TextView) findViewById(R.id.tvtampil);

        pilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalAmount = 0;
                StringBuilder result = new StringBuilder();
                result.append(" Anda Memesan: \n");

                if (brownies.isChecked()){
                    result.append("\n Brownies \t\t\t\t\t\t\t\t\t\t\t\t\t\t\tRp 25.000");
                    totalAmount += 25000;
                }

                if (bolu.isChecked()){
                    result.append("\n Bolu \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tRp 40.000");
                    totalAmount += 40000;
                }

                if (coco.isChecked()){
                    result.append("\n Coco Cake \t\t\t\t\t\t\t\t\t\t\t\t\tRp 145.000");
                    totalAmount += 145000;
                }

                if (german.isChecked()){
                    result.append("\n German Black Forest \t\t\t\tRp 165.000");
                    totalAmount += 165000;
                }

                if (key.isChecked()){
                    result.append("\n Key Lime Pie \t\t\t\t\t\t\t\t\t\t\tRp 120.000");
                    totalAmount += 120000;
                }

                if (tiramisu.isChecked()){
                    result.append("\n Super Tiramisu Cake \t\t\t\t\tRp 220.000");
                    totalAmount += 220000;
                }

                if (kaas.isChecked()){
                    result.append("\n Kaastengel \t\t\t\t\t\t\t\t\t\t\t\t\tRp 185.000");
                    totalAmount += 185000;
                }

                if (sagu.isChecked()){
                    result.append("\n Sagu Keju \t\t\t\t\t\t\t\t\t\t\t\t\t\tRp 75.000");
                    totalAmount += 75000;
                }

                if (cupcakes.isChecked()){
                    result.append("\n Cupcakes \t\t\t\t\t\t\t\t\t\t\t\t\t\tRp 50.000");
                    totalAmount += 50000;
                }

                if (straw.isChecked()){
                    result.append("\n Strawberry Surprise \t\t\t\t\t\tRp 36.000");
                    totalAmount += 36000;
                }

                result.append("\n ================================ " +
                              "\n Total Pesanan:                    Rp " + totalAmount);
                tampil.setText(result.toString());
            }
        });
    }
}