package wanna.cu.kotlinexampleproject.widgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.widgets_button.*
import wanna.cu.kotlinexampleproject.R
import wanna.cu.kotlinexampleproject.widgets.fab.Widgets_Button_Fab

class Widgets_Button : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.widgets_button)

        widgets_button_fab.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, Widgets_Button_Fab::class.java).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK).addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP))
        })
    }
}
