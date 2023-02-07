package com.example.travelo.Fragments

import android.opengl.Visibility
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.travelo.Adapters.TestAdapterUsers
import com.example.travelo.Models.TestModel
import com.example.travelo.R
import com.example.travelo.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
lateinit var  binding: FragmentHomeBinding
lateinit var recyclerView:RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHomeBinding.inflate(layoutInflater,container,false)

        recyclerView  =binding.userHomeRecyclerView
        //setting Status Bar
        requireActivity().getWindow().setStatusBarColor(getResources().getColor(R.color.theme1));


        val manualData = ArrayList<TestModel>()


        manualData.add(TestModel("Nepali YataYat","1:00pm","3:00","direct","Dharan","Gaighat","Rs.400","200Km"))

        manualData.add(TestModel("Suhani Travel","1:00pm","3:00","direct","Dharan","Gaighat","Rs.400","200Km"))
        manualData.add(TestModel("DudhKoshi Travel ","1:00pm","3:00","direct","Dharan","Gaighat","Rs.400","200Km"))
        manualData.add(TestModel("Narsingh Travel","1:00pm","3:00","direct","Dharan","Gaighat","Rs.400","200Km"))
        manualData.add(TestModel("MidNight Travel","1:00pm","3:00","direct","Dharan","Gaighat","Rs.400","200Km"))
        manualData.add(TestModel("Ramro Travel","1:00pm","3:00","direct","Dharan","Gaighat","Rs.400","200Km"))
        manualData.add(TestModel("Nepali YataYat","1:00pm","3:00","direct","Dharan","Gaighat","Rs.400","200Km"))

        manualData.add(TestModel("Suhani Travel","1:00pm","3:00","direct","Dharan","Gaighat","Rs.400","200Km"))
        manualData.add(TestModel("DudhKoshi Travel ","1:00pm","3:00","direct","Dharan","Gaighat","Rs.400","200Km"))
        manualData.add(TestModel("Narsingh Travel","1:00pm","3:00","direct","Dharan","Gaighat","Rs.400","200Km"))
        manualData.add(TestModel("MidNight Travel","1:00pm","3:00","direct","Dharan","Gaighat","Rs.400","200Km"))
        manualData.add(TestModel("Ramro Travel","1:00pm","3:00","direct","Dharan","Gaighat","Rs.400","200Km"))
        manualData.add(TestModel("Nepali YataYat","1:00pm","3:00","direct","Dharan","Gaighat","Rs.400","200Km"))

        manualData.add(TestModel("Suhani Travel","1:00pm","3:00","direct","Dharan","Gaighat","Rs.400","200Km"))
        manualData.add(TestModel("DudhKoshi Travel ","1:00pm","3:00","direct","Dharan","Gaighat","Rs.400","200Km"))
        manualData.add(TestModel("Narsingh Travel","1:00pm","3:00","direct","Dharan","Gaighat","Rs.400","200Km"))
        manualData.add(TestModel("MidNight Travel","1:00pm","3:00","direct","Dharan","Gaighat","Rs.400","200Km"))
        manualData.add(TestModel("Ramro Travel","1:00pm","3:00","direct","Dharan","Gaighat","Rs.400","200Km"))


       val adapter= TestAdapterUsers(requireContext(),manualData)
         recyclerView.adapter=adapter
        recyclerView.layoutManager= LinearLayoutManager(requireContext())



        return binding.root
    }
}







