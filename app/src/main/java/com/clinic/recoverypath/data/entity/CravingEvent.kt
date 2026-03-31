package com.clinic.recoverypath.data.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "craving_events",
    foreignKeys = [ForeignKey(
        entity = Patient::class,
        parentColumns = ["id"],
        childColumns = ["patientId"],
        onDelete = ForeignKey.CASCADE
    )]
)
data class CravingEvent(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val patientId: Int,
    val timestamp: Long = System.currentTimeMillis(),
    val intensity: Int,
    val durationMinutes: Int,
    val trigger: String,
    val copingStrategy: String,
    val resistedSuccessfully: Boolean
)
