package com.example.travelo.Fragments

import android.opengl.Visibility
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.travelo.Adapters.TestAdapterUsers
import com.example.travelo.Models.TestModel
import com.example.travelo.R
import com.example.travelo.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
lateinit var  binding: FragmentHomeBinding
lateinit var recyclerView:RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHomeBinding.inflate(layoutInflater,container,false)

        recyclerView  =binding.userHomeRecyclerView
        //setting Status Bar
        requireActivity().getWindow().setStatusBarColor(getResources().getColor(R.color.theme1));


        val manualData = ArrayList<TestModel>()


        manualData.add(TestModel("Nepali YataYat","1:00pm","3:00","direct","Dharan","Gaighat","Rs.400","200Km"))

        manualData.add(TestModel("Suhani Travel","1:00pm","3:00","direct","Dharan","Gaighat","Rs.400","200Km"))
        manualData.add(TestModel("DudhKoshi Travel ","1:00pm","3:00","direct","Dharan","Gaighat","Rs.400","200Km"))
        manualData.add(TestModel("Narsingh Travel","1:00pm","3:00","direct","Dharan","Gaighat","Rs.400","200Km"))
        manualData.add(TestModel("MidNight Travel","1:00pm","3:00","direct","Dharan","Gaighat","Rs.400","200Km"))
        manualData.add(TestModel("Ramro Travel","1:00pm","3:00","direct","Dharan","Gaighat","Rs.400","200Km"))

       val adapter= TestAdapterUsers(requireContext(),manualData)
         recyclerView.adapter=adapter
        recyclerView.layoutManager= LinearLayoutManager(requireContext())


     //recyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
        //      override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
        //        super.onScrollStateChanged(recyclerView, newState)
        //        val totalItemCount = recyclerView.layoutManager!!.itemCount
        //        if (!imageRequester.isLoadingData && totalItemCount == lastVisibleItemPosition + 1) {
        //          requestPhoto()
        //        }
        //      }
        //    })

        val state = IntArray(1)

        recyclerView.addOnScrollListener((object :RecyclerView.OnScrollListener(){
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)

                state[0]= newState;




            }

//            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
//                super.onScrolled(recyclerView, dx, dy)
//
//                if(dy>0 && (state[0]==0 || state[0]==2))
//                    {
//                        hideLayout()
//                    }
//                else if (dy < -10){
//                    showLayout()
//                }
//                else
//                {
//                    showLayout()
//                }
//            }


        }))

        return binding.root
    }

    private fun showLayout() {
        binding.toolbarType.visibility = View.VISIBLE
    }

    private fun hideLayout() {
        binding.toolbarType.visibility=View.INVISIBLE
    }


}







