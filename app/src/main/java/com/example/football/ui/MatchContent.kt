package com.example.football.ui

import android.text.format.DateFormat
import java.util.ArrayList
import java.util.HashMap

object MatchContent {

    val ITEMS: MutableList<MatchItem> = ArrayList()

    val ITEM_MAP: MutableMap<String, MatchItem> = HashMap()

    private val COUNT = 25

    init {
        for (i in 1..COUNT) {
            addItem(createMatchItem(i))
        }
    }

    private fun addItem(item: MatchItem) {
        ITEMS.add(item)
        ITEM_MAP[item.id] = item
    }

    private fun createMatchItem(position: Int): MatchItem {
        return MatchItem(position.toString(), DateFormat(), "A$position", "B$position", "L", "C")
    }
    data class MatchItem(val id: String, val date : DateFormat, val team1 : String, val team2 : String, val league : String, val country : String) {
    }
}