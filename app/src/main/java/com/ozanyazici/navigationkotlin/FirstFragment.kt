package com.ozanyazici.navigationkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.ozanyazici.navigationkotlin.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentFirstBinding.inflate(layoutInflater)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.firstFragmentButton.setOnClickListener() {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(23)
            //action.age = 23 diyebilmem lazımdı ama android de şu anda değişiklikler yapılakta olduğu için erişemiyorum.
            //Ama yukarıda parametre olarak verebiliyorum.
            Navigation.findNavController(it).navigate(action)
        }
    }
}