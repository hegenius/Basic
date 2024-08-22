package com.example.app06

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.app06.databinding.ItemPersonBinding


class PersonAdapter2(val personList2: MutableList<Person2>)
    :RecyclerView.Adapter<PersonAdapter2.Holder>() {
    inner class Holder(val binding: ItemPersonBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
//              클릭 이벤트
            itemView.setOnClickListener {
                val position = adapterPosition
                Toast.makeText(itemView.context, "클릭 Holder $position", Toast.LENGTH_SHORT).show()
            }
//              롱 클릭 이벤트
            itemView.setOnLongClickListener {
                val position = adapterPosition
                personList2.removeAt(position)
                notifyDataSetChanged()
                true
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(ItemPersonBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return personList2.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val person = personList2.get(position)
        holder.binding.tvName.text = person.name
        holder.binding.tvPhone.text = person.phone
    }
}