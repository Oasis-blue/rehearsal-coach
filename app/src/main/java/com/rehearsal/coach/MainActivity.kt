package com.rehearsal.coach

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.presagetech.smartspectra.SmartSpectraMode
import com.presagetech.smartspectra.SmartSpectraSdk
import com.presagetech.smartspectra.SmartSpectraView

class MainActivity : AppCompatActivity() {
    private lateinit var smartSpectraView: SmartSpectraView

    private val smartSpectraSdk: SmartSpectraSdk = SmartSpectraSdk.getInstance().apply {
        setApiKey(BuildConfig.PRESAGE_API_KEY)
        setSmartSpectraMode(SmartSpectraMode.CONTINUOUS)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        smartSpectraView = findViewById(R.id.smart_spectra_view)
    }
}
