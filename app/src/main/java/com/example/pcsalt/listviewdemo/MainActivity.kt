package com.example.pcsalt.listviewdemo

import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var lvName: ListView
    private var name = arrayOf(
        "Android", "iOS", "BlackBerry", "Windows Phone",
        "Symbian", "Bada"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lvName = findViewById(R.id.lv_Name)
        lvName.adapter = ArrayAdapter(
            this@MainActivity,
            android.R.layout.simple_list_item_1, name
        )
        lvName.onItemClickListener =
            OnItemClickListener { _, _, position, _ ->
                Toast.makeText(
                    this@MainActivity,
                    name[position],
                    Toast.LENGTH_SHORT
                ).show()
            }
    }
}