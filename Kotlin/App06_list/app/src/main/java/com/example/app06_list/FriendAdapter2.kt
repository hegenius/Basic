package com.example.app06_list

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.app06_list.databinding.ItemFriendBinding

class FriendAdapter2(val friendList2:MutableList<Friend>)
    :RecyclerView.Adapter<FriendAdapter2.Holder>() {

//// 인터페이스 선언
    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
    interface OnLongItemClickListener {
        fun onLongItemClick(position: Int)
    }
////

    var onItemClickListener:OnItemClickListener? = null
    var onLongItemClickListener:OnLongItemClickListener? = null

    inner class Holder(val binding: ItemFriendBinding):RecyclerView.ViewHolder(binding.root) {
        init {
            itemView.setOnClickListener{
                onItemClickListener?.onItemClick(adapterPosition)
            }
            itemView.setOnLongClickListener {
                onLongItemClickListener?.onLongItemClick(adapterPosition)
                true
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendAdapter2.Holder {
        return Holder(ItemFriendBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: FriendAdapter2.Holder, position: Int) {
        val friend: Friend = friendList2[position]
        holder.binding.profile.setImageResource(friend.resourceId)
        holder.binding.name.text = friend.name
        holder.binding.message.text = friend.message
    }

    override fun getItemCount(): Int {
        return friendList2.size
    }
}