package com.example.college_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
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
        return v

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

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