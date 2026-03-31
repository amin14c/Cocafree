package com.clinic.recoverypath.data.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "daily_checkins",
    foreignKeys = [ForeignKey(
        entity = Patient::class,
        parentColumns = ["id"],
        childColumns = ["patientId"],
        onDelete = ForeignKey.CASCADE
    )]
)
data class DailyCheckIn(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val patientId: Int,
    val timestamp: Long = System.currentTimeMillis(),
    val moodScore: Int,
    val cravingIntensity: Int,
    val sleepQuality: Int,
    val anxietyLevel: Int,
    val physicalActivity: Boolean = false,
    val notes: String = ""
)
