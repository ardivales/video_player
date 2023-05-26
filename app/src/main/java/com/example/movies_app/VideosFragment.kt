package com.example.movies_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movies_app.databinding.FragmentVideosBinding

class VideosFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_videos, container, false)
        val binding = FragmentVideosBinding.bind(view)
        binding.VideosRV.setHasFixedSize(true)
        binding.VideosRV.setItemViewCacheSize(10)
        binding.VideosRV.layoutManager = LinearLayoutManager(requireContext())
        binding.VideosRV.adapter = VideoAdapter(requireContext(), MainActivity.videoList)
        return view
    }

}