package com.angad.fragments

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.angad.fragments.databinding.ActivityMainBinding
import com.angad.fragments.fragmentP.BlankFragment1
import com.angad.fragments.fragmentP.BlankFragment2

class MainActivity : AppCompatActivity() {

//    Creating an instance of view binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

//        Initialised the binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        Rendering the fragment into the activity by logically or kotlin
        val manager = supportFragmentManager        // support of fragmentManager
        val transition = manager.beginTransaction()     // start transition
        transition.replace(R.id.frame, BlankFragment1())    // replace frame with fragment
//        Maintaining backstack
        //transition.addToBackStack(null)
        transition.commit()     // final done

//        On click button1
        onClickButtonOne()

//        On click button2
        onClickButtonTwo()
    }

    private fun onClickButtonTwo() {
        binding.btn2.setOnClickListener {
            val manager = supportFragmentManager        // support of fragmentManager
            val transition = manager.beginTransaction()     // start transition
            transition.replace(R.id.frame, BlankFragment2())    // replace frame with fragment
//            transition.addToBackStack(null)
            transition.commit()     // final done

        }
    }

    private fun onClickButtonOne() {
        binding.btn1.setOnClickListener {
            val manager = supportFragmentManager        // support of fragmentManager
            val transition = manager.beginTransaction()     // start transition
            transition.replace(R.id.frame, BlankFragment1())    // replace frame with fragment
//            transition.addToBackStack(null)
            transition.commit()     // final done

        }
    }
}