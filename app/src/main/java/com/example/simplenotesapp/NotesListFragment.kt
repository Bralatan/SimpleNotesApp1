package com.example.simplenotesapp

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.*

class NotesListFragment: Fragment() {

    protected lateinit var rootView: View
    lateinit var recyclerView: RecyclerView

    companion object {
        var TAG = NotesListFragment::class.java.simpleName
        const val ARG_POSITION: String = "positioin"

        fun newInstance(): NotesListFragment {
            var fragment = NotesListFragment();
            val args = Bundle()
            args.putInt(ARG_POSITION, 1)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        onCreateComponent()
    }

    private fun onCreateComponent() {

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        rootView = inflater.inflate(R.layout.notes_list_fragment, container, false);
        initView()
        return rootView
    }

    private fun initView(){
        initializeRecyclerView()
    }

    private fun initializeRecyclerView() {
        recyclerView = rootView.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        //recyclerView.adapter = adapter
    }

/*
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(NotesListViewModel::class.java)

    }
*/

}