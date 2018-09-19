package e.izawa.retrofit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemRepository = ItemRepository()
        val updateButton = findViewById<Button>(R.id.update)

        updateButton.setOnClickListener {
            itemRepository.getItemList { itemList ->
                Log.d("tubasa", "$itemList")
                _id.text = itemList[0].id.toString()
                _name.text = itemList[0].name
            }
        }
    }
}