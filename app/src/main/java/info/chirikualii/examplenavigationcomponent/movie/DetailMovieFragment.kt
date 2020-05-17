package info.chirikualii.examplenavigationcomponent.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import info.chirikualii.examplenavigationcomponent.Constant

import info.chirikualii.examplenavigationcomponent.R
import kotlinx.android.synthetic.main.fragment_detail_movie.*


/**
 * A simple [Fragment] subclass.
 */
class DetailMovieFragment : Fragment() {

    var movieName = ""
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        movieName = arguments?.getString(Constant.MOVIE_NAME) ?: ""
        setupView()
    }

    private fun setupView() {
        tv_result.text = movieName
    }

}
