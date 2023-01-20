package com.example.travelo.Fragments

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.travelo.R
import com.example.travelo.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
lateinit var  binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHomeBinding.inflate(layoutInflater,container,false)
        //setting Status Bar
        requireActivity().getWindow().setStatusBarColor(getResources().getColor(R.color.purple_200));

        return binding.root
    }


}







