package e.izawa.retrofit

import android.util.Log
import com.squareup.moshi.KotlinJsonAdapterFactory
import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class ItemRepository {

    private var itemService: ItemService

    init {
        val okHttpClient = OkHttpClient.Builder().build()
        val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
        val retrofit = Retrofit.Builder()
                .baseUrl("http://192.168.10.4:3000/")
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .client(okHttpClient)
                .build()
        itemService = retrofit.create(ItemService::class.java)
    }

    // エラー処理は省いています
    fun getItemList(callback: (ItemEntity) -> Unit) {
        itemService.items().enqueue(object : Callback<ItemEntity> {
            override fun onResponse(call: Call<ItemEntity>?, response: Response<ItemEntity>?) {
                response?.let {
                    if (response.isSuccessful) {
                        response.body()?.let {
                            callback(it)
                        }
                    }
                }
            }
            override fun onFailure(call: Call<ItemEntity>?, t: Throwable?) {}
        })
    }
}