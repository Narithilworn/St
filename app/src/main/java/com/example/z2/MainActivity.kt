package com.example.z2

import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {

    private val cameraButtonLestener = View.OnClickListener {
        if(ActivityCompat.checkSelfPermission(
                this,
        android.Manifest.permission.CAMERA
        ) == PackageManager.PERMISSION_GRANTED){
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivity(intent)

    }
        else{
            ActivityCompat.requestPermissions(
                this,
        arrayOf(android.Manifest.permission.CAMERA)
        1
            )
    }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.CameraButton)
    }
}