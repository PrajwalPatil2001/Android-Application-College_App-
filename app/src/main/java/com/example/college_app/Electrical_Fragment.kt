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

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Electrical_Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Electrical_Fragment : Fragment() {

    private lateinit var expandable_elec: CardView
    private lateinit var about_department_elec: TextView
    private lateinit var detailsText_ele: TextView

    private lateinit var expandableone_ele: CardView
    private lateinit var program_outcomes_ele: TextView
    private lateinit var detailsTextone_ele: TextView

    private lateinit var cardViewThree_ele: CardView
    private lateinit var visionText_ele: TextView
    private lateinit var detailsThree_ele: TextView

    private lateinit var cardViewFour_ele: CardView
    private lateinit var coreText_ele: TextView
    private lateinit var fcaultyname_ele: TextView
    private lateinit var imageSagar: ImageView

    private lateinit var vishaliMam: TextView
    private lateinit var imagevishali: ImageView

    private lateinit var holyMam: TextView
    private lateinit var imageholay: ImageView

    private lateinit var cardViewfive_ele: CardView
    private lateinit var syllabustext_ele: TextView
    private lateinit var syllabusbtn: AppCompatButton

    private lateinit var addmissionButton : AppCompatButton

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
        val v = inflater.inflate(R.layout.fragment_electrical_, container, false)

        val syllabusbtn =v.findViewById<AppCompatButton>(R.id.syllabusbtn)
        syllabusbtn.setOnClickListener {
            Toast.makeText(requireContext(), "Downloading PDF", Toast.LENGTH_SHORT).show()
            openurl("https://www.tgpcet.com/assets/img/Electrical/Syllabus/Scheme_Syllabus_BTech_EE.pdf")

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

        expandable_elec = view.findViewById(R.id.expandable_elec)
        about_department_elec = view.findViewById(R.id.about_department_elec)
        detailsText_ele = view.findViewById(R.id.detailsText_ele)

        about_department_elec.setOnClickListener {
            if (detailsText_ele.visibility == View.GONE) {
                detailsText_ele.visibility = View.VISIBLE
            } else {
                detailsText_ele.visibility = View.GONE
            }
        }


        expandableone_ele = view.findViewById(R.id.expandableone_ele)
        program_outcomes_ele = view.findViewById(R.id.program_outcomes_ele)
        detailsTextone_ele = view.findViewById(R.id.detailsTextone_ele)

        program_outcomes_ele.setOnClickListener {
            if (detailsTextone_ele.visibility == View.GONE) {
                detailsTextone_ele.visibility = View.VISIBLE
            } else {
                detailsTextone_ele.visibility = View.GONE
            }
        }


        cardViewThree_ele = view.findViewById(R.id.cardViewThree_ele)
        visionText_ele = view.findViewById(R.id.visionText_ele)
        detailsThree_ele = view.findViewById(R.id.detailsThree_ele)

        visionText_ele.setOnClickListener {
            if (detailsThree_ele.visibility == View.GONE) {
                detailsThree_ele.visibility = View.VISIBLE
            } else {
                detailsThree_ele.visibility = View.GONE
            }
        }

        cardViewFour_ele = view.findViewById(R.id.cardViewFour_ele)
        coreText_ele = view.findViewById(R.id.coreText_ele)
        fcaultyname_ele = view.findViewById(R.id.fcaultyname_ele)
        imageSagar = view.findViewById(R.id.imageSagar)

        vishaliMam = view.findViewById(R.id.vishaliMam)
        imagevishali = view.findViewById(R.id.imagevishali)

        holyMam = view.findViewById(R.id.holyMam)
        imageholay = view.findViewById(R.id.imageholay)

        coreText_ele.setOnClickListener {
            if (fcaultyname_ele.visibility == View.GONE ) {
                fcaultyname_ele.visibility = View.VISIBLE
                imageSagar.visibility = View.VISIBLE

                vishaliMam.visibility = View.VISIBLE
                imagevishali.visibility = View.VISIBLE

                holyMam.visibility = View.VISIBLE
                imageholay.visibility = View.VISIBLE

            } else {
                fcaultyname_ele.visibility = View.GONE
                imageSagar.visibility = View.GONE

                vishaliMam.visibility = View.GONE
                imagevishali.visibility = View.GONE

                holyMam.visibility = View.GONE
                imageholay.visibility = View.GONE

            }
        }

        cardViewfive_ele = view.findViewById(R.id.cardViewfive_ele)
        syllabustext_ele = view.findViewById(R.id.syllabustext_ele)
        syllabusbtn = view.findViewById(R.id.syllabusbtn)

        syllabustext_ele.setOnClickListener {
            if (syllabusbtn.visibility == View.GONE) {
                syllabusbtn.visibility = View.VISIBLE
            } else {
                syllabusbtn.visibility = View.GONE
            }
        }


    }

}