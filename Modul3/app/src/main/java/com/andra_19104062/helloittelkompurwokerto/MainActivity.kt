package com.adam_19104078.helloittelkompurwokerto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnPage = findViewById<Button>(R.id.btnPage)
        btnPage.setOnClickListener{
            val intent = Intent(this, Halaman2Activity::class.java)
            startActivity(intent)
        }
    }

    fun printState(msg: String){
        Log.d("ActivityState",msg)
        Toast.makeText(applicationContext,msg, Toast.LENGTH_SHORT).show()
    }

    override fun onStart(){
        super.onStart()
        printState("Halaman satu On Start")
    }
    override fun onResume(){
        super.onResume()
        printState("Halaman satu On Resume")
    }
    override fun onPause(){
        super.onPause()
        printState("Halaman satu On Pause")
    }
    override fun onStop(){
        super.onStop()
        printState("Halaman satu On Stop")
    }
    override fun onRestart(){
        super.onRestart()
        printState("Halaman satu On Restart")
    }
    override fun onDestroy() {
        super.onDestroy()
        printState("Halaman satu On Destroy")
    }


}