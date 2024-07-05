package com.example.college_app

import android.animation.LayoutTransition
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.cardview.widget.CardView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class Mca_Fragment : Fragment() {


    private lateinit var expandableCard: CardView
    private lateinit var aboutDepartment: TextView
    private lateinit var detailsText: TextView

    private lateinit var expandableCardone: CardView
    private lateinit var program_outcomes: TextView
    private lateinit var detailsTextone: TextView

    private lateinit var cardViewThree: CardView
    private lateinit var visionText: TextView
    private lateinit var detailsThree: TextView

    private lateinit var cardViewFour: CardView
    private lateinit var coreText: TextView
    private lateinit var fcaultyname: TextView
    private lateinit var imageSagar: ImageView

    private lateinit var cardViewfive: CardView
    private lateinit var syllabustext: TextView
    private lateinit var syllabusbtn: AppCompatButton

    private lateinit var vishaliMam: TextView
    private lateinit var imagevishali: ImageView

    private lateinit var holyMam: TextView
    private lateinit var imageholay: ImageView

    private lateinit var addmissionButton : AppCompatButton


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
      val v = inflater.inflate(R.layout.fragment_mca, container, false)


        val syllabusbtn =v.findViewById<AppCompatButton>(R.id.syllabusbtn)
        syllabusbtn.setOnClickListener {
            Toast.makeText(requireContext(), "Downloading PDF", Toast.LENGTH_SHORT).show()
            openurl("https://www.tgpcet.com/assets/img/MCA/Syllabus/Scheme-Syllabus.pdf")

        }


        val button =v.findViewById<AppCompatButton>(R.id.addmissionButton)
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


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        expandableCard = view.findViewById(R.id.expandable)
        aboutDepartment = view.findViewById(R.id.about_department)
        detailsText = view.findViewById(R.id.detailsText)

        aboutDepartment.setOnClickListener {
            if (detailsText.visibility == View.GONE) {
                detailsText.visibility = View.VISIBLE
            } else {
                detailsText.visibility = View.GONE
            }
        }


        expandableCardone = view.findViewById(R.id.expandableone)
       program_outcomes = view.findViewById(R.id.program_outcomes)
        detailsTextone = view.findViewById(R.id.detailsTextone)

        program_outcomes.setOnClickListener {
            if (detailsTextone.visibility == View.GONE) {
                detailsTextone.visibility = View.VISIBLE
            } else {
                detailsTextone.visibility = View.GONE
            }
        }


        cardViewThree = view.findViewById(R.id.cardViewThree)
        visionText = view.findViewById(R.id.visionText)
        detailsThree = view.findViewById(R.id.detailsThree)

        visionText.setOnClickListener {
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

        cardViewfive = view.findViewById(R.id.cardViewfive)
        syllabustext = view.findViewById(R.id.syllabustext)
        syllabusbtn = view.findViewById(R.id.syllabusbtn)

        syllabustext.setOnClickListener {
            if (syllabusbtn.visibility == View.GONE) {
                syllabusbtn.visibility = View.VISIBLE
            } else {
                syllabusbtn.visibility = View.GONE
            }
        }


    }
}