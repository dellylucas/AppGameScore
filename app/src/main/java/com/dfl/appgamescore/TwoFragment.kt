package com.dfl.appgamescore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.two_fragment.*


class TwoFragment : Fragment() {

    companion object {
        fun newInstance() = TwoFragment()
    }

    private val safeArgs: TwoFragmentArgs by navArgs()
    private lateinit var navController: NavController
    private lateinit var viewModel: TwoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.two_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        safeArgs.flowEditPass?.let { twoTextview.text = it }
        twoButton.setOnClickListener {
            val textSend = twoEdit.text.toString()
            val action = TwoFragmentDirections.actionTwoFragmentToFourFragment(textSend, 300)

            navController.navigate(action)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TwoViewModel::class.java)
    }

}
