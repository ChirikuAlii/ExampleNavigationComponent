package info.chirikualii.examplenavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    var navController : NavController? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView(view)
    }

    private fun setupView(view: View) {
        navController = Navigation.findNavController(view)

        btn_book.setOnClickListener {
            navController!!.navigate(R.id.action_homeFragment_to_bookFragment)
        }
        btn_food.setOnClickListener {
            navController!!.navigate(R.id.action_homeFragment_to_foodFragment)
        }
        btn_movie.setOnClickListener {
            navController!!.navigate(R.id.action_homeFragment_to_movieFragment)
        }
    }


}
