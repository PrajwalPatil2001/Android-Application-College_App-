package com.example.college_app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.cardview.widget.CardView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LibraryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LibraryFragment : Fragment() {

    private lateinit var libraryfirst: CardView
    private lateinit var introduction: TextView
    private lateinit var libraryIntro: TextView

    private lateinit var cardViewThree: CardView
    private lateinit var byelaw: TextView
    private lateinit var detailstext: TextView

    private lateinit var resources: CardView
    private lateinit var resources1: TextView
    private lateinit var swayambtn: AppCompatButton

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
       val view  =  inflater.inflate(R.layout.fragment_library, container, false)

        val swayambtn =view.findViewById<AppCompatButton>(R.id.swayambtn)
        swayambtn.setOnClickListener {
            Toast.makeText(requireContext(), "Opening Swayam Portal", Toast.LENGTH_SHORT).show()
            openurl("https://swayam.gov.in/")

        }

        return view
    }
    private fun openurl(link: String) {
        val uri = Uri.parse(link)
        val inte = Intent(Intent.ACTION_VIEW,uri)
        startActivity(inte)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cardViewThree = view.findViewById(R.id.cardViewThree)
        introduction = view.findViewById(R.id.introduction)
        libraryIntro = view.findViewById(R.id.libraryIntro)

        introduction.setOnClickListener {
            if (libraryIntro.visibility == View.GONE) {
                libraryIntro.visibility = View.VISIBLE
            } else {
                libraryIntro.visibility = View.GONE
            }
        }

        libraryfirst = view.findViewById(R.id.libraryfirst)
        byelaw = view.findViewById(R.id.byelaw)
        detailstext = view.findViewById(R.id.detailstext)

        byelaw.setOnClickListener {
            if (detailstext.visibility == View.GONE) {
                detailstext.visibility = View.VISIBLE
            } else {
                detailstext.visibility = View.GONE
            }
        }

        resources = view.findViewById(R.id.resources)
        resources1 = view.findViewById(R.id.resources1)
        swayambtn = view.findViewById(R.id.swayambtn)

        resources1.setOnClickListener {
            if (swayambtn.visibility == View.GONE) {
                swayambtn.visibility = View.VISIBLE
            } else {
                swayambtn.visibility = View.GONE
            }
        }

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment LibraryFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            LibraryFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}