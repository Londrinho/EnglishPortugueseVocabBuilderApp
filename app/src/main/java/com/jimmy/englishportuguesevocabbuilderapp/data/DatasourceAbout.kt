package com.jimmy.englishportuguesevocabbuilderapp.data

import com.jimmy.englishportuguesevocabbuilderapp.R
import com.jimmy.englishportuguesevocabbuilderapp.model.AboutWords

class DatasourceAbout {
    fun loadAboutWords(): List<AboutWords>{
        return listOf<AboutWords>(
            AboutWords(R.drawable.abouteng),
            AboutWords(R.drawable.sobreport)
        )
    }

}