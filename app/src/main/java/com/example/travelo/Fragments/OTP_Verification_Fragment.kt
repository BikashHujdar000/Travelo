package com.example.travelo.Fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.travelo.R

import com.example.travelo.databinding.FragmentOTPVerificationBinding
import kotlin.math.log


class OTP_Verification_Fragment : Fragment() {
    
    lateinit var binding:FragmentOTPVerificationBinding
    val testOtp = "123456"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOTPVerificationBinding.inflate(layoutInflater,container,false)

        setopOtpInput()
        
        binding.checkOtp.setOnClickListener {

           verifyotp()


        }



        return binding.root
    }
    

    private fun verifyotp() {

       var value:String = binding.otp1.text.toString()+binding.otp2.text.toString()+binding.otp3.text.toString()+
               binding.otp4.text.toString()+binding.otp5.text.toString()+binding.otp6.text.toString()

       if (value.length != 6)
       {
           Toast.makeText(requireContext(), "Please Enter Valid OTP", Toast.LENGTH_SHORT).show()
       }
        else if(value.length == testOtp.length && value==testOtp )
       {
           Navigation.findNavController(requireView()).navigate(R.id.action_OTP_Verification_Fragment_to_changePasssword)
       }
        else {
           Toast.makeText(requireContext(), "Please enter valid Otp", Toast.LENGTH_SHORT).show()
        }
           

    }

    private fun setopOtpInput() {
        binding.otp1.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (!s.toString().trim().isEmpty())
                {
                    binding.otp2.requestFocus()
                }
            }
        })
        binding.otp2.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (!s.toString().trim().isEmpty())
                {
                    binding.otp3.requestFocus()
                }
            }
        })
        binding.otp3.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (!s.toString().trim().isEmpty())
                {
                    binding.otp4.requestFocus()
                }
            }
        })
        binding.otp4.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (!s.toString().trim().isEmpty())
                {
                    binding.otp5.requestFocus()
                }
            }
        })
        binding.otp5.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (!s.toString().trim().isEmpty())
                {
                    binding.otp6.requestFocus()
                }
            }
        })


    }




}