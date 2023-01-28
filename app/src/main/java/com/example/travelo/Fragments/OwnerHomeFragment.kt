package com.example.travelo.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.travelo.Adapters.OwnerHomeAdapter
import com.example.travelo.Models.OwnerTestModel
import com.example.travelo.R
import com.example.travelo.databinding.FragmentHomeBinding
import com.example.travelo.databinding.FragmentOwnerHomeBinding


class OwnerHomeFragment : Fragment() {
    lateinit var binding:FragmentOwnerHomeBinding
    lateinit var recycler:RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentOwnerHomeBinding.inflate(inflater,container,false)
         recycler = binding.ownerRecycler
        val dataList = ArrayList<OwnerTestModel>()
        dataList.add(OwnerTestModel("Gauri Yatayat",R.drawable.dot,"From","Dhangadi", "To","Butwal","2078/3/4"),)
        val adapter = OwnerHomeAdapter(requireContext(),dataList)
        recycler.adapter=adapter
        recycler.layoutManager = LinearLayoutManager(requireContext())

        return inflater.inflate(R.layout.fragment_owner_home, container, false)
    }




}