package com.example.yourappname

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.authentication.R

class CourseFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle? ): View? {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_course)



        val tename = findViewById<TextView>(R.id.tename)
        val tedes = findViewById<TextView>(R.id.tedes)
        val tetime = findViewById<TextView>(R.id.tetime)


        return view
    }




}
}
