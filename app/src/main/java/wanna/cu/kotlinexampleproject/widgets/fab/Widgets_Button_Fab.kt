package wanna.cu.kotlinexampleproject.widgets.fab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.widgets_button_fab.*
import wanna.cu.kotlinexampleproject.R

class Widgets_Button_Fab : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.widgets_button_fab)

        onclicklistenrInMain.setOnClickListener(View.OnClickListener {
            Toast.makeText(applicationContext, "OnClickListener!", Toast.LENGTH_SHORT).show()
        })
    }
    fun myOnClick(v: View){
        Toast.makeText(applicationContext, "myOnClick Function!", Toast.LENGTH_SHORT).show()
    }
}
