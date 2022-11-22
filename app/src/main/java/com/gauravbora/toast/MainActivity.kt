package com.gauravbora.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.gauravbora.toast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.button1.setOnClickListener{
            Toast.makeText(this,"THis Is A Normal Toast",Toast.LENGTH_SHORT).show()
        }



        binding.button2.setOnClickListener{
            Toast(this).apply {
                duration=Toast.LENGTH_SHORT

                view=layoutInflater.inflate(R.layout.custom_toast_view,findViewById(R.id.clToast))
                    .apply { setGravity(Gravity.CENTER_VERTICAL,0,1970) }
                    show()

            }
        }

    }
}