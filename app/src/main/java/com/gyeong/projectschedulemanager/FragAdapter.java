package com.gyeong.projectschedulemanager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragAdapter extends FragmentPagerAdapter {
    Fragment[] fragments=new Fragment[2];
    String[] tabtitles=new String[]{"일정 추가", "일정 관리"};

    public FragAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);

        fragments[0]=new Tab01();
        fragments[1]=new Tab02();

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabtitles[position];
    }
}
