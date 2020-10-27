package kr.hs.emirim.s2019w04.mirimhighlevelwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.RadioButton;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    RadioButton radioDate, radioTime;
    CalendarView calendar1;
    TimePicker timePick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);
        radioDate = findViewById(R.id.radio_date);
        radioTime = findViewById(R.id.radio_time);
        radioDate.setOnClickListener(radioListener);
        radioTime.setOnClickListener(radioListener);
        calendar1 = findViewById(R.id.calendar1);
        timePick = findViewById(R.id.time_pick);
    }
    View.OnClickListener radioListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.radio_date:
                    calendar1.setVisibility(View.VISIBLE);
                    timePick.setVisibility(View.INVISIBLE);
                    break;
                case R.id.radio_time:
                    calendar1.setVisibility(View.INVISIBLE);
                    timePick.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}