package com.soufianekre.dunknews.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NewsObject(
    @PrimaryKey(autoGenerate = true)
    val id : Long,
    val title :String,
    val date:Long
)