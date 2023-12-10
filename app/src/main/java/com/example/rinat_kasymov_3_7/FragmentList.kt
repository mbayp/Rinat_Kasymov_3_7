package com.example.rinat_kasymov_3_7

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rinat_kasymov_3_7.databinding.FragmentListBinding

class FragmentList : Fragment() {
    private lateinit var binding: FragmentListBinding
    private val musicList = arrayListOf(
        Music("1", "Lil Skies", "Lust", "2:36"),
        Music("2", "Dominic Fike", "Superstar Sh*t", "2:07"),
        Music("3", "Asap Rocky", "Everyday", "4:20"),
        Music("4", "Cochise", "Tell em", "3:00"),
        Music("5", "Major Lazer", "Light it up", "2:46"),
        Music("6", "Avicii", "Wake me up", "4:07"),
        Music("7", "Hotel Ugly", "Shut uo My Moms Calling", "2:15"),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = MusicAdapter(musicList,this::onClick)
        binding.recyclerView.adapter = adapter
    }

    private fun onClick(i: Int) {
        val intent= Intent(requireContext(),SecondActivity::class.java)
        startActivity(intent)}
}