package com.clinic.recoverypath

import android.app.Application
import com.clinic.recoverypath.data.database.RecoveryDatabase

class RecoveryApplication : Application() {
    val database: RecoveryDatabase by lazy {
        RecoveryDatabase.getDatabase(this)
    }
}
