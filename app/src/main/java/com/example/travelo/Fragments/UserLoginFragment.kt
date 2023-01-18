package com.example.travelo.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavAction
import androidx.navigation.Navigation
import com.example.travelo.R
import com.example.travelo.databinding.FragmentUserLoginBinding
import com.example.travelo.databinding.FragmentUserRegisterBinding


class UserLoginFragment : Fragment() {
    lateinit var binding: FragmentUserLoginBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentUserLoginBinding.inflate(layoutInflater,container,false)

        binding.signInButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_userLoginFragment_to_homeFragment)
        }

        return binding.root
    }


}