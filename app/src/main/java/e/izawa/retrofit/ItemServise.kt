package e.izawa.retrofit

import retrofit2.http.GET
import retrofit2.http.Query

interface ItemService {
    @GET("users")
    fun items(): retrofit2.Call<List<ItemEntity>>
}