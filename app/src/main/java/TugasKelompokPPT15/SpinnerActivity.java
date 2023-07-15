package TugasKelompokPPT15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.RelativeLayoutActivity;

public class SpinnerActivity extends AppCompatActivity {
    Spinner umur;
    Spinner program;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        umur = (Spinner) findViewById(R.id.spumur);
        program = (Spinner) findViewById(R.id.sppro);
        ok = (Button) findViewById(R.id.btn);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SpinnerActivity.this,
                        "Anda memilih kelas " + program.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            };
        });
    }
}