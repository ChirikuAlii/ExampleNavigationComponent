package info.chirikualii.examplenavigationcomponent.book

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import info.chirikualii.examplenavigationcomponent.Constant
import info.chirikualii.examplenavigationcomponent.R
import kotlinx.android.synthetic.main.fragment_book.*
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class BookFragment : Fragment() {

    var navController : NavController?=null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_book, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        setupView(view)

    }

    private fun setupView(view: View) {

        btn_next.setOnClickListener {
            val bundle = Bundle()
            bundle.putString(Constant.BOOK_NAME,edt_book.text.toString())

            navController!!.navigate(
                R.id.action_bookFragment_to_detailBookFragment,
                bundle
            )
        }

        btn_cancel.setOnClickListener {
            activity?.onBackPressed()
        }

    }

}
