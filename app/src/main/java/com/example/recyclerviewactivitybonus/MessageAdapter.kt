package com.example.recyclerviewactivitybonus

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewactivitybonus.databinding.ItemRowBinding
import java.util.ArrayList


class MessageAdapter(private val context: Context, private val messages: ArrayList<String>?):
    RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {

    class MessageViewHolder(val binding: ItemRowBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        return MessageViewHolder(ItemRowBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {

        val message = messages!![position]

        holder.binding.apply {
            tv.text=message
        }
    }

    override fun getItemCount() = messages!!.size

}