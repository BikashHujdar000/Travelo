package com.example.travelo.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.travelo.R
import com.example.travelo.databinding.FragmentChangePassswordBinding

class ChangePasssword : Fragment() {
    lateinit var  binding:FragmentChangePassswordBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChangePassswordBinding.inflate(layoutInflater,container,false)
        // Inflate the layout for this fragment

        binding.update.setOnClickListener {
            validatePassword()

        }
        return binding.root
    }

    private fun validatePassword() {
       var createPassword = binding.createPassword.text.toString()
        var confirmPassword = binding.confirmPassword.text.toString()
        if(createPassword.length == confirmPassword.length && createPassword == confirmPassword){

            Navigation.findNavController(requireView()).navigate(R.id.action_changePasssword_to_userLoginFragment)
        }


    }
    // onCreateView Started From here


}