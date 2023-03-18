package com.tensorflow.mediapipeandroiddemo.Fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import com.tensorflow.mediapipeandroiddemo.R
import com.tensorflow.mediapipeandroiddemo.imageClassification.ImageClassificationActivity
import com.tensorflow.mediapipeandroiddemo.objectDetection.ObjectDetectionActivity
import com.tensorflow.mediapipeandroiddemo.textClassification.TextClassificationActivity
import com.tensorflow.mediapipeandroiddemo.textEmbedder.TextEmbedderActivity

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TextFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TextFragment : Fragment() {
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
        val view: View = inflater.inflate(R.layout.fragment_text, container, false)

        val textClassificationCardviewButton = view.findViewById<CardView>(R.id.textClassificationCardview);
        textClassificationCardviewButton.setOnClickListener()
        {
            Log.d("Text Classification cardview: ", "Selected")
            val intent = Intent (getActivity(), TextClassificationActivity::class.java)
            getActivity()?.startActivity(intent)

        }

        val textEmbedderCardviewButton = view.findViewById<CardView>(R.id.textEmbedderCardview);
        textEmbedderCardviewButton.setOnClickListener()
        {
            Log.d("Text Embedder cardview: ", "Selected")
            val intent = Intent (getActivity(), TextEmbedderActivity::class.java)
            getActivity()?.startActivity(intent)
        }

        return view;

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment TextFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TextFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}