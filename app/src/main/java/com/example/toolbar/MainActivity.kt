package com.example.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.miAddPerson -> Toast.makeText(this, "You added some contacts.", Toast.LENGTH_SHORT).show()
            R.id.miFavorite -> Toast.makeText(this, "You added something to favorites.", Toast.LENGTH_SHORT).show()
            R.id.miSettings -> Toast.makeText(this, "You adjusted some settings.", Toast.LENGTH_SHORT).show()
            R.id.miClose -> finish()
            R.id.miFeedback -> Toast.makeText(this, "You gave some feedback.", Toast.LENGTH_SHORT).show()
        }
        return true
    }

}