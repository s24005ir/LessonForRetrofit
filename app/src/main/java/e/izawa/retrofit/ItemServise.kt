package e.izawa.retrofit

import retrofit2.http.GET
import retrofit2.http.Query

interface ItemService {
    @GET("user")
    fun items(): retrofit2.Call<ItemEntity>
}