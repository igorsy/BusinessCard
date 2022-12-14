package com.igor.businesscard

import android.app.Application
import com.igor.businesscard.data.AppDatabase
import com.igor.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy {AppDatabase.getDatabase(this)}
    val repository by lazy {BusinessCardRepository(database.businessDao())}
}