package com.example.travelo.Fragments

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.travelo.R
import com.example.travelo.databinding.FragmentForgotPasswordBinding
import com.example.travelo.databinding.FragmentHomeBinding


class Forgot_Password : Fragment() {
    lateinit var  binding:FragmentForgotPasswordBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentForgotPasswordBinding.inflate(layoutInflater,container,false)

        binding.backToLogin.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_forgot_Password_to_userLoginFragment)
        }
        binding.sendOtp.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_forgot_Password_to_OTP_Verification_Fragment)
        }


        return binding.root
    }

}