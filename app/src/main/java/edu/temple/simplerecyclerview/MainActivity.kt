package edu.temple.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO Step 1: Reference RecyclerView object
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        //TODO Step 2: Provide a LayoutManager
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        //TODO Step 4: Provide a RecyclerView.Adapter
        val numbers = intArrayOf(12,20, 22, 24, 36, 48,50, 55, 60 , 70, 80)

        // Create an instance of the adapter
        val adapter = NumberDisplayAdapter(numbers)

        // Attach the adapter to the RecyclerView
        recyclerView.adapter = adapter
    }
}