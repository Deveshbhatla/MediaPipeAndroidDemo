package com.tensorflow.mediapipeandroiddemo.Fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RelativeLayout
import androidx.cardview.widget.CardView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.tensorflow.mediapipeandroiddemo.R
import com.tensorflow.mediapipeandroiddemo.gestureRecognition.GestureRecognitionActivity
import com.tensorflow.mediapipeandroiddemo.imageClassification.ImageClassificationActivity
import com.tensorflow.mediapipeandroiddemo.imageEmbedder.ImageEmbedderActivity
import com.tensorflow.mediapipeandroiddemo.objectDetection.ObjectDetectionActivity
import kotlinx.coroutines.Dispatchers.Main

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [VisionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class VisionFragment : Fragment() {
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
    ): View {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_vision, container, false)
        //  view.findViewById<Button>(R.id.button1).setOnClickListener()
        val objectDetectionCardviewButton = view.findViewById<CardView>(R.id.objectDetectionCardview);
        objectDetectionCardviewButton.setOnClickListener()
        {
            Log.d("object Detection cardview: ", "Selected")
            val intent = Intent (getActivity(), ObjectDetectionActivity::class.java)
            getActivity()?.startActivity(intent)

        }

        val imageClassificationCarviewButton = view.findViewById<CardView>(R.id.imageClassificationCardview);
        imageClassificationCarviewButton.setOnClickListener()
        {
            Log.d("Image Classification cardview: ", "Selected")
            val intent = Intent (getActivity(), ImageClassificationActivity::class.java)
            getActivity()?.startActivity(intent)
        }

        val imageEmbedderCardviewButton = view.findViewById<CardView>(R.id.imageEmbedderCardview);
        imageEmbedderCardviewButton.setOnClickListener()
        {
            Log.d("image Embedder cardview: ", "Selected")
            val intent = Intent (getActivity(), ImageEmbedderActivity::class.java)
            getActivity()?.startActivity(intent)
        }

        val gestureRecognitionCardviewButton = view.findViewById<CardView>(R.id.gestureRecognitionCardview);
        gestureRecognitionCardviewButton.setOnClickListener()
        {
            Log.d("gesture Recognition cardview: ", "Selected")
            val intent = Intent (getActivity(), GestureRecognitionActivity::class.java)
            getActivity()?.startActivity(intent)
        }

        // Return the fragment view/layout
        return view
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment VisionFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            VisionFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

}