package com.example.app06_list

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.app06_list.databinding.ItemFriendBinding

class FriendAdapter(val friendList: MutableList<Friend>)
    :RecyclerView.Adapter<FriendAdapter.FriendHolder>() {

    class FriendHolder(val binding: ItemFriendBinding):RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendAdapter.FriendHolder {
        return FriendHolder(ItemFriendBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: FriendAdapter.FriendHolder, position: Int) {
        val friend = friendList[position]
        holder.binding.profile.setImageResource(friend.resourceId)
        holder.binding.name.text = friend.name
        holder.binding.message.text = friend.message

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "friend 클릭 ${position}", Toast.LENGTH_SHORT).show()
        }
        
//        롱클릭 => 삭제
        holder.itemView.setOnLongClickListener {
            friendList.removeAt(position)
            notifyDataSetChanged()
            true
        }
    }

    override fun getItemCount(): Int {
        return friendList.size
    }
}