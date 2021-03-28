package com.vaisakh.hustler.viewbinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vaisakh.hustler.viewbinding.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private var _viewbinging : FragmentFirstBinding ?=null
    private val binding get() = _viewbinging!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _viewbinging = FragmentFirstBinding.inflate(inflater, container, false)
        //binding.created
        
        return binding.root
    }


}