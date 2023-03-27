package com.tensorflow.mediapipeandroiddemo.Fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import com.tensorflow.mediapipeandroiddemo.ImageSegmentation.FoodSegmentationActivity
import com.tensorflow.mediapipeandroiddemo.R
import com.tensorflow.mediapipeandroiddemo.gestureRecognition.SignLanguageLearnerActivity
import com.tensorflow.mediapipeandroiddemo.imageClassification.*
import com.tensorflow.mediapipeandroiddemo.objectDetection.PPEDetectionActivity

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

        //Classifications
        val landmarkClassificationNorthAmericaCardviewButton = view.findViewById<CardView>(R.id.LandmarkDetectionNorthAmericaCardview);
        landmarkClassificationNorthAmericaCardviewButton.setOnClickListener()
        {
            Log.d("landmarkClassificationNorthAmericaCardviewButton: ", "Selected")
            val intent = Intent (getActivity(), NorthAmericaLandmarkClassificationActivity::class.java)
            getActivity()?.startActivity(intent)

        }

        val landmarkClassificationSouthAmericaCardviewButton = view.findViewById<CardView>(R.id.LandmarkDetectionSouthAmericaCardview);
        landmarkClassificationSouthAmericaCardviewButton.setOnClickListener()
        {
            Log.d("landmarkClassificationSouthAmericaCardviewButton: ", "Selected")
            val intent = Intent (getActivity(), SouthAmericaLandmarkClassificationActivity::class.java)
            getActivity()?.startActivity(intent)

        }

        val landmarkClassificationAsiaCardviewButton = view.findViewById<CardView>(R.id.LandmarkDetectionAsiaCardview);
        landmarkClassificationAsiaCardviewButton.setOnClickListener()
        {
            Log.d("landmarkClassificationAsiaCardviewButton: ", "Selected")
            val intent = Intent (getActivity(), AsiaLandmarkClassificationActivity::class.java)
            getActivity()?.startActivity(intent)

        }

        val landmarkClassificationAntarticaCardviewButton = view.findViewById<CardView>(R.id.LandmarkDetectionAntarticaCardview);
        landmarkClassificationAntarticaCardviewButton.setOnClickListener()
        {
            Log.d("landmarkClassificationAntarticaCardviewButton: ", "Selected")
            val intent = Intent (getActivity(), AntarcticaLandmarkClassificationActivity::class.java)
            getActivity()?.startActivity(intent)

        }

        val landmarkClassificationEuropeCardviewButton = view.findViewById<CardView>(R.id.LandmarkDetectionEuropeCardview);
        landmarkClassificationEuropeCardviewButton.setOnClickListener()
        {
            Log.d("object Detection cardview: ", "Selected")
            val intent = Intent (getActivity(), EuropeLandmarkClassificationActivity::class.java)
            getActivity()?.startActivity(intent)

        }

        val landmarkClassificationAfricaCardviewButton = view.findViewById<CardView>(R.id.LandmarkDetectionAfricaCardview);
        landmarkClassificationAfricaCardviewButton.setOnClickListener()
        {
            Log.d("object Detection cardview: ", "Selected")
            val intent = Intent (getActivity(), AfricaLandmarkClassificationActivity::class.java)
            getActivity()?.startActivity(intent)

        }



        //Image Segmentation
        val foodSegmentationCarviewButton = view.findViewById<CardView>(R.id.foodSegmentationCardview);
        foodSegmentationCarviewButton.setOnClickListener()
        {
            Log.d("Food Segmentation cardview: ", "Selected")
            val intent = Intent (getActivity(), FoodSegmentationActivity::class.java)
            getActivity()?.startActivity(intent)
        }

        //Object Detection
        val PPEDectionCardviewButton = view.findViewById<CardView>(R.id.PPEDetectionCardview);
        PPEDectionCardviewButton.setOnClickListener()
        {
            Log.d("PPE detection cardview: ", "Selected")
            val intent = Intent (getActivity(), PPEDetectionActivity::class.java)
            getActivity()?.startActivity(intent)
        }


        //Hand Landmark
        val SignLanguageLearnerActivityCardviewButton = view.findViewById<CardView>(R.id.SignLanguageLearnerCardview);
        SignLanguageLearnerActivityCardviewButton.setOnClickListener()
        {
            Log.d("gesture Recognition cardview: ", "Selected")
            val intent = Intent (getActivity(), SignLanguageLearnerActivity::class.java)
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