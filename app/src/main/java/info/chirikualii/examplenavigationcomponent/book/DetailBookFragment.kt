package info.chirikualii.examplenavigationcomponent.book

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import info.chirikualii.examplenavigationcomponent.Constant
import info.chirikualii.examplenavigationcomponent.R
import kotlinx.android.synthetic.main.fragment_detail_book.*

/**
 * A simple [Fragment] subclass.
 */
class DetailBookFragment : Fragment() {


    var bookName : String=""
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_book, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bookName = arguments?.getString(Constant.BOOK_NAME) ?: ""
        setupView(view)
    }

    private fun setupView(view: View) {
        tv_result.text = bookName
    }

}
