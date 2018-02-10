package com.howtodothatinkotlin.buttonclickapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private val TAG = "MainActivity"
const val TEXT_CONTENTS = "text content"

class MainActivity : AppCompatActivity() {

    private var textView: TextView? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "onCreate : called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userInput = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textView)
        textView?.text = ""
        textView?.movementMethod = ScrollingMovementMethod()
        userInput.setText("")

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick : called")
                textView?.append(userInput.text)
                textView?.append("\n")
                userInput.text.clear()

            }
        })
    }

    override fun onStart() {
        Log.d(TAG, "onStart : called")

        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        Log.d(TAG, "onRestoreInstanceState : called")

        super.onRestoreInstanceState(savedInstanceState)
        val savedString = savedInstanceState?.getString(TEXT_CONTENTS, "")
        textView?.text = savedString
    }

    override fun onResume() {
        Log.d(TAG, "onResume : called")

        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "onPause : called")

        super.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        Log.d(TAG, "onSaveInstanceState : called")

        super.onSaveInstanceState(outState)
        outState?.putString(TEXT_CONTENTS, textView?.text.toString())
    }

    override fun onStop() {
        Log.d(TAG, "onStop : called")

        super.onStop()
    }

    override fun onRestart() {
        Log.d(TAG, "onRestart : called")

        super.onRestart()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy : called")

        super.onDestroy()
    }


}
