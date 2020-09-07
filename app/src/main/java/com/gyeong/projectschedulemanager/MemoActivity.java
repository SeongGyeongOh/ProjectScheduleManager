package com.gyeong.projectschedulemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

import com.prolificinteractive.materialcalendarview.CalendarDay;

import java.util.Date;

public class MemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo);

        Intent intent=getIntent();
        CalendarDay date= (CalendarDay) intent.getExtras().get("date");
        Date d=date.getDate();
        Toast.makeText(this, d+"", Toast.LENGTH_SHORT).show();
    }

    public void clickBtn(View view) {
    }

    public void clickTimeSet(View view) {
        TimePickerDialog dialog=new TimePickerDialog(this, listener, 10, 10, true);
        dialog.show();

    }

    TimePickerDialog.OnTimeSetListener listener=new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker timePicker, int i, int i1) {

        }
    };
}