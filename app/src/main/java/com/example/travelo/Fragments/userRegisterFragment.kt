package com.example.travelo.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavAction
import androidx.navigation.Navigation
import com.example.travelo.R
import com.example.travelo.databinding.FragmentUserRegisterBinding

class userRegisterFragment : Fragment() {
    lateinit var  binding: FragmentUserRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentUserRegisterBinding.inflate(layoutInflater,container,false)


        binding.signUpButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_userRegisterFragment_to_userLoginFragment)
        }
        binding.signIn.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_userRegisterFragment_to_userLoginFragment)
        }

        return binding.root
    }


}