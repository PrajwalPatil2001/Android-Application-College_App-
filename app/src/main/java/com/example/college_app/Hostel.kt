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
 * Use the [Hostel.newInstance] factory method to
 * create an instance of this fragment.
 */
class Hostel : Fragment() {
    private lateinit var about: CardView
    private lateinit var tvabout: TextView
    private lateinit var detailstv: TextView

    private lateinit var newssports: CardView
    private lateinit var news: TextView
    private lateinit var hostelbtn: AppCompatButton

    private lateinit var sportsphoto: CardView
    private lateinit var photos: TextView
    private lateinit var imageSports: ImageView

    private lateinit var hostel : CardView
    private lateinit var contacts: TextView
    private lateinit var imagecontact: ImageView

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
        val view= inflater.inflate(R.layout.fragment_hostel, container, false)

        val hostelbtn =view.findViewById<AppCompatButton>(R.id.hostelbtn)
        hostelbtn.setOnClickListener {
            Toast.makeText(requireContext(), "Redirecting to Google Form", Toast.LENGTH_SHORT).show()
            openurl("https://docs.google.com/forms/d/e/1FAIpQLScb42zz3aVaZccHWggd84Ivc7hzU2BxFBpsERbO4133ypXHOQ/viewform")

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
        about = view.findViewById(R.id.about)
        tvabout = view.findViewById(R.id.tvabout)
        detailstv = view.findViewById(R.id.detailstv)

        tvabout.setOnClickListener {
            if (detailstv.visibility == View.GONE) {
                detailstv.visibility = View.VISIBLE
            } else {
                detailstv.visibility = View.GONE
            }
        }

        newssports = view.findViewById(R.id.newssports)
        news = view.findViewById(R.id.news)
        hostelbtn = view.findViewById(R.id.hostelbtn)

        news.setOnClickListener {
            if (hostelbtn.visibility == View.GONE) {
                hostelbtn.visibility = View.VISIBLE
            } else {
                hostelbtn.visibility = View.GONE
            }
        }

        sportsphoto = view.findViewById(R.id.sportsphoto)
        photos = view.findViewById(R.id.photos)
        imageSports = view.findViewById(R.id.imageSports)
        photos.setOnClickListener {
            if (imageSports.visibility == View.GONE) {
                imageSports.visibility = View.VISIBLE
            } else {
                imageSports.visibility = View.GONE
            }
        }

        hostel = view.findViewById(R.id.hostel)
        contacts = view.findViewById(R.id.contacts)
        imagecontact = view.findViewById(R.id.imagecontact)
        contacts.setOnClickListener {
            if (imagecontact.visibility == View.GONE) {
                imagecontact.visibility = View.VISIBLE
            } else {
                imagecontact.visibility = View.GONE
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
         * @return A new instance of fragment Hostel.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Hostel().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}