package com.dfl.appgamescore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.one_fragment.*


class OneFragment : Fragment() {

    lateinit var navController: NavController

    companion object {
        fun newInstance() = OneFragment()
    }

    private lateinit var viewModel: OneViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.one_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        oneButton.setOnClickListener {
            val textSend = oneEdit.text.toString()
            val action = OneFragmentDirections.actionOneFragmentToTwoFragment(textSend)

            navController.navigate(action)
        }
        oneDButton.setOnClickListener {
            val textSend = oneEdit.text.toString()
            val action = OneFragmentDirections.actionOneFragmentToThreeFragment(textSend)
            findNavController().navigate(action)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(OneViewModel::class.java)

    }

}
