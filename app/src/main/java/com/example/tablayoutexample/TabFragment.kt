package com.example.tablayoutexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class TabFragment : Fragment() {

    lateinit var mTab : TabLayout
    lateinit var mPager : ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val lView = inflater.inflate(R.layout.fragment_tab, container, false)
        mTab = lView.findViewById(R.id.tabLayout)
        mPager = lView.findViewById(R.id.pager)
        mPager.adapter = ViewPagerAdapter()

        TabLayoutMediator(mTab, mPager) {pTab, position ->
            when(position) {
                0 -> pTab.text = "Tab One"
                1 -> pTab.text = "Tab Two"
                2 -> pTab.text = "Tab Three"
            }
        }.attach()

        return lView
    }


}