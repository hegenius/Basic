package com.example.app07_viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentAdapter(fragmentActivity: FragmentActivity):FragmentStateAdapter(fragmentActivity) {
    var fragmentList = listOf<Fragment>()
    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment { // 선택된 곳 위치값
        return fragmentList[position]
    }
}