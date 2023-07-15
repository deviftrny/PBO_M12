package TugasKelompokPPT15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.RegisterActivity;

public class EditTextActivity extends AppCompatActivity {
    Button daftar;
    EditText nama, nomor, email, pw, konfpw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        daftar = (Button) findViewById(R.id.btnlgn);
        nama = (EditText) findViewById(R.id.inputtxt);
        nomor = (EditText) findViewById(R.id.inputtxt2);
        email = (EditText) findViewById(R.id.inputtxt3);
        pw = (EditText) findViewById(R.id.inputtxt4);
        konfpw = (EditText) findViewById(R.id.inputtxt5);

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nama.getText().toString();
                String tlp = nomor.getText().toString();
                String eml = email.getText().toString();
                String pass = pw.getText().toString();
                String pass2 = konfpw.getText().toString();

                if (name.isEmpty()) {
                    Toast.makeText(EditTextActivity.this, "Nama tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else if (tlp.isEmpty()) {
                    Toast.makeText(EditTextActivity.this, "Nomor Telepon tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else if (eml.isEmpty()) {
                    Toast.makeText(EditTextActivity.this, "Email tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else if (pass.isEmpty()) {
                    Toast.makeText(EditTextActivity.this, "Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else if (pass2.isEmpty()){
                    Toast.makeText(EditTextActivity.this, "Konfirmasi ulang password", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(EditTextActivity.this, "Anda Berhasil Mendaftar", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}