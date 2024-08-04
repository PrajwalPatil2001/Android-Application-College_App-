package com.example.college_app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.cardview.widget.CardView
import androidx.fragment.app.FragmentTransaction


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class Notification : Fragment(R.layout.fragment_notification) {


    private lateinit var cardview_student: CardView
    private lateinit var student_corners: TextView
    private lateinit var scholarship: TextView
    private lateinit var fees_pay: TextView


    private lateinit var cardview_examcell: CardView
    private lateinit var exam_cell: TextView
    private lateinit var time_tabel: TextView
    private lateinit var result: TextView

    private lateinit var cardview_admission: CardView
    private lateinit var admission: TextView
    private lateinit var criteriabtn: AppCompatButton

    private lateinit var imageview24 : ImageView

    private lateinit var imageview25 : ImageView

    private lateinit var imageview22 : ImageView

    private lateinit var imageview23 : ImageView



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
        val v=  inflater.inflate(R.layout.fragment_notification, container, false)

        val criteriabtn =v.findViewById<AppCompatButton>(R.id.criteriabtn)
        criteriabtn.setOnClickListener {
            Toast.makeText(requireContext(), "Downloading PDF", Toast.LENGTH_SHORT).show()
            openurl("https://docs.google.com/spreadsheets/d/1Iux3VcQSCCZewgkLMP2zYbK35qKkXNii/edit?usp=sharing&ouid=101475428764544814974&rtpof=true&sd=true")

        }

        return v

    }
    private fun openurl(link: String) {
        val uri = Uri.parse(link)
        val inte = Intent(Intent.ACTION_VIEW,uri)
        startActivity(inte)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        time_tabel = view.findViewById(R.id.time_tabel)
        time_tabel.setOnClickListener{
            Toast.makeText(requireContext(), "Text is Click", Toast.LENGTH_SHORT).show()

        }

        result = view.findViewById(R.id.result)
        result.setOnClickListener{
            Toast.makeText(requireContext(), "Text is Click", Toast.LENGTH_SHORT).show()

        }

        fees_pay = view.findViewById(R.id.fees_pay)
        fees_pay.setOnClickListener{
            val fees = Fees()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frame_container, fees)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        scholarship = view.findViewById(R.id.scholarship)
        scholarship.setOnClickListener{
            val scholarship = Scholarship()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frame_container, scholarship)
            transaction.addToBackStack(null)
            transaction.commit()
        }


        imageview24 = view.findViewById(R.id.imageView24)
        imageview24.setOnClickListener{
            val libraryFragment = LibraryFragment()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frame_container, libraryFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        imageview25 = view.findViewById(R.id.imageView25)
        imageview25.setOnClickListener{
            val sport = Sport()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frame_container, sport)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        imageview22 = view.findViewById(R.id.imageView22)
        imageview22.setOnClickListener{
            val canteen = Canteen()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frame_container, canteen)
            transaction.addToBackStack(null)
            transaction.commit()
        }
        imageview23 = view.findViewById(R.id.imageView23)
        imageview23.setOnClickListener{
            val hostel = Hostel()
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frame_container, hostel)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        cardview_student = view.findViewById(R.id.cardview_student)
        student_corners = view.findViewById(R.id.student_corners)
        scholarship = view.findViewById(R.id.scholarship)
        fees_pay = view.findViewById(R.id.fees_pay)

        student_corners.setOnClickListener {
            if (scholarship.visibility == View.GONE) {
                scholarship.visibility = View.VISIBLE
                fees_pay.visibility = View.VISIBLE
            } else {
                scholarship.visibility = View.GONE
                fees_pay.visibility = View.GONE
            }
        }


        cardview_examcell = view.findViewById(R.id.cardview_examcell)
        exam_cell = view.findViewById(R.id.exam_cell)
        time_tabel = view.findViewById(R.id.time_tabel)
        result = view.findViewById(R.id.result)

        exam_cell.setOnClickListener {
            if (time_tabel.visibility == View.GONE) {
                time_tabel.visibility = View.VISIBLE
                result.visibility = View.VISIBLE
            } else {
                time_tabel.visibility = View.GONE
                result.visibility = View.GONE
            }
        }


        cardview_admission = view.findViewById(R.id.cardview_admission)
        admission = view.findViewById(R.id.admission)
        criteriabtn = view.findViewById(R.id.criteriabtn)

        admission.setOnClickListener {
            if (criteriabtn.visibility == View.GONE) {
                criteriabtn.visibility = View.VISIBLE
            } else {
                criteriabtn.visibility = View.GONE
            }
        }


    }

}