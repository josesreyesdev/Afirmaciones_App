package com.example.affirmationsrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.affirmationsrecyclerview.adapter.ItemAdapter
import com.example.affirmationsrecyclerview.data.Datasource
import com.example.affirmationsrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerAdapter()
    }

    private fun recyclerAdapter() {
        val myDataset = Datasource().loadAffirmations()

        val recycler = binding.recyclerView
        recycler.adapter = ItemAdapter(this, myDataset)
        recycler.setHasFixedSize(true) //usado para valores fijos de recyclerView
    }
}