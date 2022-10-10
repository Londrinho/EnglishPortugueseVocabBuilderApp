package com.jimmy.englishportuguesevocabbuilderapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.jimmy.englishportuguesevocabbuilderapp.adapter.ItemAdapterAl
import com.jimmy.englishportuguesevocabbuilderapp.data.Datasource
import com.jimmy.englishportuguesevocabbuilderapp.databinding.FragmentAlBinding


class AlFragment : Fragment() {

    private lateinit var binding: FragmentAlBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_al, container, false)

        val myDataset = Datasource().loadAlWords()

        val recyclerView = binding.recyclerViewOne

        recyclerView.adapter = ItemAdapterAl(this, myDataset)

        recyclerView.setHasFixedSize(true)

        return binding.root

    }


}