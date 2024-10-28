package com.angad.fragments.fragmentP

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.angad.fragments.databinding.FragmentBlank1Binding


class BlankFragment1 : Fragment() {

//    Creating an instance of binding
    private lateinit var binding: FragmentBlank1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentBlank1Binding.inflate(layoutInflater)

//        On click button
        onClickButton()


        return binding.root
    }

    private fun onClickButton() {
        binding.button.setOnClickListener {
            Toast.makeText( context, "This is a fragment", Toast.LENGTH_SHORT).show()
        }
    }

}