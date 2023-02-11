package com.example.travelo.Fragments

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import com.example.travelo.R
import com.example.travelo.databinding.FragmentProfileEditBinding


class ProfileEditFragment : Fragment() {
    lateinit var binding:FragmentProfileEditBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentProfileEditBinding.inflate(layoutInflater,container,false)
        binding.updateUser.setOnClickListener {
            val fragement = ProfileFragment()
            val transaction = fragmentManager?.beginTransaction()
            if (transaction != null) {
                transaction.replace(R.id.fragmentContainerView2,fragement)
                transaction.commit()

            }
        }
        return binding.root
    }
}

