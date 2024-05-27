package com.example.projekf

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
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
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Find the ImageView by its ID
        val imageViewH2 = view.findViewById<ImageView>(R.id.imageViewH2)
        val textViewH4 = view.findViewById<TextView>(R.id.textViewH4)
        val imageViewH4 = view.findViewById<ImageView>(R.id.imageViewH4)

        val imageButtonH7 = view.findViewById<ImageView>(R.id.imageButtonH7)
        val imageButtonH8 = view.findViewById<ImageView>(R.id.imageButtonH8)
        val imageButtonH9 = view.findViewById<ImageView>(R.id.imageButtonH9)
        val imageButtonH10 = view.findViewById<ImageView>(R.id.imageButtonH10)
        val imageButtonH11 = view.findViewById<ImageView>(R.id.imageButtonH11)
        val imageButtonH12 = view.findViewById<ImageView>(R.id.imageButtonH12)
        val imageButtonH13 = view.findViewById<ImageView>(R.id.imageButtonH13)
        val imageButtonH14 = view.findViewById<ImageView>(R.id.imageButtonH14)
        val imageButtonH15 = view.findViewById<ImageView>(R.id.imageButtonH15)
        val imageButtonH16 = view.findViewById<ImageView>(R.id.imageButtonH16)
        val imageButtonH17 = view.findViewById<ImageView>(R.id.imageButtonH17)
        val imageButtonH18 = view.findViewById<ImageView>(R.id.imageButtonH18)

        // Set an OnClickListener to navigate to FavoriteActivity
        imageViewH2.setOnClickListener {
            val intent = Intent(activity, FavoriteActivity::class.java)
            startActivity(intent)

        }
        imageViewH4.setOnClickListener {
            val intent = Intent(activity, OfferActivity::class.java)
            startActivity(intent)
        }

        textViewH4.setOnClickListener {
            val intent = Intent(activity, OfferActivity::class.java)
            startActivity(intent)
        }

        imageButtonH7.setOnClickListener {
            val intent = Intent(activity, DetailActivity1::class.java)
            startActivity(intent)
        }
        imageButtonH8.setOnClickListener {
            val intent = Intent(activity, DetailActivity1::class.java)
            startActivity(intent)
        }
        imageButtonH9.setOnClickListener {
            val intent = Intent(activity, DetailActivity1::class.java)
            startActivity(intent)
        }
        imageButtonH10.setOnClickListener {
            val intent = Intent(activity, DetailActivity1::class.java)
            startActivity(intent)
        }
        imageButtonH11.setOnClickListener {
            val intent = Intent(activity, DetailActivity1::class.java)
            startActivity(intent)
        }
        imageButtonH12.setOnClickListener {
            val intent = Intent(activity, DetailActivity1::class.java)
            startActivity(intent)
        }
        imageButtonH13.setOnClickListener {
            val intent = Intent(activity, DetailActivity1::class.java)
            startActivity(intent)
        }
        imageButtonH14.setOnClickListener {
            val intent = Intent(activity, DetailActivity1::class.java)
            startActivity(intent)
        }
        imageButtonH15.setOnClickListener {
            val intent = Intent(activity, DetailActivity1::class.java)
            startActivity(intent)
        }
        imageButtonH16.setOnClickListener {
            val intent = Intent(activity, DetailActivity1::class.java)
            startActivity(intent)
        }
        imageButtonH17.setOnClickListener {
            val intent = Intent(activity, DetailActivity1::class.java)
            startActivity(intent)
        }
        imageButtonH18.setOnClickListener {
            val intent = Intent(activity, DetailActivity1::class.java)
            startActivity(intent)
        }
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}