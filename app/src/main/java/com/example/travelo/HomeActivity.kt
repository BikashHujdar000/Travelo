package com.example.travelo
import ScrollHandler
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.fragment.app.Fragment
import com.example.travelo.Fragments.ComnpanyFragment
import com.example.travelo.Fragments.HomeFragment
import com.example.travelo.Fragments.ProfileFragment
import com.example.travelo.databinding.ActivityHomeBinding
import me.ibrahimsn.lib.SmoothBottomBar


class HomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding
    lateinit var  bottomBar: SmoothBottomBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

      // setting handler in  Scrollable Handler

        bottomBar = binding.bottomNavigationBar
        val layoutParams = bottomBar .layoutParams as CoordinatorLayout.LayoutParams
        layoutParams.behavior = ScrollHandler()


        bottomBar.setOnItemSelectedListener {
         when(it)
         {
             0->{

             val  fragment= HomeFragment()
                 switchFragment(fragment)

             }
             1->{
                 Toast.makeText(this, "Conpany", Toast.LENGTH_SHORT).show()
               val fragment = ComnpanyFragment()
                switchFragment(fragment)
             }
             2->{
                 Toast.makeText(this, "Location", Toast.LENGTH_SHORT).show()
               val fragment = LocationFragment()
                 switchFragment(fragment)

             }
             3->
             {
                val fragment = ProfileFragment()
                 switchFragment(fragment)
                 bottomBar.visibility=View.GONE
             }

         }
     }

    }
    // out of on create View


        private fun switchFragment(fragment: Fragment) {
            var  fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainerView2, fragment)
            fragmentTransaction.commit()
        }


}



