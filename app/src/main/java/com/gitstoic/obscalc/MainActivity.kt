package com.gitstoic.obscalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.gitstoic.obscalc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }
    val calculateBtn = findViewById<Button>(R.id.calc_btn)
    val eddOutput = findViewById<TextView>(R.id.EDD_output)
    val lmpInput = findViewById<EditText>(R.id.LMP_input)
    val tdInput = findViewById<EditText>(R.id.TD_input)
    val egaOutput = findViewById<TextView>(R.id.EGA_output)







}