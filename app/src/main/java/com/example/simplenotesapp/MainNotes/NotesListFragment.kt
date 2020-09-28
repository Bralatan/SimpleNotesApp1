package com.example.simplenotesapp.MainNotes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.simplenotesapp.R
import kotlinx.android.synthetic.main.notes_list_fragment.*

class NotesListFragment: Fragment() {

    protected lateinit var rootView: View
    lateinit var recyclerView: RecyclerView
    lateinit var newnoteButton: Button

    companion object {
        var TAG = NotesListFragment::class.java.simpleName
        const val ARG_POSITION: String = "positioin"

        fun newInstance(): NotesListFragment {
            var fragment =
                NotesListFragment();
            val args = Bundle()
            args.putInt(ARG_POSITION, 1)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        rootView = inflater.inflate(R.layout.notes_list_fragment, container, false);
        initView()
        return rootView
    }

    private fun initView(){
        initializeRecyclerView()
        initializeBtnNewNote()
    }

    private fun initializeBtnNewNote(){
        newnoteButton = rootView.findViewById(R.id.btn_newNote)
        newnoteButton.setOnClickListener {
            this.findNavController().navigate(R.id.action_notesListFragment3_to_simpleNoteFragment2)
        }
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