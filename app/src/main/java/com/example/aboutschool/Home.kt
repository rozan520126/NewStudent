package com.example.aboutschool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

//class Home extends Fragment implements AdapterPost.OnItemClickListener
class Home : Fragment() {
    val EXTRA_PID = "pId"

    var recyclerView: RecyclerView? = null

    fun Home() {
        // Required empty public constructor
    }

    override fun  onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)


//        //recycler view and its properties
//        recyclerView = view.findViewById(R.id.postsrecyclerView)
//        val linearLayoutManager = LinearLayoutManager(getActivity())
//        //        //show newest post first
//        linearLayoutManager.stackFromEnd = true
//        linearLayoutManager.reverseLayout = true
//        //        //set layout to recyclerview
//        recyclerView.setLayoutManager(linearLayoutManager)

//        //init post list
//        postList = ArrayList<Post?>()
//        loadPosts()
        return view
    }
}