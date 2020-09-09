package com.example.tp1calculatrice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn0.setOnClickListener {
            //Toast.makeText(this, btn0.text,Toast.LENGTH_LONG).show()
            var v= textShow.text;
            if(!v.equals(0)){
                //textShow.setText(0);
                textShow.setText(v.toString()+""+btn0.text);
            }

        }

    }
}
