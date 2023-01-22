package com.example.travelo.Fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavAction
import androidx.navigation.Navigation
import com.example.travelo.R
import com.example.travelo.databinding.FragmentChoiceBinding

class choiceFragment : Fragment() {
    lateinit var binding:FragmentChoiceBinding

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
    binding = FragmentChoiceBinding.inflate(layoutInflater,container,false)


        //hiding support action bar

        // Inflate the layout for this fragment
        binding.user.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_choiceFragment_to_userLoginFragment)
        }
        binding.busOwner.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_choiceFragment_to_busOwnerLoginFragment)
        }

        return binding.root
    }

}