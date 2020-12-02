package com.devchrisap.tabbedlayout

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity


class agregarDato : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    fun newInstance(arguments: Bundle?): agregarDato? {
        val fragment = agregarDato()
        if (arguments != null) {
            fragment.arguments = arguments
        }
        return fragment
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_agregar_dato, container, false)

        (activity as AppCompatActivity?)!!.supportActionBar!!.title = "Agregar"
        (activity as AppCompatActivity?)!!.supportActionBar!!.setDisplayHomeAsUpEnabled(false)


        return view
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        activity!!.menuInflater.inflate(R.menu.menutoolbar2, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                fragmentManager!!.popBackStack()
                return true
            }
            else -> {
                return super.onOptionsItemSelected(item)
            }
        }
    }

}