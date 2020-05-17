package info.chirikualii.examplenavigationcomponent.food

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import info.chirikualii.examplenavigationcomponent.Constant

import info.chirikualii.examplenavigationcomponent.R
import kotlinx.android.synthetic.main.fragment_detail_food.*

/**
 * A simple [Fragment] subclass.
 */
class DetailFoodFragment : Fragment() {

    var foodName = ""
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_food, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        foodName = arguments?.getString(Constant.FOOD_NAME) ?: ""
        setupView()
    }

    private fun setupView() {
        tv_result.text = foodName
    }

}
