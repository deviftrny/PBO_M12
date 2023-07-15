package TugasKelompokPPT15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.HomeMenuActivity;
import com.example.myapplication.LinearLayoutActivity;
import com.example.myapplication.R;

public class ButtonActivity extends AppCompatActivity {

    Button textView, imageView, editText, checkbox, toggle, sw, radio, spinner, time, date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        textView = (Button) findViewById(R.id.btnTextView);
        imageView = (Button) findViewById(R.id.btnImageView);
        editText = (Button) findViewById(R.id.btnEditText);
        checkbox = (Button) findViewById(R.id.btnCheckbox);
        toggle = (Button) findViewById(R.id.btnToggleButton);
        sw = (Button) findViewById(R.id.btnSwitch);
        radio = (Button) findViewById(R.id.btnRadioButton);
        spinner = (Button) findViewById(R.id.btnSpinner);
        time = (Button) findViewById(R.id.btnTimePicker);
        date = (Button) findViewById(R.id.btnDatePicker);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent text = new Intent(ButtonActivity.this, TextViewActivity.class);
                startActivity(text);
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img = new Intent(ButtonActivity.this, ImageViewActivity.class);
                startActivity(img);
            }
        });

        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent edit = new Intent(ButtonActivity.this, EditTextActivity.class);
                startActivity(edit);
            }
        });

        checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent check = new Intent(ButtonActivity.this, CheckboxActivity.class);
                startActivity(check);
            }
        });

        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tog = new Intent(ButtonActivity.this, ToggleButtonActivity.class);
                startActivity(tog);
            }
        });

        sw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent swt = new Intent(ButtonActivity.this, SwitchActivity.class);
                startActivity(swt);
            }
        });

        radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rd = new Intent(ButtonActivity.this, RadioActivity.class);
                startActivity(rd);
            }
        });

        spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent spn = new Intent(ButtonActivity.this, SpinnerActivity.class);
                startActivity(spn);
            }
        });

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tm = new Intent(ButtonActivity.this, TimePickerActivity.class);
                startActivity(tm);
            }
        });

        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dt = new Intent(ButtonActivity.this, DatePickerActivity.class);
                startActivity(dt);
            }
        });
    }
}