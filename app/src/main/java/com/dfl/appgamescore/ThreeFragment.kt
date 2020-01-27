package com.dfl.appgamescore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider


class ThreeFragment : Fragment() {

    companion object {
        fun newInstance() = ThreeFragment()
    }

    private lateinit var viewModel: ThreeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.three_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ThreeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
