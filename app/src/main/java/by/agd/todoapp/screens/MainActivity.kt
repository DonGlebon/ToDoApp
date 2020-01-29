package by.agd.todoapp.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.agd.todoapp.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
    }
}
