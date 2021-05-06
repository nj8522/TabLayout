package com.example.tablayoutexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter : RecyclerView.Adapter<ViewPagerAdapter.ViewModel>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewModel {
        val lLayoutInflater = LayoutInflater.from(parent.context)
        val lView = lLayoutInflater.inflate(
            R.layout.dummy_layout,
            parent,
            false
        )

        return ViewModel(lView)
    }

    override fun onBindViewHolder(holder: ViewModel, position: Int) {}

    override fun getItemCount(): Int = 3

    class ViewModel(pView : View) : RecyclerView.ViewHolder(pView) {

    }

}