package com.example.football.ui

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView

import com.example.football.databinding.FragmentMatchBinding

class MatchListRecyclerViewAdapter(
    private val values: List<MatchContent.MatchItem>
) : RecyclerView.Adapter<MatchListRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FragmentMatchBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.dateView.text = item.date.toString()
        holder.team1View.text = item.team1
        holder.team2View.text = item.team2
        holder.leagueView.text = item.league
        holder.countryView.text = item.country
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentMatchBinding) : RecyclerView.ViewHolder(binding.root) {
        val dateView: TextView = binding.date
        val team1View: TextView = binding.team1
        val team2View: TextView = binding.team2
        val leagueView: TextView = binding.league
        val countryView: TextView = binding.country
    }

}