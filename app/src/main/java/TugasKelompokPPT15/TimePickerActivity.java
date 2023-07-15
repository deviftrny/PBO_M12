package TugasKelompokPPT15;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.myapplication.R;

import java.util.Calendar;

public class TimePickerActivity extends AppCompatActivity {
    TextView waktu;
    int Hour, Minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
        waktu = (TextView) findViewById(R.id.tvset);

        waktu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(
                        TimePickerActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        Hour = hourOfDay;
                        Minute = minute;

                        Calendar calendar = Calendar.getInstance();
                        calendar.set(0, 0, 0, Hour, Minute);

                        waktu.setText(DateFormat.format("hh:mm aa", calendar));
                    }
                },12,0,false
                );

                timePickerDialog.updateTime(Hour, Minute);
                timePickerDialog.show();
            }
        });
    }
}