package com.dfl.appgamescore


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.four_fragment.*


class FourFragment : Fragment() {

    companion object {
        fun newInstance() = FourFragment()
    }

    private val safeArgs: FourFragmentArgs by navArgs()
    private lateinit var viewModel: FourViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.four_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        safeArgs.flowEditResul?.let { fourTextview.text = it + " " + safeArgs.flowEditIntResult }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FourViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
