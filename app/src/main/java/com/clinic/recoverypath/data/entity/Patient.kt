package com.clinic.recoverypath.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "patients")
data class Patient(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val age: Int,
    val admissionDate: Long = System.currentTimeMillis(),
    val lastRelapseDate: Long? = null,
    val pinHash: String,
    val isActive: Boolean = true,
    val clinicalNotes: String = ""
)
