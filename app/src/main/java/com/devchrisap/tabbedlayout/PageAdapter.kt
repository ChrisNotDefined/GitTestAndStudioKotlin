package com.devchrisap.tabbedlayout

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PageAdapter(fm: FragmentManager, behavior: Int) : FragmentPagerAdapter(fm, behavior) {

    var numberOfTabs = behavior

    override fun getCount(): Int {
        return  numberOfTabs
    }

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> {
                var fragment1 = Fragmento1()
                return fragment1
            }
            1 -> {
                var fragment2 = Fragmento2()
                return fragment2
            }
            2 -> {
                var fragment3 = Fragmento3()
                return fragment3
            }
            else -> {
                var fragment1 = Fragmento1()
                return fragment1
            }
        }
    }
}