package com.example.travelo
import ScrollHandler
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.example.travelo.databinding.ActivityHomeBinding
import me.ibrahimsn.lib.SmoothBottomBar


class HomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding
    lateinit var  bottomBar: SmoothBottomBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

         // setting hamdler
        /*
        *     spaceNavigationView = (SpaceNavigationView) findViewById(R.id.space);
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) spaceNavigationView.getLayoutParams();
        layoutParams.setBehavior(new ScrollHandler());
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState);
        *
        *  */

//        bottomBar= findViewById<View>(R.id.b) as SpaceNavigationView




        bottomBar = binding.bottomNavigationBar
        val layoutParams = bottomBar .layoutParams as CoordinatorLayout.LayoutParams
        layoutParams.behavior = ScrollHandler()


        bottomBar.setOnItemSelectedListener {
         when(it)
         {
             0->{
                 Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()

             }
             1->{
                 Toast.makeText(this, "Conpany", Toast.LENGTH_SHORT).show()

             }
             2->{
                 Toast.makeText(this, "Location", Toast.LENGTH_SHORT).show()

             }
             3->
             {
                 Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show()
             }

         }
     }

    }
}


