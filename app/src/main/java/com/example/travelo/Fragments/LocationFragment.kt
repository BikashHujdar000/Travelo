package com.example.travelo.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.travelo.Adapters.TestAdapterUsers
import com.example.travelo.Models.TestModel
import com.example.travelo.R
import com.example.travelo.databinding.FragmentHomeBinding
import com.example.travelo.databinding.FragmentLocationBinding

class LocationFragment : Fragment() {
    lateinit var  binding:FragmentLocationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding=FragmentLocationBinding.inflate(layoutInflater,container,false)


        //setting Status Bar
        requireActivity().getWindow().setStatusBarColor(getResources().getColor(R.color.theme1));




        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_location, container, false)
    }

}