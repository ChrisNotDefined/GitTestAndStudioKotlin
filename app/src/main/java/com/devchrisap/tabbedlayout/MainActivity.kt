package com.devchrisap.tabbedlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager.widget.PagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbarInitializer()
        tabLayoutInitializer()
        ViewPagerInitializer()

    }

    fun toolbarInitializer() {
        setSupportActionBar(appbar)
    }

    fun tabLayoutInitializer() {
        AppBarTabs.addTab(AppBarTabs.newTab().setText("Aplicación 1"))
        AppBarTabs.addTab(AppBarTabs.newTab().setText("Aplicación 2"))
        AppBarTabs.addTab(AppBarTabs.newTab().setText("Aplicación 3"))
        AppBarTabs.tabGravity = TabLayout.GRAVITY_FILL
    }

    fun ViewPagerInitializer() {
        var adapter = PageAdapter(supportFragmentManager, AppBarTabs.tabCount)
        pager.adapter = adapter

        // Connect viewPager and tabbedLayout
        pager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(AppBarTabs))



        AppBarTabs.addOnTabSelectedListener(object :
            OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                pager.currentItem = tab!!.position

                if(tab!!.position == 0) {
                    supportActionBar!!.title = "Aplicación 1"
                } else if (tab!!.position == 1) {
                    supportActionBar!!.title = "Aplicación 2"
                } else if (tab!!.position == 2) {
                    supportActionBar!!.title = "Aplicación 3"
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

        }
        )
    }
}