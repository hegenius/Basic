package com.example.app06_1

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.app06_1.databinding.ItemPhoneBinding

class PhoneAdapter(val phoneList:MutableList<Phone>)
    :RecyclerView.Adapter<PhoneAdapter.PhoneHolder>() {
//        인터페이스 구현
        interface OnItemClickListener {
            fun onItemClick(pos: Int)
        }
    var onItemClickListener:OnItemClickListener? = null

//    추가
    fun addItem(phone:Phone) {
        phoneList.add(phone)
    Log.d("phone_interface : ", "add : ${phone.name}")
        notifyDataSetChanged()
    }

//    수정
    fun updateItem(phone: Phone, position: Int) {  // phone : 수정할 내용
        val p = phoneList[position]  // p => 기존 내용
        p.name = phone.name
        p.tel = phone.tel
        notifyDataSetChanged()
    }

//    삭제
    fun removeItem(position:Int) {
        phoneList.removeAt(position)
        notifyDataSetChanged()
    }

    inner class PhoneHolder(val binding: ItemPhoneBinding)
        :RecyclerView.ViewHolder(binding.root) {
//    이벤트 처리
        init {
            itemView.setOnClickListener { // 인터페이스 구현
                onItemClickListener?.onItemClick(adapterPosition) // adapterPosition : 선택된 위치값 알수 있음
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhoneAdapter.PhoneHolder {
        return PhoneHolder(ItemPhoneBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: PhoneAdapter.PhoneHolder, position: Int) {
        val person = phoneList.get(position)
        holder.binding.tvName.text = person.name
        holder.binding.tvPhone.text = person.tel
    }

    override fun getItemCount(): Int {
        return phoneList.size
    }
}









