package info.chirikualii.examplenavigationcomponent.food

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import info.chirikualii.examplenavigationcomponent.Constant

import info.chirikualii.examplenavigationcomponent.R
import kotlinx.android.synthetic.main.fragment_food.*

/**
 * A simple [Fragment] subclass.
 */
class FoodFragment : Fragment() {

    var navController : NavController?=null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_food, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        setupView()
    }

    private fun setupView() {

        btn_next.setOnClickListener {
            if(edt_food.text.toString().isNotEmpty()){
                val bundle = Bundle()
                bundle.putString(Constant.FOOD_NAME,edt_food.text.toString())

                navController?.navigate(R.id.action_foodFragment_to_detailFoodFragment,bundle)

            }
        }

        btn_cancel.setOnClickListener {
            activity?.onBackPressed()
        }
    }

}
