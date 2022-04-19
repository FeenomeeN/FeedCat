package com.example.feedthecat.screen.history

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.feedthecat.R
import com.example.feedthecat.domain.model.DayStat
import java.text.SimpleDateFormat
import java.util.*

class HistoryAdapter(private val list: List<DayStat>) :
    RecyclerView.Adapter<HistoryAdapter.HistoryItemViewHolder>() {

    inner class HistoryItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val date: TextView = view.findViewById(R.id.date)
        val text: TextView = view.findViewById(R.id.text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryItemViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_history_item, parent, false)
        return HistoryItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: HistoryItemViewHolder, position: Int) {
        val item = list[position]

        holder.date.text = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(
            Date(item.day * 86400000)
        )
        holder.text.text = item.daySatiety.toString()
    }

    override fun getItemCount() = list.size
}