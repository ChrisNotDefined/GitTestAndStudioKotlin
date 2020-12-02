package com.devchrisap.tabbedlayout

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_fragmento3.*
import kotlinx.android.synthetic.main.fragment_fragmento3.view.*


class Fragmento3 : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_fragmento3, container, false)

        view.floatingActionButton.setOnClickListener {
            var fragment = agregarDato().newInstance(null)

            activity!!.supportFragmentManager.beginTransaction()
                .replace(R.id.content_frame, fragment!!)
                .addToBackStack(null)
                .commit()
        }
        

        Log.d("Lifecycle", "----------------- Called onCreate F3")
//        (activity as AppCompatActivity?)!!.supportActionBar!!.title = "App 3"
//        (activity as AppCompatActivity?)!!.supportActionBar!!.setDisplayHomeAsUpEnabled(false)
        return view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        activity!!.menuInflater.inflate(R.menu.menutoolbar3, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }
}