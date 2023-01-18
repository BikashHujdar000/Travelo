package com.example.travelo.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.travelo.R
import com.example.travelo.databinding.FragmentBusOwnerLoginBinding
import com.example.travelo.databinding.FragmentOwnerHomeBinding
import com.example.travelo.databinding.FragmentUserLoginBinding


class BusOwnerLoginFragment : Fragment() {
    lateinit var  binding: FragmentBusOwnerLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBusOwnerLoginBinding.inflate(layoutInflater,container,false)


        binding.signInButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_busOwnerLoginFragment_to_ownerHomeFragment)
        }
        // Inflate the layout for this fragment
        return binding.root
    }


}