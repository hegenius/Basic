package com.example.app06_retrofit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.app06_retrofit.databinding.ItemListBinding

class PhotoAdapter(val photoList:MutableList<Photo>)
    :RecyclerView.Adapter<PhotoAdapter.PhotoHolder>() {
    class PhotoHolder(val binding: ItemListBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoAdapter.PhotoHolder {
        return PhotoHolder(ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: PhotoAdapter.PhotoHolder, position: Int) {
        val photo = photoList.get(position)
        // drawable 이미지는 자체적으로 int 형으로 변경되서 들어옴
//        holder.binding.imageView.setImageResource(R.drawable.ic_launcher_background)
        Glide.with(holder.itemView) // bitmap 코드값으로 저장
            .load(photo.thumbnailUrl)
            .into(holder.binding.imageView)
        holder.binding.txId.text = photo.id.toString()
        holder.binding.txTitle.text = photo.title
        holder.binding.txUrl.text = photo.url
    }

    override fun getItemCount(): Int {
        return photoList.size
    }
}