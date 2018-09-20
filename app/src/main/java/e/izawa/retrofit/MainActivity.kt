package e.izawa.retrofit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemRepository = ItemRepository()
        val listView = findViewById<ListView>(R.id._eventList)
        var eventlist:List<String>? = null

        itemRepository.getItemList { itemList ->
            Log.d("tubasa", "${itemList}")
            _id.text = itemList.id.toString()
            _name.text = itemList.name

            eventlist = itemList.eventList.map { event ->
                event.title
            }
            val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, eventlist)
            listView.adapter = adapter
        }
    }
}