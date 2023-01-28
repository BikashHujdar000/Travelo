package com.example.travelo.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavAction
import androidx.navigation.Navigation
import com.example.travelo.HomeActivity
import com.example.travelo.MainActivity
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

        binding.signIn.setOnClickListener {

//            Navigation.findNavController(it).navigate(R.id.action_userLoginFragment_to_homeFragment)
          // type 1
            val intent = Intent (getActivity(), HomeActivity::class.java)
            getActivity()?.startActivity(intent)

        }
        binding.signUpNow.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_userLoginFragment_to_userRegisterFragment)
        }
        binding.forgotPassword.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_userLoginFragment_to_forgot_Password)
        }

        return binding.root
    }


}