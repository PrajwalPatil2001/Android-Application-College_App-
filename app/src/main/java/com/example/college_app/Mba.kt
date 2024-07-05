package com.example.college_app

import android.annotation.SuppressLint
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

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class Mba : Fragment() {

    private lateinit var cardone: CardView
    private lateinit var about_department_mba: TextView
    private lateinit var detailsText_mba1: TextView

    private lateinit var cardtwo: CardView
    private lateinit var program_outcomes_mba2: TextView
    private lateinit var detailsText_mba2: TextView

    private lateinit var cardthree: CardView
    private lateinit var visiontext_mba: TextView
    private lateinit var detailsThree: TextView


    private lateinit var cardViewFour: CardView
    private lateinit var coreText: TextView
    private lateinit var fcaultyname: TextView
    private lateinit var imageSagar: ImageView


    private lateinit var cardView5: CardView
    private lateinit var syllabustext: TextView
    private lateinit var syllabusbtnmba: AppCompatButton

    private lateinit var vishaliMam: TextView
    private lateinit var imagevishali: ImageView

    private lateinit var holyMam: TextView
    private lateinit var imageholay: ImageView


    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
     val v=  inflater.inflate(R.layout.fragment_mba, container, false)


        val syllabusbtnmba =v.findViewById<AppCompatButton>(R.id.syllabusbtnmba)
        syllabusbtnmba.setOnClickListener {
            Toast.makeText(requireContext(), "Downloading PDF", Toast.LENGTH_SHORT).show()
            openurl("https://www.tgpcet.com/assets/img/MBA/Syllabus/MBA_Syllabus.pdf")

        }


        val button =v.findViewById<AppCompatButton>(R.id.addmissionButton11)
        button.setOnClickListener {
            Toast.makeText(requireContext(), "directing to google form", Toast.LENGTH_SHORT).show()
            openurl("https://docs.google.com/forms/d/e/1FAIpQLSc8Lpdrwy1BdAt4Vseb5BsrorMNXBf2CuLR9jYh1GK83l3T0Q/viewform")

        }
        return v
    }

    private fun openurl(link: String) {
        val uri = Uri.parse(link)
        val inte = Intent(Intent.ACTION_VIEW,uri)
        startActivity(inte)
    }

    override  fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cardone = view.findViewById(R.id.cardone)
        about_department_mba = view.findViewById(R.id.about_department_mba)
        detailsText_mba1 = view.findViewById(R.id.detailsText_mba1)

        about_department_mba.setOnClickListener {
            if (detailsText_mba1.visibility == View.GONE) {
                detailsText_mba1.visibility = View.VISIBLE
            } else {
                detailsText_mba1.visibility = View.GONE
            }
        }


        cardtwo = view.findViewById(R.id.cardtwo)
        program_outcomes_mba2 = view.findViewById(R.id.program_outcomes_mba2)
        detailsText_mba2 = view.findViewById(R.id.detailsText_mba2)

        program_outcomes_mba2.setOnClickListener {
            if (detailsText_mba2.visibility == View.GONE) {
                detailsText_mba2.visibility = View.VISIBLE
            } else {
                detailsText_mba2.visibility = View.GONE
            }
        }

        cardthree = view.findViewById(R.id.cardthree)
        visiontext_mba = view.findViewById(R.id.visiontext_mba)
        detailsThree = view.findViewById(R.id.detailsThree)

        visiontext_mba.setOnClickListener {
            if (detailsThree.visibility == View.GONE) {
                detailsThree.visibility = View.VISIBLE
            } else {
                detailsThree.visibility = View.GONE
            }
        }


        cardViewFour = view.findViewById(R.id.cardViewFour)
        coreText = view.findViewById(R.id.coreText)
        fcaultyname = view.findViewById(R.id.fcaultyname)
        imageSagar = view.findViewById(R.id.imageSagar)

        vishaliMam = view.findViewById(R.id.vishaliMam)
        imagevishali = view.findViewById(R.id.imagevishali)

        holyMam = view.findViewById(R.id.holyMam)
        imageholay = view.findViewById(R.id.imageholay)

        coreText.setOnClickListener {
            if (fcaultyname.visibility == View.GONE ) {
                fcaultyname.visibility = View.VISIBLE
                imageSagar.visibility = View.VISIBLE

                vishaliMam.visibility = View.VISIBLE
                imagevishali.visibility = View.VISIBLE

                holyMam.visibility = View.VISIBLE
                imageholay.visibility = View.VISIBLE

            } else {
                fcaultyname.visibility = View.GONE
                imageSagar.visibility = View.GONE

                vishaliMam.visibility = View.GONE
                imagevishali.visibility = View.GONE

                holyMam.visibility = View.GONE
                imageholay.visibility = View.GONE

            }
        }


        cardView5 = view.findViewById(R.id.cardView5)
        syllabustext = view.findViewById(R.id.syllabustext)
        syllabusbtnmba = view.findViewById(R.id.syllabusbtnmba)

        syllabustext.setOnClickListener {
            if (syllabusbtnmba.visibility == View.GONE) {
                syllabusbtnmba.visibility = View.VISIBLE
            } else {
                syllabusbtnmba.visibility = View.GONE
            }
        }


    }
}