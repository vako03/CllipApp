package com.example.cllipapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private  lateinit var seekBar:SeekBar
    private  var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        seekBar = findViewById(R.id.sbCleaping)
        val play = findViewById<FloatingActionButton>(R.id.fabPlay)
        play.setOnClickListener {
            if (mediaPlayer==null){
                mediaPlayer = MediaPlayer.create(this,R.raw.applauding)
            }
            mediaPlayer?.start()
        }
        val pause = findViewById<FloatingActionButton>(R.id.fabPause)
        pause.setOnClickListener{
            mediaPlayer?.pause()
        }
        val stop = findViewById<FloatingActionButton>(R.id.fabStop)
        stop.setOnClickListener{
            mediaPlayer?.stop()
            mediaPlayer?.reset()
            mediaPlayer?.release()
            mediaPlayer = null
        }
    }
    private fun initializeSeekBar() =
        seekBar.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                TODO("Not yet implemented")
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                TODO("Not yet implemented")
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                TODO("Not yet implemented")
            }

        })
}

