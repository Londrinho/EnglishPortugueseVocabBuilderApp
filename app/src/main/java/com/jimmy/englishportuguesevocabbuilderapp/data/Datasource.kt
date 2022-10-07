package com.jimmy.englishportuguesevocabbuilderapp.data

import com.jimmy.englishportuguesevocabbuilderapp.R
import com.jimmy.englishportuguesevocabbuilderapp.model.AlWords

class Datasource {

    fun loadAlWords(): List<AlWords>{
        return listOf<AlWords>(
            AlWords(R.drawable.tropical),
            AlWords(R.drawable.animal),
        )
    }
}