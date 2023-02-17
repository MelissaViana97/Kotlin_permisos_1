package com.example.myapplication_dms_guia4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.Manifest
import android.content.pm.PackageManager
import androidx.core.content.ContextCompat
import android.util.Log

private val TAG="Practica 04-permisos"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configurarPermmisos()
    }
    private fun configurarPermmisos(){
        val permission=ContextCompat.checkSelfPermission(this,Manifest.permission.RECORD_AUDIO)
        if (permission !=PackageManager.PERMISSION_GRANTED){
            Log.i(TAG,"Permiso para grabar denegado")
        }
    }
}