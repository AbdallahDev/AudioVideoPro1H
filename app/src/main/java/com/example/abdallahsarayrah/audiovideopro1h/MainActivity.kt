package com.example.abdallahsarayrah.audiovideopro1h

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var mp = MediaPlayer()
            mp.setDataSource("http://www.mfiles.co.uk/mp3-downloads/emil-khoury-feel-my-love.mp3")
            mp.prepare()
            mp.start()
        }
    }
}
