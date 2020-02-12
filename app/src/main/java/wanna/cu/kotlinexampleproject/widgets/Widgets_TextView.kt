package wanna.cu.kotlinexampleproject.widgets

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.customed_dialog.*
import kotlinx.android.synthetic.main.widgets_textview.*
import wanna.cu.kotlinexampleproject.R
import wanna.cu.kotlinexampleproject.widgets.fab.Widgets_TextView_Fab

class Widgets_TextView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.widgets_textview)

        val inflater = layoutInflater
        val dialogView = inflater.inflate(R.layout.customed_dialog, null)
        val alertDialogBuilder = AlertDialog.Builder(this)
            .setView(dialogView)
            .create()

        widgets_textview_mainkt.setOnClickListener(View.OnClickListener {
            dialogView.findViewById<TextView>(R.id.main_content).setText("""
                class MainActivity : AppCompatActivity() {

                    override fun onCreate(savedInstanceState: Bundle?) {
                        super.onCreate(savedInstanceState)
                        setContentView(R.layout.activity_main)
            """.trimIndent())
            alertDialogBuilder.show()
            alertDialogBuilder.window?.setLayout(1000, 1600)
        })
        widgets_textview_mainxml.setOnClickListener(View.OnClickListener {
            dialogView.findViewById<TextView>(R.id.main_content).setText("""
                <?xml version="1.0" encoding="utf-8"?>
                <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
                    xmlns:app="http://schemas.android.com/apk/res-auto"
                    xmlns:tools="http://schemas.android.com/tools"
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    tools:context=".MainActivity">
                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        app:layout_constraintStart_toStartOf="parent"
                        app:layou   t_constraintTop_toTopOf="parent"
                        app:layout_constraintEnd_toEndOf="parent"
                        app:layout_constraintBottom_toBottomOf="parent"
                        android:text="Hello Kotlin!"
                        android:textSize="30dp"
                        ></TextView>
                </androidx.constraintlayout.widget.ConstraintLayout>
            """.trimIndent())
            alertDialogBuilder.show()
            alertDialogBuilder.window?.setLayout(1000, 1600)
        })
        widgets_textview_fab.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, Widgets_TextView_Fab::class.java).addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        })
    }
}
