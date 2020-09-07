package com.gyeong.projectschedulemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
}