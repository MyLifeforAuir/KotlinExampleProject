package wanna.cu.kotlinexampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class MainActivity : AppCompatActivity(){
    lateinit var items: Array<String>
    val mData = arrayListOf<CardviewItem>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init_mData()

        val recyclerView = recyclerView
        var mainActivityRecyclerviewAdapter =MainActivityRecyclerviewAdapter(mData, applicationContext)
        recyclerView.adapter = mainActivityRecyclerviewAdapter
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.setHasFixedSize(true)
    }
    fun init_mData(){
        items = resources.getStringArray(R.array.main_menu_items)
        for(i in 0 until items.size) {
            Log.d("MainActivity.kt", "${items.get(i)}")
            mData.add(CardviewItem("TEST", items.get(i)))
        }
    }
}
