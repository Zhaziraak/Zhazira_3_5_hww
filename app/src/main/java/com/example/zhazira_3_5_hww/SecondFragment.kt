package com.example.zhazira_3_5_hww

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.zhazira_3_5_hww.databinding.FragmentFirstBinding
import com.example.zhazira_3_5_hww.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val tvText2 = view.findViewById<TextView>(R.id.tv_text_second_fragment)

        var data = arguments

            tvText2.text = data?.getString("text")

        return view

    }
}

