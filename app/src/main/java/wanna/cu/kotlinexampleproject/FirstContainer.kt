package wanna.cu.kotlinexampleproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.toast.*
import kotlinx.android.synthetic.main.widgets.*
import wanna.cu.kotlinexampleproject.toast.Toast_ColoredToast
import wanna.cu.kotlinexampleproject.toast.Toast_CustomToast
import wanna.cu.kotlinexampleproject.toast.Toast_PositioningToast
import wanna.cu.kotlinexampleproject.toast.Toast_SimpleToast
import wanna.cu.kotlinexampleproject.widgets.*

class FirstContainer : AppCompatActivity() {
lateinit var mExtra:String
    lateinit var myOnClickListener: View.OnClickListener
    lateinit var  curIntentItem:String
    lateinit var newIntent:Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        when(intent.getStringExtra("item")){
            "Widgets" -> setContentView(R.layout.widgets)
            "Toast" -> setContentView(R.layout.toast)
            else -> setContentView(R.layout.myfirstcontainer)
        }



        curIntentItem = intent.getStringExtra("item")
        init_myOnClickListener()
        init_setOnClickListener()

    }
    fun init_myOnClickListener(){
        when(curIntentItem){
            "Widgets" ->{
                myOnClickListener = View.OnClickListener {
                    when(it.id){
                        R.id.widgets_textview -> startActivity(Intent(this, Widgets_TextView::class.java))
                        R.id.widgets_edittext -> startActivity(Intent(this, Widgets_EditText::class.java))
                        R.id.widgets_button -> startActivity(Intent(this, Widgets_Button::class.java))
                        R.id.widgets_radiobutton->startActivity(Intent(this, Widgets_RadioButton::class.java))
                        R.id.widgets_autocompletetextview -> startActivity(Intent(this, Widgets_AutoCompleteTextView::class.java))
                        R.id.widgets_checkbox -> startActivity(Intent(this, Widgets_CheckBox::class.java))
                        R.id.widgets_checkedtextview -> startActivity(Intent(this, Widgets_CheckedTextView::class.java))
                        R.id.widgets_customcheckbox -> startActivity(Intent(this, Widgets_CustomCheckBox::class.java))
                        R.id.widgets_progressbar -> startActivity(Intent(this, Widgets_ProgressBar::class.java))
                        R.id.widgets_progressdialog -> startActivity(Intent(this, Widgets_ProgressDialog::class.java))
                        R.id.widgets_ratingbar -> startActivity(Intent(this, Widgets_RatingBar::class.java))
                        R.id.widgets_scrollview -> startActivity(Intent(this, Widgets_ScrollView::class.java))
                        R.id.widgets_spinner -> startActivity(Intent(this, Widgets_Spinner::class.java))
                        R.id.widgets_swtich -> startActivity(Intent(this, Widgets_Switch::class.java))
                        R.id.widgets_textswticher -> startActivity(Intent(this, Widgets_TextSwitcher::class.java))
                        R.id.widgets_togglebutton -> startActivity(Intent(this, Widgets_ToggleButton::class.java))
                    }
                }
            }
            "Toast" -> {
                myOnClickListener = View.OnClickListener {
                    when(it.id){
                        R.id.toast_coloredtoast -> startActivity(Intent(this, Toast_ColoredToast::class.java))
                        R.id.toast_customtoast -> startActivity(Intent(this, Toast_CustomToast::class.java))
                        R.id.toast_positioningtoast -> startActivity(Intent(this, Toast_PositioningToast::class.java))
                        R.id.toast_simpletoast ->startActivity(Intent(this, Toast_SimpleToast::class.java))
                    }
                }
            }
        }
    }
    fun init_setOnClickListener(){

        when(curIntentItem){
            "Widgets" -> {
                widgets_textview.setOnClickListener(myOnClickListener)
                widgets_autocompletetextview.setOnClickListener(myOnClickListener)
                widgets_button.setOnClickListener(myOnClickListener)
                widgets_checkbox.setOnClickListener(myOnClickListener)
                widgets_checkedtextview.setOnClickListener(myOnClickListener)
                widgets_customcheckbox.setOnClickListener(myOnClickListener)
                widgets_edittext.setOnClickListener(myOnClickListener)
                widgets_progressbar.setOnClickListener(myOnClickListener)
                widgets_progressdialog.setOnClickListener(myOnClickListener)
                widgets_radiobutton.setOnClickListener(myOnClickListener)
                widgets_ratingbar.setOnClickListener(myOnClickListener)
                widgets_scrollview.setOnClickListener(myOnClickListener)
                widgets_spinner.setOnClickListener(myOnClickListener)
                widgets_swtich.setOnClickListener(myOnClickListener)
                widgets_textswticher.setOnClickListener(myOnClickListener)
                widgets_togglebutton.setOnClickListener(myOnClickListener)
            }
            "Toast" ->{
                toast_coloredtoast.setOnClickListener(myOnClickListener)
                toast_customtoast.setOnClickListener(myOnClickListener)
                toast_positioningtoast.setOnClickListener(myOnClickListener)
                toast_simpletoast.setOnClickListener(myOnClickListener)
            }

        }
    }

}
