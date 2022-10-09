package com.jimmy.englishportuguesevocabbuilderapp.data

import com.jimmy.englishportuguesevocabbuilderapp.R
import com.jimmy.englishportuguesevocabbuilderapp.model.AlWords

class Datasource {

    fun loadAlWords(): List<AlWords>{
        return listOf<AlWords>(
            AlWords(R.drawable.tropical),
            AlWords(R.drawable.animal),
            AlWords(R.drawable.carnival),
            AlWords(R.drawable.continental),
            AlWords(R.drawable.emotional),
            AlWords(R.drawable.facial),
            AlWords(R.drawable.fiscal),
            AlWords(R.drawable.professional),
            AlWords(R.drawable.unconditional),
            AlWords(R.drawable.alwords)
        )
    }
}