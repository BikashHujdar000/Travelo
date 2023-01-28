package com.example.travelo


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.travelo.databinding.ActivityMainBinding
import me.ibrahimsn.lib.OnItemSelectedListener
import me.ibrahimsn.lib.SmoothBottomBar

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
//        bottomBar = binding.bottomBar
//
//        bottomBar.onItemSelected = {
//
//            Toast.makeText(this, "selected Id is $it", Toast.LENGTH_SHORT).show()
//        }
//
//        bottomBar.onItemReselected = {
//            Toast.makeText(this, "selected Id is $it", Toast.LENGTH_SHORT).show()
//
//        }
    }
}


