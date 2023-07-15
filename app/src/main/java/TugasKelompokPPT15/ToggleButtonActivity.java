package TugasKelompokPPT15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.myapplication.R;

public class ToggleButtonActivity extends AppCompatActivity {
    ToggleButton outline, kamera, skill, hd, buta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        outline = (ToggleButton) findViewById(R.id.tbout);
        kamera = (ToggleButton) findViewById(R.id.tbkamera);
        skill = (ToggleButton) findViewById(R.id.tbskill);
        hd = (ToggleButton) findViewById(R.id.tbhd);
        buta = (ToggleButton) findViewById(R.id.tbbuta);
    }

    public void onSwitchClick(View view) {
        if (outline.isChecked()) {
            Toast.makeText(this, "Outline ON", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Outline OFF", Toast.LENGTH_SHORT).show();
        }
    }

    public void onSwitchClick2(View view) {
        if (kamera.isChecked()) {
            Toast.makeText(this, "Tinggi Kamera ON", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Tinggi Kamera OFF", Toast.LENGTH_SHORT).show();
        }
    }

    public void onSwitchClick3(View view) {
        if (skill.isChecked()) {
            Toast.makeText(this, "Vibrasi Skill ON", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Vibrasi Skill OFF", Toast.LENGTH_SHORT).show();
        }
    }

    public void onSwitchClick4(View view) {
        if (hd.isChecked()) {
            Toast.makeText(this, "Mode HD ON", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Mode HD OFF", Toast.LENGTH_SHORT).show();
        }
    }

    public void onSwitchClick5(View view) {
        if (buta.isChecked()) {
            Toast.makeText(this, "Filter Buta Warna ON", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Filter Buta Warna OFF", Toast.LENGTH_SHORT).show();
        }
    }
}