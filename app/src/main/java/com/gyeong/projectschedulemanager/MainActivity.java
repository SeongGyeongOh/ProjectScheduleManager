package com.gyeong.projectschedulemanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

//프로젝트 목표
//1. 서비스, AlarmManager 복습
//2. 달력, 특정 일자 선택 연습
//3. Notificatin 연습

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}