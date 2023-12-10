package com.example.rinat_kasymov_3_7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rinat_kasymov_3_7.databinding.ItemMusicBinding

class MusicAdapter(
    private var musicList: ArrayList<Music>,
    private val onClick: (position: Int) -> Unit
) : RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        return MusicViewHolder(
            ItemMusicBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = musicList.size

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bind(musicList[position])
    }

    inner class MusicViewHolder(private var binding: ItemMusicBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Music) {
            itemView.setOnClickListener { onClick(adapterPosition) }
            binding.run {
                number.text = item.number
                musicLength.text = item.timer
                musicName.text = item.name
                musicSinger.text = item.singer
            }
        }
    }
}