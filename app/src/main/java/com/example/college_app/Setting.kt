package com.example.college_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.FragmentTransaction

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Setting.newInstance] factory method to
 * create an instance of this fragment.
 */
class Setting : Fragment(R.layout.fragment_setting) {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val v = inflater.inflate(R.layout.fragment_setting, container, false)


        val button11 =v.findViewById<AppCompatButton>(R.id.button11)
        button11.setOnClickListener {
            val fragment_home=Home()
            val transaction:FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.frame_container,fragment_home)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        val button5 =v.findViewById<AppCompatButton>(R.id.button5)
        button5.setOnClickListener {
            val fragment_profile=Profile()
            val transaction:FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.frame_container,fragment_profile)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        return v
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Setting().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}