package com.jimmy.englishportuguesevocabbuilderapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.jimmy.englishportuguesevocabbuilderapp.adapter.ItemAdapter
import com.jimmy.englishportuguesevocabbuilderapp.data.DatasourceAbout
import com.jimmy.englishportuguesevocabbuilderapp.databinding.FragmentAboutBinding


class AboutFragment : Fragment() {

    private lateinit var binding: FragmentAboutBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_about, container, false)


        val myDataset = DatasourceAbout().loadAboutWords()

        val recyclerView = binding.recyclerViewAbout

        recyclerView.adapter = ItemAdapter(this, myDataset)

        recyclerView.setHasFixedSize(true)

        return binding.root

    }


}