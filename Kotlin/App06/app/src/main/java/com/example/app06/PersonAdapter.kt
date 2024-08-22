package com.example.app06

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.app06.databinding.ItemPersonBinding


class PersonAdapter(val personList:MutableList<Person>)
    :RecyclerView.Adapter<PersonAdapter.Holder>() {
//        개별항목(item_person)
    inner class Holder(val binding: ItemPersonBinding) : RecyclerView.ViewHolder(binding.root) {
        init { // == onBindViewHolder 안의 주석부분과 같은 의미
//              클릭 이벤트
            itemView.setOnClickListener {
                val position = adapterPosition
                Toast.makeText(itemView.context, "클릭 Holder $position", Toast.LENGTH_SHORT).show()
            }
//              롱 클릭 이벤트
            itemView.setOnLongClickListener {
                val position = adapterPosition
                personList.removeAt(position)
                notifyDataSetChanged()
                true
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(ItemPersonBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return personList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val person = personList.get(position)
        holder.binding.tvName.text = person.name
        holder.binding.tvPhone.text = person.phone

//        holder.itemView.setOnClickListener{
//            Toast.makeText(holder.itemView.context, "클릭$position", Toast.LENGTH_SHORT).show()
//        }
//        롱클릭 => 삭제
//        holder.itemView.setOnLongClickListener{
//            personList.removeAt(position)  // personList.remove(person)
//            notifyDataSetChanged()
//            true
//        }
    }
}