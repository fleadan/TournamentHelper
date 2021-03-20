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
import com.example.tournamenthelper.register
import com.example.tournamenthelper.tournamentdetails
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_tourney_list.*


/**
 * A simple [Fragment] subclass.
 * Use the [KubrickFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TourneyList : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tourney_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        tournamentdetails.setOnClickListener {
            Log.i("Kubrik","Nav Component")
            view?.findNavController()?.navigate(R.id.action_tourneyList_to_tournamentdetails)
            //Navigation.createNavigateOnClickListener( R.id.action_kubrickFragment_to_moviesFragment)
        }

        register.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_tourneyList_to_register)
            //Navigation.createNavigateOnClickListener(R.id.action_kubrickFragment_to_actorskFragment, null)
        }
    }


}