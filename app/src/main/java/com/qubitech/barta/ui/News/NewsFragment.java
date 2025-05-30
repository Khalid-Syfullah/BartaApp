package com.qubitech.barta.ui.News;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.qubitech.barta.R;
import com.qubitech.barta.ui.News.ViewPager.NewsSectionPagerAdapter;

public class NewsFragment extends Fragment {


    private NewsSectionPagerAdapter sectionsPagerAdapter;
    private ViewPager viewPager;
    private TabLayout tabs;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_news, container, false);
        sectionsPagerAdapter = new NewsSectionPagerAdapter(getChildFragmentManager(), getContext());
        viewPager = root.findViewById(R.id.news_frag_view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);

        tabs = root.findViewById(R.id.news_frag_tabs);
        tabs.setupWithViewPager(viewPager);
        return root;
    }
}