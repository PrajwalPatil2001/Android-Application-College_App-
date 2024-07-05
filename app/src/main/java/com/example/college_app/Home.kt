package com.example.college_app

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.FragmentTransaction
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Home.newInstance] factory method to
 * create an instance of this fragment.
 */
class Home : Fragment(R.layout.fragment_home) {


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

    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        // Inflate the layout for this fragment

       val v = inflater.inflate(R.layout.fragment_home, container, false)



        val ReadMoreone =v.findViewById<TextView>(R.id.textView40)
            ReadMoreone.setOnClickListener {
                val fragment_course=Mca_Fragment()
                val transaction:FragmentTransaction = requireFragmentManager().beginTransaction()
                transaction.replace(R.id.frame_container,fragment_course)
                transaction.addToBackStack(null)
                transaction.commit()
            }
        val ReadMore2 =v.findViewById<TextView>(R.id.textView43)
        ReadMore2.setOnClickListener {
            val fragment_mba=Mba()
            val transaction:FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.frame_container,fragment_mba)
            transaction.addToBackStack(null)
            transaction.commit()
        }
        val ReadMore3 =v.findViewById<TextView>(R.id.textView46)
        ReadMore3.setOnClickListener {
            val electrical_fragment=Electrical_Fragment()
            val transaction:FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.frame_container,electrical_fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }


        val button =v.findViewById<AppCompatButton>(R.id.allbotton)
        button.setOnClickListener {
            val all_fragment =Allprograms()
            val transaction:FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.frame_container,all_fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
        return v
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.autonomous,))
        imageList.add(SlideModel(R.drawable.graduation))
        imageList.add(SlideModel(R.drawable.companyes))
        imageList.add(SlideModel(R.drawable.admission))

        // Initialize the ImageSlider and set the image list
        val imageSlider = view.findViewById<ImageSlider>(R.id.imageSlider)
        imageSlider.setImageList(imageList)
    }


    companion object {

        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Home().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

}