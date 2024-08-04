package com.example.college_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintSet.Constraint
import androidx.constraintlayout.widget.ConstraintSet.Layout

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Sport.newInstance] factory method to
 * create an instance of this fragment.
 */
class Sport : Fragment() {

    private lateinit var about: CardView
    private lateinit var tvabout: TextView
    private lateinit var detailstv: TextView

    private lateinit var newssports: CardView
    private lateinit var news: TextView
    private lateinit var imageSagar: ImageView
    private lateinit var imagevishali: ImageView
    private lateinit var imageholay: ImageView

    private lateinit var sportsphoto: CardView
    private lateinit var photos: TextView
    private lateinit var imageSports: ImageView
    private lateinit var imageSports2: ImageView
    private lateinit var imageSports67: ImageView



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
        val view = inflater.inflate(R.layout.fragment_sport, container, false)

    return view
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

        imageSagar = view.findViewById(R.id.imageSagar)
        imagevishali = view.findViewById(R.id.imagevishali)
        imageholay = view.findViewById(R.id.imageholay)


        news.setOnClickListener {
            if (imageSagar.visibility == View.GONE) {
                imageSagar.visibility = View.VISIBLE
                imagevishali.visibility = View.VISIBLE
                imageholay.visibility = View.VISIBLE
            } else {
                imageSagar.visibility = View.GONE
                imagevishali.visibility = View.GONE
                imageholay.visibility = View.GONE
            }
        }

        sportsphoto = view.findViewById(R.id.sportsphoto)
        photos = view.findViewById(R.id.photos)

        imageSports = view.findViewById(R.id.imageSports)
        imageSports2 = view.findViewById(R.id.imageSports2)
        imageSports67 = view.findViewById(R.id.imageSports67)


        photos.setOnClickListener {
            if (imageSports.visibility == View.GONE) {
                imageSports.visibility = View.VISIBLE
                imageSports2.visibility = View.VISIBLE
                imageSports67.visibility = View.VISIBLE
            } else {
                imageSports.visibility = View.GONE
                imageSports2.visibility = View.GONE
                imageSports67.visibility = View.GONE
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
         * @return A new instance of fragment Sport.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Sport().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}