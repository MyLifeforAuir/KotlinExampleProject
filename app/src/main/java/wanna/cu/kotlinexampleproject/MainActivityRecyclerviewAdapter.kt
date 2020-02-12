package wanna.cu.kotlinexampleproject

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.widget.ImageViewCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.cardview_items.view.*

class MainActivityRecyclerviewAdapter(data:List<CardviewItem>, val context:Context) : RecyclerView.Adapter<MainActivityRecyclerviewAdapter.MyViewHolder>() {
    val mData = data
    //lateinit var myCardViewClickListener:MyCardViewClickListener
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageview_cardview = itemView.findViewById<AppCompatImageView>(R.id.imageview_cardview)
        val textview_cardview = itemView.findViewById<TextView>(R.id.textview_cardview)
        val cardview = itemView.cardview


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.cardview_items, parent, false))
    }

    override fun getItemCount(): Int {
        return mData.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            Log.d("onBindViewHolder()", "${position}")
            holder.imageview_cardview.setImageResource(R.drawable.ic_android_black_24dp)
            holder.textview_cardview.setText(mData[position].text)
            holder.cardview.setOnClickListener(object : View.OnClickListener{
                override fun onClick(p0: View?) {
                  /*  if(myCardViewClickListener != null){
                        myCardViewClickListener.onMyCardViewClicked()
                    }*/
                        Toast.makeText(context, "${holder.textview_cardview.text} Clicked!", Toast.LENGTH_SHORT).show()
                    context.startActivity(Intent(context, FirstContainer::class.java).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK).addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP).putExtra("item", "${holder.textview_cardview.text}"))

                }
            })

    }
  /*  fun setOnMyCardViewClickListener(myCardViewClickListener: MyCardViewClickListener){
        if (myCardViewClickListener is MyCardViewClickListener){
           this.myCardViewClickListener =  myCardViewClickListener
        }
    }
    interface MyCardViewClickListener{
        fun onMyCardViewClicked()
    }*/
}
