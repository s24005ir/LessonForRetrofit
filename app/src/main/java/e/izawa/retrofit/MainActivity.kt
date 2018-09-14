package e.izawa.retrofit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemRepository = ItemRepository()

        itemRepository.getItemList { itemList ->
            Log.d("tubasa", "$itemList")
            _id.text = itemList[0].user_id.toString()
            _title.text = itemList[0].user_name
        }
    }
}