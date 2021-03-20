package com.example.tournamenthelper

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.tournamenthelper.R
import kotlinx.android.synthetic.main.fragment_home.*



/**
 * A simple [Fragment] subclass.
 * Use the [KubrickFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Home : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        profile.setOnClickListener {
            Log.i("Kubrik","Nav Component")
            view?.findNavController()?.navigate(R.id.action_home2_to_profile)
            //Navigation.createNavigateOnClickListener( R.id.action_kubrickFragment_to_moviesFragment)
        }

        tournaments.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_home2_to_tourneyList)
            //Navigation.createNavigateOnClickListener(R.id.action_kubrickFragment_to_actorskFragment, null)
        }
    }


}