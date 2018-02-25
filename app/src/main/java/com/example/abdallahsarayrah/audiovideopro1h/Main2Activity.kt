package com.example.abdallahsarayrah.audiovideopro1h

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        videoView.setVideoPath("C:\\1.mp4")
//        videoView.setVideoURI(Uri.parse("https://ia800201.us.archive.org/22/items/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4"))
        videoView.setMediaController(MediaController(this))
        videoView.start()
    }
}
