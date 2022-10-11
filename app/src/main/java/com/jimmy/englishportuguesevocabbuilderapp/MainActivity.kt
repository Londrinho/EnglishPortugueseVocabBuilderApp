package com.jimmy.englishportuguesevocabbuilderapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.onNavDestinationSelected
import com.jimmy.englishportuguesevocabbuilderapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

//        val navController = this.findNavController(R.id.myHostFragment)
//        NavigationUI.setupActionBarWithNavController(this,navController)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.overflow_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val navController = findNavController(R.id.myHostFragment)
        return item.onNavDestinationSelected(navController) || super.onOptionsItemSelected(item)
    }
//    override fun onSupportNavigateUp(): Boolean {
//        val navController = this.findNavController(R.id.myHostFragment)
//        return navController.navigateUp()
//    }
}