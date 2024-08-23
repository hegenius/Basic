package com.example.app06_retrofit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.app06_retrofit.databinding.ItemList3Binding

class CommentAdapter(val commentVoList:MutableList<CommentVo>)
    :RecyclerView.Adapter<CommentAdapter.CommentHolder>() {
    class CommentHolder(val binding: ItemList3Binding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentHolder {
       return CommentHolder(ItemList3Binding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return commentVoList.size
    }

    override fun onBindViewHolder(holder: CommentHolder, position: Int) {
        val comment = commentVoList[position]
        holder.binding.txPostId.text = comment.postId.toString()
        holder.binding.txId3.text = comment.id.toString()
        holder.binding.txName.text = comment.name
        holder.binding.txEmail.text = comment.email
        holder.binding.txBody2.text = comment.body
    }
}