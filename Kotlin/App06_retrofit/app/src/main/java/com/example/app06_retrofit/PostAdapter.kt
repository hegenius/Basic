package com.example.app06_retrofit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.app06_retrofit.databinding.ItemList2Binding


class PostAdapter(val postList: MutableList<Post>)
    :RecyclerView.Adapter<PostAdapter.PostHolder>(){
    class PostHolder(val binding: ItemList2Binding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        return PostHolder(ItemList2Binding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onBindViewHolder(holder: PostHolder, position: Int) {
        val post = postList[position]
        holder.binding.txUserId.text = post.userId.toString()
        holder.binding.txId2.text = post.id.toString()
        holder.binding.txTitle2.text = post.title
        holder.binding.txBody.text = post.body
    }
}