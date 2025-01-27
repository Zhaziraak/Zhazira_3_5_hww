package com.example.zhazira_3_5_hww

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.zhazira_3_5_hww.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    var numberOfCllick = 0
    var textNumber = 0
    val secondFragment = SecondFragment()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnPlus.setOnClickListener {
            textNumber++
            binding.tvText.text = textNumber.toString()
            numberOfCllick++
            controlClicks()
        }
        binding.btnMinus.setOnClickListener {
            textNumber--
            binding.tvText.text = textNumber.toString()
            numberOfCllick++
            controlClicks()
        }
    }

    private fun controlClicks() {
        if (numberOfCllick >= 10) {
            val bundle = Bundle()
            bundle.putString("text", textNumber.toString())
            secondFragment.arguments = bundle

            parentFragmentManager.beginTransaction().apply {
                replace(R.id.frame, secondFragment).commit()
            }
        }
    }
}
