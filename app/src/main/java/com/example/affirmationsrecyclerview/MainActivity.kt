package com.example.affirmationsrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmationsrecyclerview.adapter.ItemAdapter
import com.example.affirmationsrecyclerview.data.Datasource
import com.example.affirmationsrecyclerview.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerAdapter()

    }

    private fun recyclerAdapter() {
        val myDataset = Datasource().loadAffirmations()

        val recyclerView = binding.recyclerView
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true) //usado para valores fijos de recyclerView
    }
}