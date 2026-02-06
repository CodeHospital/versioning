package com.codehospital.versioning.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.codehospital.versioning.Versioning

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val versionName = Versioning.getVersionName(project, "release")
        val versionCode = Versioning.getVersionCode(project, "release")
        setContent {
            App(versionName, versionCode)
        }
    }
}

@Composable
fun App(versionName: String, versionCode: Int) {
    MaterialTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.padding(24.dp)) {
                Text(text = "Versioning Plugin Sample")
                Text(text = "versionName: $versionName")
                Text(text = "versionCode: $versionCode")
            }
        }
    }
}
